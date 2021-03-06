package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WizManagerActivity extends AppCompatActivity {

    private final String _tag = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(_tag, "onCreate()");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_wiz_manager);
    }

    @Override
    protected void onDestroy() {
        Log.d(_tag, "onDestroy()");

        super.onDestroy();
    }
}