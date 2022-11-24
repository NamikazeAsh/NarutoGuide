package com.example.narutoguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ArcInfoActivity extends AppCompatActivity {

    ImageView imageView;
    TextView episodeSpan;
    TextView arcInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc_info);

        imageView = findViewById(R.id.arcinfo_image);
        episodeSpan = findViewById(R.id.arcinfo_episodespan);
        arcInfo = findViewById(R.id.arcinfo_arcinfo);

        Intent i = getIntent();
        Bundle content = i.getExtras();
        String s_episodeSpan = content.getString("epspan");
        String s_arcInfo = content.getString("arcinfo");
        int resID = content.getInt("resID");

        episodeSpan.setText(s_episodeSpan);
        arcInfo.setText(s_arcInfo);
        imageView.setImageResource(resID);

    }
}