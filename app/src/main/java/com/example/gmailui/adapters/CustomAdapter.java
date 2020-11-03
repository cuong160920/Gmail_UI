package com.example.gmailui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gmailui.R;
import com.example.gmailui.models.CustomItemModel;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    Context context;
    List<CustomItemModel> items;

    public CustomAdapter(Context context, List<CustomItemModel> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.model_customlist, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.image = view.findViewById(R.id.image);
            viewHolder.name = view.findViewById(R.id.name);
            viewHolder.content = view.findViewById(R.id.content);
            viewHolder.label = view.findViewById(R.id.label);
            viewHolder.time = view.findViewById(R.id.time);
            viewHolder.checkSelected = view.findViewById(R.id.check);
            view.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder)view.getTag();

        CustomItemModel item = items.get(i);

        viewHolder.image.setText(("" + item.getName().charAt(0)).toUpperCase());
        viewHolder.name.setText(item.getName());
        viewHolder.content.setText(item.getContent());
        viewHolder.time.setText(item.getTime());
        viewHolder.checkSelected.setChecked(item.isSelected());

        viewHolder.checkSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.setSelected(viewHolder.checkSelected.isChecked());
                notifyDataSetChanged();
            }
        });

        return view;
    }

    private class ViewHolder {
        TextView image;
        TextView name;
        TextView content;
        TextView time;
        ImageView label;
        CheckBox checkSelected;
    }



}
