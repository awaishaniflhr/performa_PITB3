package com.example.performa_pitb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CommoditiesAdapter extends RecyclerView.Adapter <CommoditiesAdapter.ViewHolder> {

    Context context;
    List<CommoditiesModel> commoditiesModelList;

    public CommoditiesAdapter(Context context, List<CommoditiesModel> commoditiesModelList) {
        this.context = context;
        this.commoditiesModelList = commoditiesModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if( commoditiesModelList != null && commoditiesModelList.size() > 0){
            CommoditiesModel model = commoditiesModelList.get(position);
            holder.sr_pf.setText(model.getSr());
            holder.commodities_pf.setText(model.getCommodities());
            holder.avail_pf.setText(model.getAvail());
            holder.na_pf.setText(model.getNA());
            holder.nrr_pf.setText(model.getNotifiedRetailPrice());
            holder.sprice_pf.setText(model.getSpotPrice());
        }

    }

    @Override
    public int getItemCount() {
        return commoditiesModelList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView sr_pf, commodities_pf, avail_pf, na_pf, nrr_pf, sprice_pf;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            sr_pf = itemView.findViewById(R.id.sr_pf);
            commodities_pf = itemView.findViewById(R.id.commodities_pf);
            avail_pf = itemView.findViewById(R.id.avail_pf);
            na_pf = itemView.findViewById(R.id.na_pf);
            nrr_pf = itemView.findViewById(R.id.nrr_pf);
            sprice_pf = itemView.findViewById(R.id.sprice_pf);
        }
    }
}
