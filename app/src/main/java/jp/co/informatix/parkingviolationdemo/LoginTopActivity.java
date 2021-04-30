package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginTopActivity extends AppCompatActivity {

    private final String _tag = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(_tag, "onCreate()");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_top);
        TextView version = (TextView)findViewById(R.id.text_version);
        version.setText("Ver " + "4.4.26a");
        Button recover = (Button)findViewById(R.id.button_recover);
        recover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginTopActivity.this, WizManagerActivity.class);
                startActivity(intent);
            }
        });
        Button start = (Button)findViewById(R.id.button_start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginTopActivity.this, LoginUserActivity.class);
                startActivity(intent);
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
