package com.example.sfy_provaseleccio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences preferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE);

        final Intent intent;
        if (!preferences.getBoolean("on_board", false)) {

            alterPreferences(preferences);
            intent = new Intent(this, OnBoardActivity.class);
        } else {
            intent = new Intent(this, MainActivity.class);
        }

        startActivity(intent);
        finish();
    }

    private void alterPreferences(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("on_board", true);
        editor.commit();
    }
}