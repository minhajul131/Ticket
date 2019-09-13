package com.example.ticket;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class BusAdapter extends ArrayAdapter<Bus> {

    private Activity context;
    private List<Bus> busList;
    public static String time;


    public BusAdapter(Activity context, List<Bus> busList){
        super(context, R.layout.list_layout, busList);
        this.context = context;
        this.busList = busList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View ListViewItem = inflater.inflate(R.layout.list_layout,null,true);

        TextView textViewName = (TextView) ListViewItem.findViewById(R.id.textViewName);
        TextView textViewTime = (TextView) ListViewItem.findViewById(R.id.textViewTime);
        TextView textViewPrice = (TextView) ListViewItem.findViewById(R.id.textViewPrice);

        Bus bus = busList.get(position);
        time = bus.getTime();
        textViewName.setText(bus.getName());
        textViewTime.setText(bus.getTime());
        textViewPrice.setText(bus.getPrice());

        return ListViewItem;
    }
}
