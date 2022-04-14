package com.best.a74j;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView textView1;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editBtn1);
        editText2 = findViewById(R.id.editBtn2);
        textView1 = findViewById(R.id.textBtn1);
        textView2 = findViewById(R.id.textBtn2);
        getData();
        getData1();
    }

    public void getData() {
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                textView1.setText(editText1.getText());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public void getData1() {
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                textView2.setText(editText2.getText());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}