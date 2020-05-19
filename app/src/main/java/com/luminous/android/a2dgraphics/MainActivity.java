package com.luminous.android.a2dgraphics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MyView myView;
    private TransformationView transformationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // replace the view with custom design view
        myView = new MyView(this);
        transformationView = new TransformationView(this);

//        setContentView(myView);
        setContentView(transformationView);
    }
}
