package com.vominhquan.tlandroid_k59;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtId;
    EditText edtPassWord;
    Button btnLogin, btnRegist, btnExit;
    String ten,mk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Event();
        ControlButton();

    }

    private void ControlButton() {
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                builder.setTitle("Bạn có chắc muốn thoát khỏi app");
                builder.setMessage("Hãy lựa chọn bên dưới để xác nhận");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }

        });
        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setTitle("Hộp thoại xử lý");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.custom_dialog);
                EditText edttk = dialog.findViewById(R.id.edttk);
                EditText edtmk = dialog.findViewById(R.id.edtmk);
                Button btnhuy = dialog.findViewById(R.id.btnhuy);
                Button btndongy = dialog.findViewById(R.id.btdongy);

                btndongy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ten = edttk.getText().toString().trim();
                        mk = edtmk.getText().toString().trim();

                        edtId.setText(ten);
                        edtPassWord.setText(mk);

                        dialog.cancel();

                    }
                });
                btnhuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                dialog.show();

            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtId.getText().length() !=0 && edtPassWord.getText().length() !=0) {
                    if (edtId.getText().toString().equals(ten) && edtPassWord.getText().toString().equals(mk)) {
                        Toast.makeText(MainActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);

                    } else if (edtId.getText().toString().equals("quan") && edtPassWord.getText().toString().equals("123")) {
                        Toast.makeText(MainActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);


                    } else {
                        Toast.makeText(MainActivity.this, "Bạn đã đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                    }
                }
                    else {

                        Toast.makeText(MainActivity.this,"Mời bạn nhập đủ thông tin",Toast.LENGTH_SHORT).show();
                    }
                }

        });
    }

    private void Event() {
        edtId= findViewById(R.id.edtId);
        edtPassWord= findViewById(R.id.edtPassword);
        btnLogin= findViewById(R.id.btnLogin);
        btnRegist= findViewById(R.id.btnRegist);
        btnExit= findViewById(R.id.btnExit);

    }
}