package com.example.sfy_provaseleccio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sfy_provaseleccio.models.Flower;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    public static final String FLOWER = "FLOWER";

    ImageView selectedImage;
    TextView selectedDate;
    TextView selectedLikes;
    TextView selectedDescription;
    TextView selectedID;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Flower selectedFlower = (Flower) intent.getSerializableExtra(FLOWER);

        loadFlowerInfo(selectedFlower);

        btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    private void loadFlowerInfo(Flower flower){
        selectedImage = findViewById(R.id.selectedImage);
        selectedDate = findViewById(R.id.selectedDate);
        selectedLikes = findViewById(R.id.selectedLikes);
        selectedDescription = findViewById(R.id.selectedDescription);
        selectedID = findViewById(R.id.selectedID);

        Picasso.get()
                .load(flower.getUrls().getRegular())
                .fit()
                .centerCrop()
                .into(selectedImage);
        selectedDate.append("\n"+flower.getCreated_at());
        selectedLikes.append(""+flower.getLikes());
        selectedDescription.append("\n"+flower.getDescription());
        selectedID.append("\n"+flower.getId());

    }

}