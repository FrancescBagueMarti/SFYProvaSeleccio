package com.example.sfy_provaseleccio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class OnBoardActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);

        final Button btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(view.getContext(), MainActivity.class);
            }
        });

    }

    private void changeActivity(Context currentActivity, Class<?> nextActivity) {
        Intent intent = new Intent(currentActivity, nextActivity);
        startActivity(intent);
        finish();
    }
}