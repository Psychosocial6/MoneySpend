package com.example.moneyspend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Authors extends AppCompatActivity {
    TextView textView, textViewNNN;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView = findViewById(R.id.text);
        textViewNNN = findViewById(R.id.nnn);
        imageView = findViewById(R.id.logo);
        textView.setText("Разрабы\nАрнаутов Андрей\nЗыков Андрей\nПанкевич Артемий");
        textViewNNN.setText("ННН\n2023");
    }
}