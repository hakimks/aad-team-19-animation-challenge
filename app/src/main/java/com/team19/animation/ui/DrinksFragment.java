package com.team19.animation.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.team19.animation.R;
import com.team19.animation.adapters.MainScreenRecyclerAdapter;
import com.team19.animation.models.Food;
import com.team19.animation.utils.Foods;

import java.util.ArrayList;
import java.util.Arrays;


public class DrinksFragment extends Fragment {
    private static final String TAG = "DrinksFragment";
    private RecyclerView recyclerView;
    private ArrayList<Food> foodlist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_drinks, container,false);
        recyclerView = view.findViewById(R.id.drinks_recyclerview);
        MainScreenRecyclerAdapter mainScreenRecyclerAdapter = new MainScreenRecyclerAdapter(getContext(),foodlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(mainScreenRecyclerAdapter);
        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);

        Foods food = new Foods();
        foodlist = new ArrayList<>();

        foodlist.addAll(Arrays.asList(food.drinks));
    }
}
