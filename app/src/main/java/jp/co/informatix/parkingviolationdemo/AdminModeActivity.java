package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class AdminModeActivity extends AppCompatActivity {

    public static final String _tag = AdminModeActivity.class.getSimpleName();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(_tag, "onCreate()");
        
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_admin_mode);
    }
    
    @Override
    protected void onDestroy() {
        Log.d(_tag, "onDestroy()");

        super.onDestroy();
    }
}