package com.example.myapplicationlast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAS;
    private Button btnJS;
    private Button btnMod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAS = findViewById(R.id.textVFM);
        btnJS = findViewById(R.id.textV3);
        btnMod = findViewById(R.id.textV4);
    }
    public void onNex(View v) {
        Intent intent = new Intent(MainActivity.this, ModActivity.class);
        startActivity(intent);
    }
    public void onHex(View v) {
        Intent intent = new Intent(MainActivity.this, ASActivity.class);
        startActivity(intent);
    }
    public void onTex(View v) {
        Intent intent = new Intent(MainActivity.this, JSActivity.class);
        startActivity(intent);
    }

}