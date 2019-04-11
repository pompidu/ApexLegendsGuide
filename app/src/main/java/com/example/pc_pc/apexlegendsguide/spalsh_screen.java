package com.example.pc_pc.apexlegendsguide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class spalsh_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);


        //Use this activity as a splash screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(spalsh_screen.this, menu_list.class);
                spalsh_screen.this.startActivity(intent);
                spalsh_screen.this.finish();
            }
        }, 5000);

    }
}
