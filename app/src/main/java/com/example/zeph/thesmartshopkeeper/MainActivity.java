package com.example.zeph.thesmartshopkeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAddItems(View view) {
        Intent mapIntent = new Intent(MainActivity.this, AddItems.class);
        startActivity(mapIntent);
    }

    public void goToInventory(View view) {
        Intent mapIntent = new Intent(MainActivity.this, Inventory.class);
        startActivity(mapIntent);
    }

    public void goToSales(View view) {
        Intent mapIntent = new Intent(MainActivity.this, Sales.class);
        startActivity(mapIntent);
    }

    public void goToLoginRegister(View view) {
        Intent mapIntent = new Intent(MainActivity.this, LoginRegister.class);
        startActivity(mapIntent);
    }

}
