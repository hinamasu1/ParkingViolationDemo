package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class WizMenuActivity extends AppCompatActivity {

    private static final String _tag = WizMenuActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiz_menu);

        ImageButton buttonConst = findViewById(R.id.button_const);
        buttonConst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "定型モードボタン", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton buttonOne = findViewById(R.id.button_one);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "個別取締ボタン", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton buttonFree = findViewById(R.id.button_free);
        buttonFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "フリーモードボタン", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton buttonAny = findViewById(R.id.button_any);
        buttonAny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "連続取締ボタン", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton buttonDetail = findViewById(R.id.button_detail);
        buttonDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "詳細モードボタン", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton buttonPrint = findViewById(R.id.button_print);
        buttonPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "印刷設定ボタン", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton buttonStatics = findViewById(R.id.button_statics);
        buttonStatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "取締集計ボタン", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton buttonUser = findViewById(R.id.button_user);
        buttonUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ユーザー情報ボタン", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton buttonStatics2 = findViewById(R.id.button_statics2);
        buttonStatics2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "取締集計ボタン", Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonTime = findViewById(R.id.button_time);
        buttonTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "現在時刻ボタン", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton buttonExit = findViewById(R.id.button_exit);
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "終了ボタン", Toast.LENGTH_SHORT).show();
            }
        });
    }
}