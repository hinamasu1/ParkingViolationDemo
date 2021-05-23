package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeConfirmActivity extends AppCompatActivity {

    private static final String _tag = TimeConfirmActivity.class.getSimpleName();
    private Timer _timer;
    private Timer _messageTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(_tag, "onCreate()");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_time_confirm);

        final Button buttonYes = findViewById(R.id.button_yes);
        buttonYes.setEnabled(false);
        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        final Button buttonNo = findViewById(R.id.button_no);
        buttonNo.setEnabled(false);
        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        _timer = new Timer();
        _timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        Date date = new Date(System.currentTimeMillis());
                        TextView textTime = findViewById(R.id.text_time);
                        textTime.setText(dateFormat.format(date));
                    }
                });
            }
        }, 0, 1000);

        _messageTimer = new Timer();
        _messageTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Handler handler = new Handler(Looper.getMainLooper());
                _messageTimer.cancel();
                _messageTimer = null;
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        buttonYes.setEnabled(true);
                        buttonNo.setEnabled(true);
                    }
                });
            }
        }, 3000, 3000);
    }

    @Override
    protected void onDestroy() {
        Log.d(_tag, "onDestory()");

        super.onDestroy();

        if (_timer != null) {
            _timer.cancel();
            _timer = null;
        }

        if (_messageTimer != null) {
            _messageTimer.cancel();
            _messageTimer = null;
        }
    }
}