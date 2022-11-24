package com.example.narutoguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class WarArcInfoActivity extends AppCompatActivity {

    public void sendData(String epspan,String arcinfo,int resID){
        Intent i = new Intent(WarArcInfoActivity.this,ArcInfoActivity.class);
        Bundle content = new Bundle();
        content.putString("epspan",epspan);
        content.putString("arcinfo",arcinfo);
        content.putInt("resID",resID);
        i.putExtras(content);
        startActivity(i);
    }

    public void c_countdown(View v){
        String epspan = "Naruto Shippuden\nEpisode 215 - Episode 222\nEpisode 243 - Episode 256";
        String arcinfo = "This arc sees the preparations for the Fourth Shinobi World War by all the warring parties.";
        int resID = R.drawable.and_countdown;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Fourth Great Ninja War: Countdown",Toast.LENGTH_SHORT).show();
    }

    public void c_confrontation(View v){
        String epspan = "Naruto Shippuden\nEpisode 261 - Episode 270\nEpisode 272 - Episode 289\nEpisode 296 - Episode 310\nEpisode 312 - Episode 321";
        String arcinfo = "This arc sees the start of the Fourth Shinobi World War, specifically the battle against the Impure World Reincarnation. It spans through volumes 55 to 59";
        int resID = R.drawable.and_confrontation;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Fourth Great Ninja War: Confrontation",Toast.LENGTH_SHORT).show();
    }

    public void c_warclimax(View v){
        String epspan = "Naruto Shippuden\nEpisode 322 - Episode 348\nEpisode 362 - Episode 375\n";
        String arcinfo = "This arc sees the Allied Shinobi Forces' fight against Kabuto Yakushi, Tobi, and Madara Uchiha as part of the ongoing Fourth Shinobi World War. It spans through volumes 59 to 67";
        int resID = R.drawable.and_warclimax;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Fourth Great Ninja War: Climax",Toast.LENGTH_SHORT).show();
    }

    public void c_tentails(View v){
        String epspan = "Naruto Shippuden\nEpisode 378 - Episode 388\nEpisode 391 - Episode 393\nEpisode 414 - Episode 421\nEpisode 424 - Episode 431";
        String arcinfo = "This arc sees Obito Uchiha and Madara Uchiha using the Ten Tails to achieve their goal as the Shinobi Alliance continues to try and stop them. It spans through volumes 67 to 70.";
        int resID = R.drawable.and_tentails;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Fourth Great Ninja War: Ten Tails",Toast.LENGTH_SHORT).show();
    }

    public void c_kaguyaarc(View v){
        String epspan = "Naruto Shippuden\nEpisode 455 - Episode 473";
        String arcinfo = "This arc sees the introduction of alien Princess Kaguya Ōtsutsuki and her subsequent attempt to take over the world. It spans from volumes 70 to 72";
        int resID = R.drawable.and_kaguya;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Fourth Great Ninja War: Ten Tails",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_war_arc_info);
    }
}