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

    private ArrayList<Transaction> transactionList;



    public TransactionAdapter(@NonNull Context context, int resource, ArrayList<Transaction> transactionList) {
        super(context, resource);
        this.transactionList = transactionList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    int index=position;
       if(convertView==null){
           convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
       }
        ImageView transactionImage=convertView.findViewById(R.id.img);
        TextView transactionOperation =convertView.findViewById(R.id.operation);
        TextView transactionMontant=convertView.findViewById(R.id.montant);
        TextView transactionDate=convertView.findViewById(R.id.date);


        transactionImage.setImageResource(transactionList.get(position).getImageId());
        transactionOperation.setText(transactionList.get(position).getOperation());
        transactionMontant.setText(transactionList.get(position).getMontant());
        transactionDate.setText(transactionList.get(position).getDate());



        return convertView;
    }
}
