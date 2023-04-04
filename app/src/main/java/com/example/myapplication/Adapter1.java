package com.example.myapplication;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter1 extends RecyclerView.Adapter<Adapter1.ViewHolder>{


    public Adapter1(String[] captions, int[] imageIds) {
        this.captions = captions;
        this.imageIds = imageIds;
    }

    private String[] captions;
    private int[] imageIds;


    @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.place_view,
                parent,
                false);

        return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            CardView cardView = holder.cardView;
            ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
            Drawable dr = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
            imageView.setImageDrawable(dr);
            TextView txt = (TextView)cardView.findViewById(R.id.txtName);
            txt.setText(captions[position]);
            cardView.setOnClickListener( new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    //
                }
            });

        }

        @Override
        public int getItemCount() {
            return  captions.length;
        }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }
    }


