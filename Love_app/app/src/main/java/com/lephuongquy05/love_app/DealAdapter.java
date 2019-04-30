package com.lephuongquy05.love_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class DealAdapter extends RecyclerView.Adapter<DealAdapter.ViewHolder> {
    private Context context;
    private List<Deal> dealList;
    public DealAdapter(Context context, List<Deal> list){
        this.context = context;
        this.dealList = list;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int typeView) {
        View view = LayoutInflater.from(context).inflate(R.layout.deail_item,null);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Deal deal = dealList.get(position);
       viewHolder.tvTitle.setText(deal.getTitle());
       viewHolder.tvNote.setText(deal.getNote());
       viewHolder.tvPrice.setText(String.valueOf(deal.getPrice()));

       if(deal.getGroupID() == Deal.GROUP_EAT){
           viewHolder.ivAvatar.setImageResource(R.drawable.ic_restaurant);
       }
        if(deal.getGroupID() == Deal.GROUP_EDU){
            viewHolder.ivAvatar.setImageResource(R.drawable.ic_plus);
        }
        if(deal.getGroupID() == Deal.GROUP_SCHOOL){
            viewHolder.ivAvatar.setImageResource(R.drawable.ic_shopping);
        }
    }

    @Override
    public int getItemCount() {
        return dealList.size();
    }

    class  ViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle;
        TextView tvNote;
        ImageView ivAvatar;
        TextView tvPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvNote = itemView.findViewById(R.id.tvNote);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            ivAvatar = itemView.findViewById(R.id.ivAvatar);


            itemView.findViewById(R.id.layoutItem).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showItem(getAdapterPosition());
                }
            });
        }
    }
    private void showItem(int position){
        Deal deal = dealList.get(position);
        Toast.makeText(context,deal.getTitle(),Toast.LENGTH_SHORT).show();
    }

}
