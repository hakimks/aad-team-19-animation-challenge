package com.team19.animation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.team19.animation.R;
import com.team19.animation.models.Food;

import java.util.ArrayList;
import java.util.List;

public class MainScreenRecyclerAdapter extends RecyclerView.Adapter<MainScreenRecyclerAdapter.MyViewHolder>{

    Context mContext;
    ArrayList<Food> foods;

    public MainScreenRecyclerAdapter(Context context, ArrayList<Food> foodlist) {
        mContext = context;
        foods = foodlist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.food_list_layout, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.foodName.setText(foods.get(i).getName());
        String foodPrice = String.valueOf(foods.get(i).getPrice());
        myViewHolder.foodPrice.setText(foodPrice);

        Glide.with(mContext).load(foods.get(i).getFoodImage()).into(myViewHolder.foodImage);


    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView foodName;
        private TextView foodPrice;
        private ImageView foodImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            foodName = itemView.findViewById(R.id.textView_foodName);
            foodPrice = itemView.findViewById(R.id.txt_foodprice);
            foodImage = itemView.findViewById(R.id.img_foodimage);
        }
    }
}
