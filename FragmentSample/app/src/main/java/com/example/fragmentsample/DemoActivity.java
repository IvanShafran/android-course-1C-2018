package com.example.fragmentsample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DemoActivity extends AppCompatActivity {

    public static Intent getIntent(@NonNull final Context context) {
        return new Intent(context, DemoActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.demoMainContainer, ListFragment.newInstance())
                    .addToBackStack(null)
                    .commit();
        }
    }

    public void showDetailFragment(@NonNull final String name) {
        final View detailView = findViewById(R.id.demoDetailContainer);
        if (detailView == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.demoMainContainer, DetailFragment.newInstance(name))
                    .addToBackStack(null)
                    .commit();
        } else {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.demoDetailContainer, DetailFragment.newInstance(name))
                    .addToBackStack(null)
                    .commit();
        }
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }
}
