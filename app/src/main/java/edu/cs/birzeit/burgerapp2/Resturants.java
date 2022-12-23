package edu.cs.birzeit.burgerapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Resturants extends AppCompatActivity {

ImageButton imageButton;
ImageButton imageButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturants);
        imageButton=findViewById(R.id.imageButton);
        imageButton2=findViewById(R.id.imageButton2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Handler handler = new Handler();

                handler.postDelayed(new Runnable() {
                    @Override
                    // TODO: 12/18/2022  i should make it when click on kfc open main activity not directly
                    public void run() {
                        Intent intent = new Intent(Resturants.this, KfcAnimation.class);
                        startActivity(intent);
                        finish();
                    }
                }, 0);

            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Handler handler = new Handler();

                handler.postDelayed(new Runnable() {
                    @Override
                    // TODO: 12/18/2022  i should make it when click on kfc open main activity not directly
                    public void run() {
                        Intent intent = new Intent(Resturants.this, StarbucksAnimation.class);
                        startActivity(intent);
                        finish();
                    }
                }, 0);

            }
        });

    }
    }
