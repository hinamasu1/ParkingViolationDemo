package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginUserActivity extends AppCompatActivity {

    private final String _tag = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(_tag, "onCreate()");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_user);
        Button start = (Button)findViewById(R.id.button_start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "開始ボタン", Toast.LENGTH_LONG).show();
            }
        });
        Button transfer = (Button)findViewById(R.id.button_transfer);
        transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "転送ボタン", Toast.LENGTH_LONG).show();
            }
        });
        Button end = (Button)findViewById(R.id.button_end);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "終了ボタン", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        Log.d(_tag, "onDestroy()");

        super.onDestroy();
    }
}