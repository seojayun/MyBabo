package com.example.mybabo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btndaum, btnmama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndaum=(Button)findViewById(R.id.btndaum);
        btnmama=(Button)findViewById(R.id.btnmama);
        btndaum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.daum.net"));
                startActivity(mintent);

            }
        });
       btnmama.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mintent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/01026192342"));
           }
       });



    }
}
