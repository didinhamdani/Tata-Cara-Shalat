package org.d3ifcool.tatacarashalat.Shalat;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.d3ifcool.tatacarashalat.R;

/**
 * Created by User on 11/21/2018.
 */

public class RecyclerAdapterShalat extends RecyclerView.Adapter<RecyclerAdapterShalat.ViewHolder> {

    private String[] titles = {"Shalat Subuh",
            "Shalat Dzuhur",
            "Shalat Ashar",
            "Shalat Maghrib",
            "Shalat Isya"
    };

    private String[] details = {
            "Salah satu shalat wajib dari shalat lima waktu yang dilakukan pada saat fajar sampai menjelang matahari terbit. Shalat Subuh didahului oleh salat sunah fajar sebanyak 2 rakaat.",
            "Salah satu shalat dari shalat lima waktu yang dilakukan setelah matahari tergelincir sampai menjelang petang. Shalat ini terdiri dari 4 rakaat.",
            "Salah satu shalat wajib dari shalat lima waktu yang dilakukan setelah panjang banyangan suatu benda sama dengan tinggi benda tersebut sampai menjelang matahari terbenam. Shalat ini terdiri dari 4 rakaat",
            "Salah satu shalat dari shalat lima waktu yang dilakukan pada saat matahari terbenam. Shalat ini terdiri dari 3 rakaat.",
            "Salah satu shalat dari shalat lima waktu yang dilakukan setelah awan merah di ufuk barat menghilang sampai menjelang terbitnya matahari. Terdiri dari 4 rakaat.",
    };

    private int[] images = {
            R.drawable.shalat_subuh,
            R.drawable.shalat_dzuhur,
            R.drawable.shalat_ashar,
            R.drawable.shalat_maghrib,
            R.drawable.shalat_isya
    };

    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =
                    (TextView)itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {

                    int position = getAdapterPosition();
//
//                    Snackbar.make(v, "Click detected on item " + position,
//                            Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();

                    Context context = v.getContext();
                    Intent intent = new Intent();
                    switch (getAdapterPosition()){
                        case 0 :
                                intent = new Intent(context, ShalatSubuh.class);
                            break;
                        case 1 :
                            intent = new Intent(context, ShalatDzuhur.class);
                            break;
                        case 2:
                            intent = new Intent(context, ShalatAshar.class);
                            break;
                        case 3:
                            intent = new Intent(context, ShalatMaghrib.class);
                            break;
                        case 4:
                            intent = new Intent(context, ShalatIsya.class);
                            break;
                    }
                    context.startActivity(intent);

                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

}
