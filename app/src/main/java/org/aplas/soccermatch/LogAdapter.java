package org.aplas.soccermatch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LogAdapter extends RecyclerView.Adapter<LogAdapter.LogViewHolder> {

    private int listItemLayout;
    private ArrayList<LogItem> itemList;

    public LogAdapter(int listItemLayout, ArrayList<LogItem> itemList) {
        this.listItemLayout = listItemLayout;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public LogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout,parent,false);
        LogViewHolder holder = new LogViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull LogViewHolder holder, int position) {
        holder.time.setText(itemList.get(position).getTime());
        holder.player.setText(itemList.get(position).getPlayer());
        String name = itemList.get(position).getName();
        holder.name.setText(name);
        if (name.startsWith("Goal")){
            holder.img.setImageResource(R.drawable.icon_goal);
        }else if (name.startsWith("Yellow")){
            holder.img.setImageResource(R.drawable.icon_yellow_card);
        }else{
            holder.img.setImageResource(R.drawable.icon_red_card);
        }
    }

    @Override
    public int getItemCount() {
        return itemList == null ? 0 : itemList.size();
    }

    public class LogViewHolder extends RecyclerView.ViewHolder {

        public TextView name, time, player;
        ImageView img;

        public LogViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.txtName);
            time = (TextView) itemView.findViewById(R.id.txtTime);
            player = (TextView) itemView.findViewById(R.id.txtPlayer);
            img = (ImageView) itemView.findViewById(R.id.eventIcon);
        }
    }
}
