package com.androidapp.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Transaction_details extends AppCompatActivity {
    TextView transactionName ;
    TextView montant;
    TextView date;

    //butterknife.bind(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_details);
        Bundle extras = getIntent().getExtras();
        String value = extras.getString("key");
        transactionName=findViewById(R.id.textinfo);
        transactionName.setText(value);
        montant = findViewById(R.id.montant);
        String prix = extras.getString("prix");
        montant.append(" :"+prix);
        date = findViewById(R.id.dateOp);
        String dateOp = extras.getString("dateop");
        date.append(" :"+dateOp);
    }
}
//tr