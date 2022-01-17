package com.androidapp.bankapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;

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

public class TransactionActivity extends AppCompatActivity {
    ListView listView;
    int images[]={R.drawable.ic_baseline_credit_card_24,R.drawable.ic_baseline_money_24,R.drawable.ic_baseline_percent_24,R.drawable.ic_baseline_open_in_new_24};
    String operations[]={"operation1","operation2","operation3","operation4"};
    String montants[]={"2000","5000","4000","2000"};
    String dates[]={"78/969652","96/4/52","96/123/985","85/74/9621"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        listView= (ListView) findViewById(R.id.listView);
        MyAdapter adapter=new MyAdapter(this,images,operations,montants,dates);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for(int i=0;i<images.length;i++){
                    if(position==i){
                        Toast.makeText(TransactionActivity.this, "description", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }


   class MyAdapter extends ArrayAdapter<String> {
        Context context;
        int rImgs[];
        String rOperations[];
        String rMontants[];
        String rDates[];

        MyAdapter(Context c, int imgs[], String operations[], String montants[], String dates[]) {
            super(c, R.layout.list_item, R.id.operation);
            this.context = c;
            this.rImgs = imgs;
            this.rOperations = operations;
            this.rMontants = montants;
            this.rDates = dates;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater= (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View listItem=layoutInflater.inflate(R.layout.list_item,parent,false);
            ImageView images=listItem.findViewById(R.id.img);
            TextView operation =listItem.findViewById(R.id.operation);
            TextView montant=listItem.findViewById(R.id.montant);
            TextView date=listItem.findViewById(R.id.date);
            images.setImageResource(rImgs[position]);
            operation.setText(rOperations[position]);
            montant.setText(rMontants[position]);
            date.setText(rDates[position]);


            return listItem;
        }

    }

}