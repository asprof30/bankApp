package com.androidapp.bankapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TransactionActivity extends AppCompatActivity {
    private ArrayList<Transaction> transactionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        transactionList=new ArrayList<>();


        Resources res=getResources();
        String[] allOperations= res.getStringArray(R.array.operations);
        int[] allmontants=res.getIntArray(R.array.montants);
        String[] alldates=res.getStringArray(R.array.dates);


        allTransactionList(allOperations,allmontants,alldates);


        TransactionAdapter adapter=new TransactionAdapter(getApplicationContext(),R.layout.list_item,transactionList);
        ListView listView=findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
    public  void allTransactionList(String[] operations, int [] montants, String [] dates){
        transactionList.add(new Transaction(R.drawable.ic_baseline_credit_card_24,operations[0],montants[0],dates[0]));
        transactionList.add(new Transaction(R.drawable.ic_baseline_credit_card_24,operations[1],montants[1],dates[1]));
        transactionList.add(new Transaction(R.drawable.ic_baseline_credit_card_24,operations[2],montants[2],dates[2]));
        transactionList.add(new Transaction(R.drawable.ic_baseline_credit_card_24,operations[3],montants[3],dates[3]));


    }




}