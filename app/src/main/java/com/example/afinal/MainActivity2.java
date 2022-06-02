package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {
    AnimationDrawable insideAnimation;
    AnimationDrawable roomAnimation;
    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        ImageView imgFrame = (ImageView)findViewById(R.id.imageInside);
        ImageView frame = (ImageView)findViewById(R.id.imageRooms);
        imgFrame.setBackgroundResource(R.drawable.animation1);
        frame.setBackgroundResource(R.drawable.animation2);
        insideAnimation = (AnimationDrawable) imgFrame.getBackground();
        roomAnimation = (AnimationDrawable) frame.getBackground();
        insideAnimation.run();
        roomAnimation.run();
        button1 = (Button) findViewById(R.id.btnSite);
        button2 = (Button) findViewById(R.id.btnBook);

        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wyndhamhotels.com/wingate/sylvania-ohio/wingate-by-wyndham-sylvania-toledo/overview?CID=LC:WG:20160927:RIO:Local")));

                }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);

            }

        });

    }
}