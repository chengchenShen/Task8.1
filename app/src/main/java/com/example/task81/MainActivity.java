package com.example.task81;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {

    Button play;
    EditText Url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);
        Url = findViewById(R.id.URL);



        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Url.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter URL!", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, Video.class);
                    intent.putExtra("url",Url.getText().toString());
                    startActivity(intent);
                }
            }
        });

    }
}