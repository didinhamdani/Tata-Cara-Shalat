package org.d3ifcool.tatacarashalat.Wudhu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.d3ifcool.tatacarashalat.R;
import org.d3ifcool.tatacarashalat.Shalat.DetailAshar;

public class Wudhu extends AppCompatActivity {

    ListView mListView;
    ImageView mImageView;

    int[] image={
            R.drawable.wudhu_langkah_doa,
            R.drawable.wudhu_langkah_tangan,
            R.drawable.wudhu_langkah_mulut_hidung,
            R.drawable.wudhu_langkah_mulut_hidung,
            R.drawable.wudhu_langkah_muka,
            R.drawable.wudhu_langkah_lengan,
            R.drawable.wudhu_langkah_lengan,
            R.drawable.wudhu_langkah_kepala,
            R.drawable.wudhu_langkah_telinga,
            R.drawable.wudhu_langkah_kaki,
            R.drawable.wudhu_langkah_kaki,
            R.drawable.wudhu_langkah_doa
    };

    String[] name = {
            "Niat",
            "Telapak Tangan",
            "Berkumur",
            "Membasuh Hidung",
            "Membasuh Muka",
            "Membasuh Lengan Kanan",
            "Membasuh Lengan Kiri",
            "Membasuh Kepala",
            "Membasuh Kedua Telinga",
            "Mencuci Kaki Kanan",
            "Mencuci Kaki Kiri",
            "Membaca Doa"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalat_subuh);

        mListView = (ListView) findViewById(R.id.list_item_shalat_subuh);
        mImageView = (ImageView) findViewById(R.id.image_shalat);

        mImageView.setImageResource(R.drawable.banner_wudhu);

        Wudhu.ListAdapter listAdapter = new Wudhu.ListAdapter();
        mListView.setAdapter(listAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), DetailWudhu.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), DetailWudhu.class);
                    myIntent.putExtra("page",1);
                    startActivity(myIntent);
                }

                else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), DetailWudhu.class);
                    myIntent.putExtra("page",2);
                    startActivity(myIntent);
                }

                else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), DetailWudhu.class);
                    myIntent.putExtra("page",3);
                    startActivity(myIntent);
                }
                else if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), DetailWudhu.class);
                    myIntent.putExtra("page",4);
                    startActivity(myIntent);
                }

                else if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), DetailWudhu.class);
                    myIntent.putExtra("page",5);
                    startActivity(myIntent);
                }

                else if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), DetailWudhu.class);
                    myIntent.putExtra("page",6);
                    startActivity(myIntent);
                }

                else if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), DetailWudhu.class);
                    myIntent.putExtra("page",7);
                    startActivity(myIntent);
                }
                else if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), DetailWudhu.class);
                    myIntent.putExtra("page",8);
                    startActivity(myIntent);
                }

                else if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), DetailWudhu.class);
                    myIntent.putExtra("page",9);
                    startActivity(myIntent);
                }

                else if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), DetailWudhu.class);
                    myIntent.putExtra("page",10);
                    startActivity(myIntent);
                }

                else if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), DetailWudhu.class);
                    myIntent.putExtra("page",11);
                    startActivity(myIntent);
                }
            }
        });
    }

    class ListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.customlist_shalat, null);

            ImageView mImageview = view.findViewById(R.id.imageView);
            TextView mTextView = view.findViewById(R.id.textView);

            mImageview.setImageResource(image[position]);
            mTextView.setText(name[position]);
            return view;

        }
    }
}
