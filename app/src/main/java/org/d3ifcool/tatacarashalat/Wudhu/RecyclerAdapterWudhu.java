package org.d3ifcool.tatacarashalat.Wudhu;

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

public class RecyclerAdapterWudhu extends RecyclerView.Adapter<RecyclerAdapterWudhu.ViewHolder> {

    private String[] titles = {"Wudhu",
            "Tayamum"
    };

    private String[] details = {
            "Wudhu merupakan gerakan untuk membersihkan diri dari hadats kecil dengan perantara air.",
            "Tayamum merupakan salah satu bentuk membersihkan diri dari hadats kecil ketika sedang tidak ada air bersih."
    };

    private int[] images = {
            R.drawable.wudhu_wudhu,
            R.drawable.wudhu_tayamum
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
                            intent = new Intent(context, Wudhu.class);
                            break;
                        case 1 :
                            intent = new Intent(context, Tayamum.class);
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
