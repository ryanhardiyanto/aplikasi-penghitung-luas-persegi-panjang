package com.example.ryanhardiyanto.persegipanjang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Panjang;
    private EditText Lebar;
    private EditText Luas;
    private Button btnHitungLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI(){
        Panjang = (EditText) findViewById(R.id.editTextPanjang);
        Lebar = (EditText) findViewById(R.id.editTextLebar);
        Luas = (EditText) findViewById(R.id.editTextLuas);
        btnHitungLuas = (Button) findViewById(R.id.buttonHitungLuas);
    }

    private void initEvent(){
        btnHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
    }

    private void hitungLuas(){
        int panjang = Integer.parseInt(Panjang.getText().toString());
        int lebar = Integer.parseInt(Lebar.getText().toString());
        int luas = panjang*lebar;
        Luas.setText(luas+"");
    }


    }
