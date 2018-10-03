package com.example.fragmentsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DynamicFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.dynamicFragmentActivityContainer, ExampleFragment.newInstance())
                .commit();
    }
}
