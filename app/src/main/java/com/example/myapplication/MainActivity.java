package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button signup1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        signup1=(Button)findViewById(R.id.signup);
        signup1.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
            }
        });

    }
    public void check(){
        Intent intent=new Intent(this,MainActivityClass.class);
        startActivity(intent);
    }
}
