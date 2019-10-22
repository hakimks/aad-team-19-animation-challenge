package com.team19.animation;

import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.team19.animation.adapters.MainScreenRecyclerAdapter;
import com.team19.animation.models.Food;
import com.team19.animation.utils.Foods;

import java.util.ArrayList;
import java.util.Arrays;


public class DessertsFragment extends Fragment {
    private static final String TAG = "DessertsFragment";
    private RecyclerView recyclerView;
    private ArrayList<Food> drinklist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_desserts, container,false);
        recyclerView = view.findViewById(R.id.desserts_recyclerview);
        MainScreenRecyclerAdapter mainScreenRecyclerAdapter = new MainScreenRecyclerAdapter(getContext(),drinklist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(mainScreenRecyclerAdapter);
        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        drinklist = new ArrayList<>();
        Food[] desserts = new Foods().getDesserts();

        drinklist.addAll(Arrays.asList(desserts));
    }
}


