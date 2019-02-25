package org.d3ifcool.tatacarashalat.Shalat;

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
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.d3ifcool.tatacarashalat.R;

public class DetailAshar extends AppCompatActivity {

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
                    case 8: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 9: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 10: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 11: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 12: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 13: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 14: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 15: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 16: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 17: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 18: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 19: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 20: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 21: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 22: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 23: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 24: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 25: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 26: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 27: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 28: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 29: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 30: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 31: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 32: /*halaman selanjutnya*/
                        btnPrev.setVisibility(View.VISIBLE); /*halaman berikutnya btn prev nongol/ bisa dipencet*/
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 33:
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
                R.drawable.shalat_niat_itidal,
                R.drawable.shalat_takbir,
                R.drawable.shalat_iftitah_alfatihah_suratpendek,
                R.drawable.shalat_iftitah_alfatihah_suratpendek,
                R.drawable.shalat_iftitah_alfatihah_suratpendek,
                R.drawable.shalat_ruku,
                R.drawable.shalat_niat_itidal,
                R.drawable.shalat_sujud,
                R.drawable.shalat_duduk2sujud,
                R.drawable.shalat_sujud,
                R.drawable.shalat_iftitah_alfatihah_suratpendek,
                R.drawable.shalat_iftitah_alfatihah_suratpendek,
                R.drawable.shalat_ruku,
                R.drawable.shalat_niat_itidal,
                R.drawable.shalat_sujud,
                R.drawable.shalat_duduk2sujud,
                R.drawable.shalat_sujud,
                R.drawable.shalat_tahiyatul,
                R.drawable.shalat_iftitah_alfatihah_suratpendek,
                R.drawable.shalat_iftitah_alfatihah_suratpendek,
                R.drawable.shalat_ruku,
                R.drawable.shalat_niat_itidal,
                R.drawable.shalat_sujud,
                R.drawable.shalat_duduk2sujud,
                R.drawable.shalat_sujud,
                R.drawable.shalat_iftitah_alfatihah_suratpendek,
                R.drawable.shalat_iftitah_alfatihah_suratpendek,
                R.drawable.shalat_ruku,
                R.drawable.shalat_niat_itidal,
                R.drawable.shalat_sujud,
                R.drawable.shalat_duduk2sujud,
                R.drawable.shalat_sujud,
                R.drawable.shalat_tahiyatul,
                R.drawable.shalat_salam
        };

        // list judul
        int[] list_judul = {
                R.string.niat_ashar,
                R.string.takbir,
                R.string.iftitah,
                R.string.alfatihah,
                R.string.suratquran,
                R.string.rukuk,
                R.string.itidal,
                R.string.sujud,
                R.string.dudukdiantara,
                R.string.sujud,
                R.string.alfatihah,
                R.string.suratquran,
                R.string.rukuk,
                R.string.itidal,
                R.string.sujud,
                R.string.dudukdiantara,
                R.string.sujud,
                R.string.tasyahudawal,
                R.string.alfatihah,
                R.string.suratquran,
                R.string.rukuk,
                R.string.itidal,
                R.string.sujud,
                R.string.dudukdiantara,
                R.string.sujud,
                R.string.alfatihah,
                R.string.suratquran,
                R.string.rukuk,
                R.string.itidal,
                R.string.sujud,
                R.string.dudukdiantara,
                R.string.sujud,
                R.string.tasyahudakhir,
                R.string.salam

        };

        // list deskripsi
        int[] list_desk = {
                R.string.arab_niat_ashar,
                R.string.arab_takbir,
                R.string.arab_iftitah,
                R.string.arab_alfatihah,
                R.string.arab_suratquran,
                R.string.arab_rukuk,
                R.string.arab_itidal,
                R.string.arab_sujud,
                R.string.arab_dudukdiantara,
                R.string.arab_sujud,
                R.string.arab_alfatihah,
                R.string.arab_suratquran,
                R.string.arab_rukuk,
                R.string.arab_itidal,
                R.string.arab_sujud,
                R.string.arab_dudukdiantara,
                R.string.arab_sujud,
                R.string.arab_tasyahudawal,
                R.string.arab_alfatihah,
                R.string.arab_suratquran,
                R.string.arab_rukuk,
                R.string.arab_itidal,
                R.string.arab_sujud,
                R.string.arab_dudukdiantara,
                R.string.arab_sujud,
                R.string.arab_alfatihah,
                R.string.arab_suratquran,
                R.string.arab_rukuk,
                R.string.arab_itidal,
                R.string.arab_sujud,
                R.string.arab_dudukdiantara,
                R.string.arab_sujud,
                R.string.arab_tasyahudakhir,
                R.string.arab_salam
        };

        // list deskripsi
        int[] list_latin = {
                R.string.latin_niat_ashar,
                R.string.latin_takbir,
                R.string.latin_iftitah,
                R.string.latin_alfatihah,
                R.string.latin_suratquran,
                R.string.latin_rukuk,
                R.string.latin_itidal,
                R.string.latin_sujud,
                R.string.latin_dudukdiantara,
                R.string.latin_sujud,
                R.string.latin_alfatihah,
                R.string.latin_suratquran,
                R.string.latin_rukuk,
                R.string.latin_itidal,
                R.string.latin_sujud,
                R.string.latin_dudukdiantara,
                R.string.latin_sujud,
                R.string.latin_tasyahudawal,
                R.string.latin_alfatihah,
                R.string.latin_suratquran,
                R.string.latin_rukuk,
                R.string.latin_itidal,
                R.string.latin_sujud,
                R.string.latin_dudukdiantara,
                R.string.latin_sujud,
                R.string.latin_alfatihah,
                R.string.latin_suratquran,
                R.string.latin_rukuk,
                R.string.latin_itidal,
                R.string.latin_sujud,
                R.string.latin_dudukdiantara,
                R.string.latin_sujud,
                R.string.latin_tasyahudakhir,
                R.string.latin_salam
        };

        int[] list_arti = {
                R.string.arti_niat_ashar,
                R.string.arti_takbir,
                R.string.arti_iftitah,
                R.string.arti_alfatihah,
                R.string.arti_suratquran,
                R.string.arti_ruku,
                R.string.arti_itidal,
                R.string.arti_sujud,
                R.string.arti_dudukdiantara,
                R.string.arti_sujud,
                R.string.arti_alfatihah,
                R.string.arti_suratquran,
                R.string.arti_ruku,
                R.string.arti_itidal,
                R.string.arti_sujud,
                R.string.arti_dudukdiantara,
                R.string.arti_sujud,
                R.string.arti_tasyahudawal,
                R.string.arti_alfatihah,
                R.string.arti_suratquran,
                R.string.arti_ruku,
                R.string.arti_itidal,
                R.string.arti_sujud,
                R.string.arti_dudukdiantara,
                R.string.arti_sujud,
                R.string.arti_alfatihah,
                R.string.arti_suratquran,
                R.string.arti_ruku,
                R.string.arti_itidal,
                R.string.arti_sujud,
                R.string.arti_dudukdiantara,
                R.string.arti_sujud,
                R.string.arti_tasyahudakhir,
                R.string.arti_salam
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
