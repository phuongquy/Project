package com.lephuongquy05.love_app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DealList_Fragment extends Fragment {

    private DealAdapter dealAdapter;
    private List<Deal> dealList = new ArrayList<>();
    public static DealList_Fragment newInstance(String data){
        DealList_Fragment fragment = new DealList_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;

    }


    @Override
//    lấy dữ liệu
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.deal_list_fragment,null);

        RecyclerView rvDeal = view.findViewById(R.id.rvDeal);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        dealAdapter = new DealAdapter(getContext(),dealList);
        rvDeal.setLayoutManager(layoutManager);
        rvDeal.setAdapter(dealAdapter);
        loadData();

        return view;
    }

    public void loadData(){
        Deal deal1 = new Deal(1,"MUA SACH","sachs hay lap trinh",150000,Deal.GROUP_EDU);
        Deal deal2 = new Deal(2,"bim bim","ngon khoong",1500000,Deal.GROUP_EAT);
        Deal deal3 = new Deal(3,"aos aams","HEETS AOS MACWJ",150000,Deal.GROUP_SCHOOL);
        dealList.add(deal1);
        dealList.add(deal2);
        dealList.add(deal3);
        dealAdapter.notifyDataSetChanged();
    }

}
