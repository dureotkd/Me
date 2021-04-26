package com.example.bid_myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;

public class MainActivity extends AppCompatActivity {

    Button btn_test;
    EditText edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_test    = (Button)findViewById(R.id.btn_test);
        edit_text   = (EditText)findViewById(R.id.edit_text);

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_test.setText("천재성민이입니다.");
                edit_text.setText("안녕하세요 111.");
            }
        });

        MutableLiveData<String> lvMsg = new MutableLiveData<>();

    }
}