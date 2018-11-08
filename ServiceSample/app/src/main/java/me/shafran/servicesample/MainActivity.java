package me.shafran.servicesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.intentServiceFirst).setOnClickListener(this);
        findViewById(R.id.intentServiceSecond).setOnClickListener(this);
        findViewById(R.id.intentServiceBoth).setOnClickListener(this);
        findViewById(R.id.serviceStartBackground).setOnClickListener(this);
        findViewById(R.id.serviceStartForeground).setOnClickListener(this);
        findViewById(R.id.serviceStop).setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.intentServiceFirst:
                SampleIntentService.firstAction(this);
                break;
            case R.id.intentServiceSecond:
                SampleIntentService.secondAction(this);
                break;
            case R.id.intentServiceBoth:
                SampleIntentService.firstAction(this);
                SampleIntentService.secondAction(this);
                break;
            case R.id.serviceStartBackground:
                SampleService.startBackground(this);
                break;
            case R.id.serviceStartForeground:
                SampleService.startForeground(this);
                break;
            case R.id.serviceStop:
                SampleService.stopService(this);
                break;
            default:
                // Ничего не делать
        }
    }
}
