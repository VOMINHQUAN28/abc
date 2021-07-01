package com.vominhquan.tlandroid_k59;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
    }


    public void xacnhan_btn(View view){
        Intent intent = new Intent(MainActivity3.this, Main4.class);
        startActivity(intent);
    }

    public void back_btn(View view){
        Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(intent);
    }


}
