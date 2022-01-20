package com.androidapp.bankapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class TransactionAdapter extends ArrayAdapter<Transaction> {
    private ArrayList <Transaction> transactionItems;
    public TransactionAdapter(@NonNull Context context, int resource , ArrayList <Transaction> transactionItems) {
        super(context, resource,transactionItems);
        this.transactionItems=transactionItems;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inf = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inf.inflate(R.layout.list_item,parent,false);

        ImageView img = convertView.findViewById(R.id.image);
        TextView ops = convertView.findViewById(R.id.ops);
        TextView price = convertView.findViewById(R.id.price);
        TextView date = convertView.findViewById(R.id.date);


        img.setImageResource(transactionItems.get(position).getImageId());
        ops.setText(transactionItems.get(position).getOperation());
        date.setText(transactionItems.get(position).getDate());
        price.setText(transactionItems.get(position).getMontants());





        return convertView;
    }
}
