package com.example.TugasPascaUts_PCS_0586;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String title = getIntent().getStringExtra("EXTRA_TITLE");
        String year = getIntent().getStringExtra("EXTRA_YEAR");
        String image = getIntent().getStringExtra("EXTRA_IMAGE");
        String overview = getIntent().getStringExtra("EXTRA_OVERVIEW");


        TextView txtTitle = findViewById(R.id.txtTitle);
        TextView txtYear = findViewById(R.id.txtYear);
        ImageView imgPoster = findViewById(R.id.imgPoster);
        TextView txtOverview = findViewById(R.id.txtOverview);

        txtTitle.setText(title);
        txtYear.setText(year);
        txtOverview.setText(overview);

        Glide.with(this)
                .load("https://themoviedb.org/t/p/w500"+image.toString())
                .into(imgPoster);
    }
}
