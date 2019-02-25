package org.d3ifcool.tatacarashalat.Doa;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import org.d3ifcool.tatacarashalat.R;

public class DetailDoaShalatFardhu extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    Button btnPrev, btnNext;

    /*asumsikan page default di halaman pertama*/
    int page = 0; /*nilai 0 sama dengan satu*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btnPrev = findViewById(R.id.prev);
        btnNext = findViewById(R.id.next);


        /*seting btn prev di awal dengan visible agar btn prev menghilang/disable*/
        btnPrev.setVisibility(View.GONE);

        /*sekarang pasang adapter ke viewpager*/
        setupViewPager();

        /*buat metode page change*/
        pageChange();

        int page = getIntent().getIntExtra("page",0);
        while(page > 0) {
            next(null);
            page--;
        }
    }

    private void pageChange() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                page = position;
                switch (position) {
                    case 0: /*titik dua*/
                        btnPrev.setVisibility(View.GONE); /*di awal btnprev ngilang/ gak bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 1: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 2: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 3: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 4: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 5: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 6: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 7: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 8:
                        btnPrev.setVisibility(View.VISIBLE);
                        btnNext.setVisibility(View.GONE); /*halaman terkahir btnNext yg ngilang*/
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void setupViewPager() {
        adapter = new Adapter(this);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
    }

    public void prev(View view) {
        viewPager.setCurrentItem(viewPager.getCurrentItem() - 1, true);
    }

    public void next(View view) {
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
    }

    private class Adapter extends PagerAdapter {
        Context context;
        LayoutInflater inflater;


        public Adapter(Context context) {
            this.context = context;
        }

        // list img
        int[] list_img = {
                R.drawable.langkah_doa,
                R.drawable.langkah_doa,
                R.drawable.langkah_doa,
                R.drawable.langkah_doa,
                R.drawable.langkah_doa,
                R.drawable.langkah_doa,
                R.drawable.langkah_doa,
                R.drawable.langkah_doa,
                R.drawable.langkah_doa
        };

        // list judul
        int[] list_judul = {
                R.string.doa_fardhu1,
                R.string.doa_fardhu2,
                R.string.doa_fardhu3,
                R.string.doa_fardhu4,
                R.string.doa_fardhu5,
                R.string.doa_fardhu6,
                R.string.doa_fardhu7,
                R.string.doa_fardhu8,
                R.string.doa_fardhu9
        };

        // list deskripsi
        int[] list_desk = {
                R.string.arab_doa_fardhu1,
                R.string.arab_doa_fardhu2,
                R.string.arab_doa_fardhu3,
                R.string.arab_doa_fardhu4,
                R.string.arab_doa_fardhu5,
                R.string.arab_doa_fardhu6,
                R.string.arab_doa_fardhu7,
                R.string.arab_doa_fardhu8,
                R.string.arab_doa_fardhu9
        };

        // list deskripsi
        int[] list_latin = {
                R.string.latin_doa_fardhu1,
                R.string.latin_doa_fardhu2,
                R.string.latin_doa_fardhu3,
                R.string.latin_doa_fardhu4,
                R.string.latin_doa_fardhu5,
                R.string.latin_doa_fardhu6,
                R.string.latin_doa_fardhu7,
                R.string.latin_doa_fardhu8,
                R.string.latin_doa_fardhu9
        };

        int[] list_arti = {
                R.string.arti_doa_fardhu1,
                R.string.arti_doa_fardhu2,
                R.string.arti_doa_fardhu3,
                R.string.arti_doa_fardhu4,
                R.string.arti_doa_fardhu5,
                R.string.arti_doa_fardhu6,
                R.string.arti_doa_fardhu7,
                R.string.arti_doa_fardhu8,
                R.string.arti_doa_fardhu9
        };

        @Override
        public int getCount() {
            return list_judul.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return (view == object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.detail_layout,container,false);
            ImageView imageView = view.findViewById(R.id.img);
            TextView judul = view.findViewById(R.id.bagian_shalat);
            TextView desk = view.findViewById(R.id.bacaan_arab);
            TextView latin = view.findViewById(R.id.bacaan_latin);
            TextView arti = view.findViewById(R.id.artinya);

            imageView.setImageResource(list_img[position]);
            judul.setText(list_judul[position]);
            desk.setText(list_desk[position]);
            latin.setText(list_latin[position]);
            arti.setText(list_arti[position]);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((ScrollView)object);
        }
    }
}
