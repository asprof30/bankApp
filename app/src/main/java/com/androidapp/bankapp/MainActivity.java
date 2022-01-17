package com.androidapp.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    EditText loginEdit;

    EditText passEdit;

    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      login=findViewById(R.id.logButton);
      loginEdit=findViewById(R.id.loginEdit);
      passEdit=findViewById(R.id.passEdit);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Objects.equals(loginEdit.getText().toString(), "admin")&&Objects.equals(passEdit.getText().toString(),"admin"))
                {
                    Toast.makeText(MainActivity.this,"You have Authenticated Successfully",Toast.LENGTH_LONG).show();
                    Intent i= new Intent(MainActivity.this, TransactionActivity.class);
                    startActivity(i);

                }else
                {
                    Toast.makeText(MainActivity.this,"Authentication Failed",Toast.LENGTH_LONG).show();
                }
            }
        });






    }

    @Override
    protected void onResume() {



        super.onResume();

    }
}