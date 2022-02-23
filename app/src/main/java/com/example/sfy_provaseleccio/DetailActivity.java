package com.example.sfy_provaseleccio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sfy_provaseleccio.model.Flower;

public class DetailActivity extends AppCompatActivity {

    public static final String FLOWER = "FLOWER";

    ImageView selectedImage;
    TextView selectedDate;
    TextView selectedLikes;
    TextView selectedDescription;
    TextView selectedID;
    Button btnReturn;

    private static Flower selectedFlower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        selectedFlower = (Flower) intent.getSerializableExtra(FLOWER);

        selectedImage = findViewById(R.id.selectedImage);
        selectedDate = findViewById(R.id.selectedDate);
        selectedLikes = findViewById(R.id.selectedLikes);
        selectedDescription = findViewById(R.id.selectedDescription);
        selectedID = findViewById(R.id.selectedID);
        btnReturn = findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}