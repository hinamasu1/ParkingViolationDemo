package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class TimeConfirmActivity extends AppCompatActivity {

    private static final String _tag = TimeConfirmActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(_tag, "onCreate()");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_time_confirm);
    }

    @Override
    protected void onDestroy() {
        Log.d(_tag, "onDestory()");

        super.onDestroy();
    }
}