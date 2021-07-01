package com.vominhquan.tlandroid_k59;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    int banhmi = 15000;
    int pho = 30000;
    int com = 25000;
    int ga = 50000;

    int count_banhmi = 0;
    int count_pho = 0;
    int count_com = 0;
    int count_ga = 0;
    int total;


    public void banhmi_btn(View view) {
        String dialog_banhmi = "Số lượng: ";
        TextView soluong_banhmi = (TextView) findViewById(R.id.soluong_banhmi);
        TextView tong = (TextView) findViewById(R.id.tongtien);
        count_banhmi++;
        dialog_banhmi += count_banhmi;
        total = banhmi * count_banhmi + pho * count_pho + com * count_com + ga * count_ga;
        tong.setText(total + "" + "VND");
        soluong_banhmi.setText(dialog_banhmi);
    }

    public void pho_btn(View view) {
        String dialog_pho = "Số lượng: ";
        TextView soluong_pho = (TextView) findViewById(R.id.soluong_pho);
        TextView tong = (TextView) findViewById(R.id.tongtien);
        count_pho++;
        dialog_pho += count_pho;
        total = banhmi * count_banhmi + pho * count_pho + com * count_com + ga * count_ga;
        tong.setText(total + "" + "VND");
        soluong_pho.setText(dialog_pho);
    }

    public void com_btn(View view) {
        String dialog_com = "Số lượng: ";
        TextView soluong_com = (TextView) findViewById(R.id.soluong_com);
        TextView tong = (TextView) findViewById(R.id.tongtien);
        count_com++;
        dialog_com += count_com;
        total = banhmi * count_banhmi + pho * count_pho + com * count_com + ga * count_ga;
        tong.setText(total + ""+ "VND");
        soluong_com.setText(dialog_com);
    }

    public void ga_btn(View view) {
        String dialog_ga = "Số lượng: ";
        TextView soluong_ga = (TextView) findViewById(R.id.soluong_ga);
        TextView tong = (TextView) findViewById(R.id.tongtien);
        count_ga++;
        dialog_ga += count_ga;
        total = banhmi * count_banhmi + pho * count_pho + com * count_com + ga * count_ga;
        tong.setText(total + "" +"VND");
        soluong_ga.setText(dialog_ga);
    }

    public void huy_btn(View view) {
        String dialog_banhmi = "Số lượng: ";
        TextView soluong_banhmi = (TextView) findViewById(R.id.soluong_banhmi);
        String dialog_pho = "Số lượng: ";
        TextView soluong_pho = (TextView) findViewById(R.id.soluong_pho);
        String dialog_com = "Số lượng: ";
        TextView soluong_com = (TextView) findViewById(R.id.soluong_com);
        String dialog_ga = "Số lượng: ";
        TextView soluong_ga = (TextView) findViewById(R.id.soluong_ga);
        TextView tong = (TextView) findViewById(R.id.tongtien);
        count_banhmi = 0;
        count_pho = 0;
        count_com = 0;
        count_ga = 0;
        dialog_banhmi += count_banhmi;
        dialog_pho += count_pho;
        dialog_com += count_com;
        dialog_ga += count_ga;
        soluong_banhmi.setText(dialog_banhmi);
        soluong_pho.setText(dialog_pho);
        soluong_com.setText(dialog_com);
        soluong_ga.setText(dialog_ga);
        tong.setText("");
    }

    public void pay_btn(View view) {
        if (count_banhmi!=0|| count_pho!=0 || count_com!=0 || count_ga!=0)
        {
            Intent intent1 = new Intent( MainActivity2.this,MainActivity3.class);
            startActivity(intent1);

        }
    }
}
