package org.d3ifcool.tatacarashalat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import org.d3ifcool.tatacarashalat.Doa.DoaActivity;
import org.d3ifcool.tatacarashalat.Dzikir.DzikirActivity;
import org.d3ifcool.tatacarashalat.JadwalShalat.JadwalShalatActivity;
import org.d3ifcool.tatacarashalat.Shalat.ShalatActivity;
import org.d3ifcool.tatacarashalat.Wudhu.WudhuActivity;

public class MainActivity extends AppCompatActivity {

    RelativeLayout shalat,wudhu,doa,dzikir,jadwal,rate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        shalat = findViewById(R.id.btn_shalat);
        wudhu = findViewById(R.id.btn_wudhu);
        dzikir = findViewById(R.id.btn_dzikir);
        doa = findViewById(R.id.btn_doa);
        jadwal = findViewById(R.id.btn_jadwal_shalat);
        rate = findViewById(R.id.btn_rate);

        // Aksi Click Shalat
        shalat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShalat = new Intent(getApplicationContext(), ShalatActivity.class);
                startActivity(intentShalat);
            }
        });

        wudhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShalat = new Intent(getApplicationContext(), WudhuActivity.class);
                startActivity(intentShalat);
            }
        });

        dzikir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShalat = new Intent(getApplicationContext(), DzikirActivity.class);
                startActivity(intentShalat);
            }
        });

        doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShalat = new Intent(getApplicationContext(), DoaActivity.class);
                startActivity(intentShalat);
            }
        });

        jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentJadwal = new Intent(getApplicationContext(), JadwalShalatActivity.class);
                startActivity(intentJadwal);
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShalat = new Intent(getApplicationContext(), RateActivity.class);
                startActivity(intentShalat);
            }
        });
    }
}
