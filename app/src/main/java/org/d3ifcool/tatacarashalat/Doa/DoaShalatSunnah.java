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

/**
 * Created by User on 11/21/2018.
 */

public class DoaShalatSunnah extends AppCompatActivity {

    ListView mListView;
    ImageView mImageView;

    int[] image={
            R.drawable.no1,
            R.drawable.no2,
            R.drawable.no3,
            R.drawable.no4,
            R.drawable.no5,
            R.drawable.no6,
    };

    String[] name = {
            "Doa Setelah Shalat Sunnah Tahajud",
            "Doa Setelah Shalat Sunnah Dhuha",
            "Doa Setelah Shalat Sunnah Taubat",
            "Doa Setelah Shalat Sunnah Hajat",
            "Doa Setelah Shalat Sunnah Istikhoroh",
            "Doa Setelah Shalat Sunnah Witir"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalat_subuh);

        mListView = (ListView) findViewById(R.id.list_item_shalat_subuh);
        mImageView = (ImageView) findViewById(R.id.image_shalat);

        mImageView.setImageResource(R.drawable.banner_doa);

        DoaShalatSunnah.ListAdapter listAdapter = new DoaShalatSunnah.ListAdapter();
        mListView.setAdapter(listAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaShalatSunnah.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaShalatSunnah.class);
                    myIntent.putExtra("page",1);
                    startActivity(myIntent);
                }

                else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaShalatSunnah.class);
                    myIntent.putExtra("page",2);
                    startActivity(myIntent);
                }

                else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaShalatSunnah.class);
                    myIntent.putExtra("page",3);
                    startActivity(myIntent);
                }
                else if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaShalatSunnah.class);
                    myIntent.putExtra("page",4);
                    startActivity(myIntent);
                }

                else if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), DetailDoaShalatSunnah.class);
                    myIntent.putExtra("page",5);
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
