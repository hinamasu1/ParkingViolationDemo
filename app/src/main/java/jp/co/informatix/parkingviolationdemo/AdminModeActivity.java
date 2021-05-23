package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AdminModeActivity extends AppCompatActivity {

    private static final String _tag = AdminModeActivity.class.getSimpleName();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(_tag, "onCreate()");
        
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_admin_mode);
        setOnclickListener();
    }
    
    @Override
    protected void onDestroy() {
        Log.d(_tag, "onDestroy()");

        super.onDestroy();
    }

    private void setOnclickListener() {
        Log.d(_tag, "setOnClickListener()");

        Button changeDevice = findViewById(R.id.button_change_device);
        changeDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button changePrinter = findViewById(R.id.button_change_printer);
        changePrinter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button transfer = findViewById(R.id.button_transfer);
        transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button connect = findViewById(R.id.button_connect);
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button done = findViewById(R.id.button_done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button device = findViewById(R.id.button_device);
        device.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}