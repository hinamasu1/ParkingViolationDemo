package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String _tag = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(_tag, "onCreate()");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button loginTop = findViewById(R.id.button_logintop);
        loginTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginTopActivity.class);
                startActivity(intent);
            }
        });

        Button loginUser = findViewById(R.id.button_loginuser);
        loginUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginUserActivity.class);
                startActivity(intent);
            }
        });

        Button adminMode = findViewById(R.id.button_adminmode);
        adminMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AdminModeActivity.class);
                startActivity(intent);
            }
        });

        Button wizMenu = findViewById(R.id.button_wizmenu);
        wizMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WizMenuActivity.class);
                startActivity(intent);
            }
        });

        Button wizSeries = findViewById(R.id.button_wizseries);
        wizSeries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WizSeriesActivity.class);
                startActivity(intent);
            }
        });
        Button vioList = findViewById(R.id.button_violist);
        vioList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), VioListActivity.class);
                startActivity(intent);
            }
        });

        Button label = findViewById(R.id.button_label);
        label.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LabelActivity.class);
                startActivity(intent);
            }
        });

        Button vioStatics = findViewById(R.id.button_viostatics);
        vioStatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), VioStaticsActivity.class);
                startActivity(intent);
            }
        });

        Button userInfo = findViewById(R.id.button_userinfo);
        userInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UserInfoActivity.class);
                startActivity(intent);
            }
        });

        Button wizManager = findViewById(R.id.button_wizmanager);
        wizManager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WizManagerActivity.class);
                startActivity(intent);
            }
        });

        Button timeConfirm = findViewById(R.id.button_timeconfirm);
        timeConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TimeConfirmActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("param1", "arg1");
    }

    @Override
    protected void onDestroy() {
        Log.d(_tag, "onDestroy()");

        super.onDestroy();
    }
}