package org.d3ifcool.tatacarashalat.Doa;

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
import org.d3ifcool.tatacarashalat.Shalat.DetailIsya;

/**
 * Created by User on 11/21/2018.
 */

public class DoaSehariHari extends AppCompatActivity {

    ListView mListView;
    ImageView mImageView;

    int[] image={
            R.drawable.no1,
            R.drawable.no2,
            R.drawable.no3,
            R.drawable.no4,
            R.drawable.no5,
            R.drawable.no6,
            R.drawable.no7,
            R.drawable.no8,
            R.drawable.no9,
            R.drawable.no10,
            R.drawable.no11,
            R.drawable.no12,
            R.drawable.no13,
            R.drawable.no14,
            R.drawable.no15,
            R.drawable.no16,
            R.drawable.no17
    };

    String[] name = {
            "Doa Sebelum Makan",
            "Doa Sesudah Makan",
            "Doa Sesudah Minum",
            "Doa Sebelum Tidur",
            "Doa Ketika Mimpi Buruk",
            "Doa Ketika Mimpi Baik",
            "Doa Bangun Tidur",
            "Doa Masuk Kamar Mandi",
            "Doa Istinja",
            "Doa Keluar Kamar Mandi",
            "Doa Menjelang Shalat Subuh",
            "Doa Menyambut Pagi",
            "Doa Menyambut Petang",
            "Doa Ketika Bercermin",
            "Doa Masuk Rumah",
            "Doa Keluar Rumah",
            "Doa Menggunakan Pakaian"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalat_subuh);

        mListView = (ListView) findViewById(R.id.list_item_shalat_subuh);
        mImageView = (ImageView) findViewById(R.id.image_shalat);

        mImageView.setImageResource(R.drawable.banner_doa);

        DoaSehariHari.ListAdapter listAdapter = new DoaSehariHari.ListAdapter();
        mListView.setAdapter(listAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",1);
                    startActivity(myIntent);
                }

                else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",2);
                    startActivity(myIntent);
                }

                else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",3);
                    startActivity(myIntent);
                }
                else if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",4);
                    startActivity(myIntent);
                }

                else if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",5);
                    startActivity(myIntent);
                }

                else if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",6);
                    startActivity(myIntent);
                }

                else if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",7);
                    startActivity(myIntent);
                }
                else if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",8);
                    startActivity(myIntent);
                }

                else if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",9);
                    startActivity(myIntent);
                }

                else if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",10);
                    startActivity(myIntent);
                }

                else if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",11);
                    startActivity(myIntent);
                }
                else if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",12);
                    startActivity(myIntent);
                }
                else if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",13);
                    startActivity(myIntent);
                }

                else if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",14);
                    startActivity(myIntent);
                }

                else if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page",15);
                    startActivity(myIntent);
                }

                else if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaSehariHari.class);
                    myIntent.putExtra("page", 16);
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
