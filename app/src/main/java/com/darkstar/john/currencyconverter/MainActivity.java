package com.darkstar.john.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view)
    {
        EditText amountText = (EditText) findViewById(R.id.amountText);
        Double amountDouble = Double.parseDouble(amountText.getText().toString());
        Double amountEuro = amountDouble * 0.86;
        Toast.makeText(this, amountEuro+"€", Toast.LENGTH_SHORT).show();

    }
}
