package org.d3ifcool.tatacarashalat.Shalat;

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

/**
 * Created by User on 11/21/2018.
 */

public class ShalatMaghrib extends AppCompatActivity {


    ListView mListView;
    ImageView mImageView;

    int[] image={
            R.drawable.shalat_langkah_niat_itidal_qunut,
            R.drawable.shalat_langkah_takbir,
            R.drawable.shalat_langkah_alfatihah_surat,
            R.drawable.shalat_langkah_alfatihah_surat,
            R.drawable.shalat_langkah_alfatihah_surat,
            R.drawable.shalat_langkah_rukuk,
            R.drawable.shalat_langkah_niat_itidal_qunut,
            R.drawable.shalat_langkah_sujud,
            R.drawable.shalat_langkah_duduk2sujud_tahiyatawal,
            R.drawable.shalat_langkah_sujud,
            R.drawable.shalat_langkah_alfatihah_surat,
            R.drawable.shalat_langkah_alfatihah_surat,
            R.drawable.shalat_langkah_rukuk,
            R.drawable.shalat_langkah_niat_itidal_qunut,
            R.drawable.shalat_langkah_sujud,
            R.drawable.shalat_langkah_duduk2sujud_tahiyatawal,
            R.drawable.shalat_langkah_sujud,
            R.drawable.shalat_langkah_duduk2sujud_tahiyatawal,
            R.drawable.shalat_langkah_alfatihah_surat,
            R.drawable.shalat_langkah_alfatihah_surat,
            R.drawable.shalat_langkah_rukuk,
            R.drawable.shalat_langkah_niat_itidal_qunut,
            R.drawable.shalat_langkah_sujud,
            R.drawable.shalat_langkah_duduk2sujud_tahiyatawal,
            R.drawable.shalat_langkah_sujud,
            R.drawable.shalat_langkah_tasyahudakhir,
            R.drawable.shalat_langkah_salam
    };

    String[] name = {
            "Niat",
            "Takbir",
            "Iftitah",
            "Al-Fatihah",
            "Surat Al-Quran",
            "Rukuk",
            "Itidal",
            "Sujud",
            "Duduk Diantara 2 Sujud",
            "Sujud",
            "Al-Fatihah",
            "Surat Al-Quran",
            "Rukuk",
            "Itidal",
            "Sujud",
            "Duduk Diantara 2 Sujud",
            "Sujud",
            "Tasyahud Awal",
            "Al-Fatihah",
            "Surat Al-Quran",
            "Rukuk",
            "Itidal",
            "Sujud",
            "Duduk Diantara 2 Sujud",
            "Sujud",
            "Tasyahud Akhir",
            "Salam"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalat_subuh);

        mListView = (ListView) findViewById(R.id.list_item_shalat_subuh);
        mImageView = (ImageView) findViewById(R.id.image_shalat);

        mImageView.setImageResource(R.drawable.banner_maghrib);

        ShalatMaghrib.ListAdapter listAdapter = new ShalatMaghrib.ListAdapter();
        mListView.setAdapter(listAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",1);
                    startActivity(myIntent);
                }

                else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",2);
                    startActivity(myIntent);
                }

                else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",3);
                    startActivity(myIntent);
                }
                else if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",4);
                    startActivity(myIntent);
                }

                else if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",5);
                    startActivity(myIntent);
                }

                else if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",6);
                    startActivity(myIntent);
                }

                else if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",7);
                    startActivity(myIntent);
                }
                else if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",8);
                    startActivity(myIntent);
                }

                else if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",9);
                    startActivity(myIntent);
                }

                else if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",10);
                    startActivity(myIntent);
                }

                else if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",11);
                    startActivity(myIntent);
                }
                else if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",12);
                    startActivity(myIntent);
                }
                else if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",13);
                    startActivity(myIntent);
                }

                else if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",14);
                    startActivity(myIntent);
                }

                else if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",15);
                    startActivity(myIntent);
                }

                else if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",16);
                    startActivity(myIntent);
                }

                else if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",17);
                    startActivity(myIntent);
                }

                else if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",18);
                    startActivity(myIntent);
                }

                else if (position == 19) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",19);
                    startActivity(myIntent);
                }

                else if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",20);
                    startActivity(myIntent);
                }

                else if (position == 21) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",21);
                    startActivity(myIntent);
                }

                else if (position == 22) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",22);
                    startActivity(myIntent);
                }

                else if (position == 23) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",23);
                    startActivity(myIntent);
                }

                else if (position == 24) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",24);
                    startActivity(myIntent);
                }

                else if (position == 25) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",25);
                    startActivity(myIntent);
                }

                else if (position == 26) {
                    Intent myIntent = new Intent(view.getContext(), DetailMaghrib.class);
                    myIntent.putExtra("page",26);
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
