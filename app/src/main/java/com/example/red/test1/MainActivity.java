package com.example.red.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ToggleButton Camswitch = findViewById(R.id.toggleButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Interface ; so has an abstract method
        Camswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    // Turn Camera ON and run in video window
                } else {
                    // The toggle is disabled
                    // Turn Camera OFF
                }
            }
        });
    }
}
