package com.example.narutoguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    ArcFragment arcFragment = new ArcFragment();
    FillersFragment fillersFragment = new FillersFragment();
    novelAdapFragment novelAdapFragment = new novelAdapFragment();

    public void sendData(String epspan,String arcinfo,int resID){
        Intent i = new Intent(MainActivity.this,ArcInfoActivity.class);
        Bundle content = new Bundle();
        content.putString("epspan",epspan);
        content.putString("arcinfo",arcinfo);
        content.putInt("resID",resID);
        i.putExtras(content);
        startActivity(i);
    }

    public void c_landofwaves(View v){
        String epspan = "Naruto\nEpisode 1 - Episode 19";
        String arcinfo = "The first and prologue arc of Naruto. This arc sees the formation of Team 7 and the completion of their first mission to the Land of Waves.";
        int resID = R.drawable.and_landofwaves;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Land Of Waves",Toast.LENGTH_SHORT).show();
    }

    public void c_chuninexams(View v){
        String epspan = "Naruto\nEpisode 20 - Episode 80";
        String arcinfo = "This arc sees Team 7's entrance into the Chūnin Exams and the introduction of such characters as the rest of the Rookie Nine, Team Guy, Three Sand Siblings and Orochimaru. It spans through volumes 4-13,";
        int resID = R.drawable.and_chuninexams;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Chunin Exams",Toast.LENGTH_SHORT).show();
    }

    public void c_searchfortsunade(View v){
        String epspan = "Naruto\nEpisode 81 - Episode 100";
        String arcinfo = "This arc sees the first appearance of Akatsuki as well as the competing attempts of Jiraiya and Orochimaru to recruit Tsunade. It spans through volumes 16 to 19";
        int resID = R.drawable.and_searchfortsunade;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Search For Tsunade",Toast.LENGTH_SHORT).show();
    }

    public void c_sasukerecovery(View v){
        String epspan = "Naruto\nEpisode 107 - Episode 135";
        String arcinfo = "This arc sees the attempt to stop Sasuke Uchiha from defecting to Orochimaru. It spans through volumes 20-27";
        int resID = R.drawable.and_sasukeretrieval;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this, "Sasuke Recovery", Toast.LENGTH_SHORT).show();
    }

    public void c_kazekagerescue(View v){
        String epspan = "Naruto Shippuden\nEpisode 1 - Episode 32";
        String arcinfo = "This arc sees the rescue of the Fifth Kazekage from Akatsuki. It spans through volumes 28 to 32";
        int resID = R.drawable.and_kazekagerescue;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this, "Kazekage Rescue", Toast.LENGTH_SHORT).show();
    }

    public void c_tenchibridge(View v){
        String epspan = "Naruto Shippuden\nEpisode 33 - Episode 53";
        String arcinfo = "This arc sees Team 7's mission to the Tenchi Bridge to find Sasuke Uchiha, based on information they received previously. It spans through volumes 32 to 35";
        int resID = R.drawable.and_tenchibridge;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this, "Tenchi Bridge", Toast.LENGTH_SHORT).show();
    }

    public void c_akatsukisuppression(View v){
        String epspan = "Naruto Shippuden\nEpisode 72 - Episode 88";
        String arcinfo = "This arc sees Konoha's fight against Hidan and Kakuzu of the Akatsuki who are called the <Immortal Duo>. It spans through volumes 35 to 38";
        int resID = R.drawable.and_akatsukisuppression;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Akatsuki Suppression",Toast.LENGTH_SHORT).show();
    }

    public void c_itachipursuit(View v){
        String epspan = "Naruto Shippuden\nEpisode 113 - Episode 126";
        String arcinfo = "This arc sees the separate attempts of Sasuke Uchiha and Naruto Uzumaki to find Itachi Uchiha.";
        int resID = R.drawable.and_itachipursuit;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Itachi's Pursuit",Toast.LENGTH_SHORT).show();
    }

    public void c_taleofjiraiya(View v){
        String epspan = "Naruto Shippuden\nEpisode 127 - Episode 133";
        String arcinfo = "This arc sees how Jiraiya's investigation into Pain's identity by infiltrating the Hidden Rain Village. It spans through volumes 40 to 42.";
        int resID = R.drawable.and_taleofjiraiya;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Tale Of Jiraiya, The Gallant",Toast.LENGTH_SHORT).show();
    }

    public void c_fatedbattleofbrothers(View v){
        String epspan = "Naruto Shippuden\nEpisode 134 - Episode 143";
        String arcinfo = "This arc sees the battle between Sasuke Uchiha and his brother Itachi. It spans through volumes 42 to 44";
        int resID = R.drawable.and_fatedbattle;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Fated Battle Between Brothers",Toast.LENGTH_SHORT).show();
    }

    public void c_painsassault(View v){
        String epspan = "Naruto Shippuden\nEpisode 152 - Episode 169\nEpisode 172 - Episode 175";
        String arcinfo = "This arc sees Pain's attack on Konohagakure/Hidden Leaf Village to find Naruto Uzumaki. It spans through volumes 45 to 48";
        int resID = R.drawable.and_painsassault;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Pain's Assault",Toast.LENGTH_SHORT).show();
    }

    public void c_fivekagesummit(View v){
        String epspan = "Naruto Shippuden\nEpisode 197 - Episode 214";
        String arcinfo = "This arc sees the convening of a Kage Summit to discuss how to deal with Akatsuki. It spans through volumes 49 to 51";
        int resID = R.drawable.and_fivekagesummit;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"5 Kage Summit",Toast.LENGTH_SHORT).show();
    }

    public void c_wararc(View v){
        Toast.makeText(this,"Fourth Great Ninja War",Toast.LENGTH_SHORT).show();
        Intent wi = new Intent(MainActivity.this,WarArcInfoActivity.class);
        startActivity(wi);
    }

    public void c_valleyoftheend(View v){
        String epspan = "Naruto Shippuden\nEpisode 474 - Episode 479";
        String arcinfo = "This arc sees how the two long time rivals, Naruto & Sasuke duke it out in a grand finale battle.";
        int resID = R.drawable.and_valleyoftheend;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Valley Of The End",Toast.LENGTH_SHORT).show();
    }

    public void c_novelitachi(View v){
        String epspan = "Naruto Shippuden\nEpisode 451 - Episode 458";
        String arcinfo = "The arc focuses on Itachi Uchiha's life leading up to and following the Uchiha Clan Downfall.";
        int resID = R.drawable.and_novelitachi;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Itachi's Story : Light and Dark",Toast.LENGTH_SHORT).show();
    }

    public void c_novelsasuke(View v){
        String epspan = "Naruto Shippuden\nEpisode 484 - Episode 488";
        String arcinfo = "This arc is an anime adaptation of the Sasuke Shinden: Book of Sunrise novel from the Naruto Shinden that focus on Sasuke's life after the Fourth Shinobi World War.";
        int resID = R.drawable.and_novelsasuke;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Sasuke Shinden: Book of Sunrise",Toast.LENGTH_SHORT).show();
    }

    public void c_novelshikamarucloud(View v){
        String epspan = "Naruto Shippuden\nEpisode 489 - Episode 493";
        String arcinfo = "This arc is an anime adaptation of the Shikamaru Hiden: A Cloud Drifting in Silent Darkness novel from the Naruto Hiden series that focuses on Shikamaru's life after the Fourth Shinobi World War.";
        int resID = R.drawable.and_novelshikamarucloud;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Shikamaru Hiden: A Cloud Drifting in Silent Darkness",Toast.LENGTH_SHORT).show();
    }

    public void c_novelwedding(View v){
        String epspan = "Naruto Shippuden\nEpisode 494 - Episode 500";
        String arcinfo = "This arc is an anime adaptation of the Konoha Hiden: The Perfect Day for a Wedding novel from the Naruto Hiden series that focuses on Naruto and Hinata's wedding";
        int resID = R.drawable.and_novelkonohawedding;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Konoha Hiden: The Perfect Day for a Wedding",Toast.LENGTH_SHORT).show();
    }

    public void c_novelkakashi(View v){
        String epspan = "Naruto Shippuden\nEpisode 349 - Episode 361";
        String arcinfo = " The arc focuses on Kakashi Hatake's Anbu background and life after Rin's death, while also exploring the backgrounds of others such as Yamato and Itachi Uchiha";
        int resID = R.drawable.and_kakashianbu;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Kakashi Anbu - Shinobi That Lives In Darkness",Toast.LENGTH_SHORT).show();
    }

    public void c_guardianninja(View v){
        String epspan = "Naruto Shippuden\nEpisode 54 - Episode 71";
        String arcinfo = "The arc expands upon the Twelve Guardian Ninja and Naruto's wind training through the introduction of a boy named Sora. ";
        int resID = R.drawable.and_guardianninja;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Three Tails Appearance",Toast.LENGTH_SHORT).show();
    }

    public void c_threetails(View v){
        String epspan = "Naruto Shippuden\nEpisode 89 - Episode 112";
        String arcinfo = "It deals with the efforts of Akatsuki, Konoha, and Team Guren to capture the Three-Tails.";
        int resID = R.drawable.and_threetails;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Three Tails Appearance",Toast.LENGTH_SHORT).show();
    }

    public void c_sixtails(View v){
        String epspan = "Naruto Shippuden\nEpisode 144 - Episode 151";
        String arcinfo = "It deals with the bond between masters and students named Utakata, the jinchūriki of Six-Tails, and his student Hotaru.";
        int resID = R.drawable.and_sixtails;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Six Tails Unleashed",Toast.LENGTH_SHORT).show();
    }

    public void c_pastarc(View v){
        String epspan = "Naruto Shippuden\nEpisode 176 - Episode 196";
        String arcinfo = "This arc deals with different character's memories relating to Naruto and how their perspective changed overtime.";
        int resID = R.drawable.and_pastarc;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Past Arc: Locus of Konoha",Toast.LENGTH_SHORT).show();
    }

    public void c_paradise(View v){
        String epspan = "Naruto Shippuden\nEpisode 223 - Episode 242";
        String arcinfo = "This arc shows Naruto and his team on their journey to the Land of Lightning by sea, to confine him from Akatsuki during the Fourth Shinobi World War, as well as character development for the Konoha 11.";
        int resID = R.drawable.and_paradiselifeonboat;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Paradise : Life On Boat",Toast.LENGTH_SHORT).show();
    }

    public void c_power(View v){
        String epspan = "Naruto Shippuden\nEpisode 290 - Episode 295";
        String arcinfo = "In this arc,Team Kakashi is sent on a mission to investigate the massacre of Tonika Village by Kabuto Yakushi and his reincarnated shinobi, who are searching for a treasure consisting of great power.";
        int resID = R.drawable.and_power;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Power",Toast.LENGTH_SHORT).show();
    }

    public void c_friendstracks(View v){
        String epspan = "Naruto Shippuden\nEpisode 394 - Episode 413";
        String arcinfo = "This arc focuses on the second Chūnin Exams that took place after Sasuke Uchiha's defection to Otogakure and Naruto Uzumaki's departure to train with Jiraiya.";
        int resID = R.drawable.and_friendstrack;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Friends Tracks",Toast.LENGTH_SHORT).show();
    }

    public void c_shinobihandbook(View v){
        String epspan = "Naruto Shippuden\nEpisode 432 - Episode 450";
        String arcinfo = "This arc focuses on a novel written by Jiraiya in a dream within Tsunade's Infinite Tsukuyomi dream. In the novel, key aspects of Konohagakure and the shinobi world are different.";
        int resID = R.drawable.and_shinobihandbook;
        sendData(epspan,arcinfo,resID);

        Toast.makeText(this,"Jiraiya's Shinobi Handbook",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.flayout,homeFragment).commit();


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flayout,homeFragment).commit();
                        return true;
                    case R.id.arcs:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flayout,arcFragment).commit();
                        return true;
                    case R.id.noveladap:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flayout,novelAdapFragment).commit();
                        return true;
                    case R.id.fillers:
                        getSupportFragmentManager().beginTransaction().replace(R.id.flayout,fillersFragment).commit();
                        return true;
                    case R.id.wallpapers:
                        Intent wi = new Intent(MainActivity.this,WallpaperActivity.class);
                        startActivity(wi);
                }
                return false;
            }
        });





    }
}