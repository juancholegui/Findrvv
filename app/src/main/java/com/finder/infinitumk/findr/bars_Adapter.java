package com.finder.infinitumk.findr;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class bars_Adapter extends RecyclerView.Adapter<bars_Adapter.ViewHolder> {

private Context mContext;
private ArrayList<ModelBar> mlist;

bars_Adapter(Context context, ArrayList<ModelBar> list){
mContext= context;
mlist=list;
}
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater= LayoutInflater.from(mContext);
        View view=layoutInflater.inflate(R.layout.rv_bars_items,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
public void onBindViewHolder(ViewHolder holder,int position){
ModelBar barItem=mlist.get(position);

ImageView image= holder.item_image;
TextView name,type,pick;
pick=holder.item_pick;
name =holder.item_name;
type= holder.item_type;

image.setImageResource(barItem.getImage());
name.setText(barItem.getName());
type.setText(barItem.getType());
pick.setText(barItem.getPick());
}

    @Override
    public int getItemCount(){
        return mlist.size();


    }

    public class ViewHolder extends RecyclerView.ViewHolder{

    ImageView item_image;
    TextView item_name,item_type,item_pick;
    public ViewHolder (View itemView){

        super(itemView);

item_image=itemView.findViewById(R.id.item_image);
item_name=itemView.findViewById(R.id.item_name);
item_type=itemView.findViewById(R.id.item_type);
item_pick=itemView.findViewById(R.id.item_pick);
    }

}
}
