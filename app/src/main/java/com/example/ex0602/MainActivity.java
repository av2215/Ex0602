package com.example.ex0602;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button shaked;
    int shaked2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shaked=(Button) findViewById(R.id.albert);
    }

    public void one(View view) {
        shaked2++;
        shaked.setText("This is a click number:"+shaked2);
        if(shaked2>=6)
        {
            shaked.setText("Enough to click. Go to new start!");
            shaked2=0;
        }


    }
}