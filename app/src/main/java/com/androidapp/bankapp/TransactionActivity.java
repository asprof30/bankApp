package com.androidapp.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class TransactionActivity extends AppCompatActivity {
    private ArrayList<Transaction> transactionsItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
     transactionsItems=new ArrayList<Transaction>();


        Resources res = getResources();
        String[] ops = res.getStringArray(R.array.operations);
        String[] price = res.getStringArray(R.array.montants);
        String[] date = res.getStringArray(R.array.dates);
        int[] img  = {R.drawable.ic_baseline_credit_card_24,R.drawable.ic_baseline_open_in_new_24,R.drawable.ic_baseline_percent_24,R.drawable.ic_baseline_security_24};
        adding (ops, price, date, img);

    TransactionAdapter adapter =new TransactionAdapter(getApplicationContext(),R.layout.list_item,transactionsItems);
    ListView lis =findViewById(R.id.listview);
    lis.setAdapter(adapter);
    lis.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
           // Toast.makeText(TransactionActivity.this, "qsdfghjkerty" + position, Toast.LENGTH_SHORT).show();
            Intent i= new Intent(TransactionActivity.this, Transaction_details.class);
            i.putExtra("prix",price[position]);
            i.putExtra("dateop",date[position]);
            i.putExtra("key",ops[position]);
            startActivity(i);

        }
    });
}

    public void adding (String ops[], String price[], String date[], int [] img)
    {

        for (int i =0; i<ops.length;i++)
        {
            transactionsItems.add(new Transaction(img[i],ops[i],price[i],date[i]));
        }

    }
}