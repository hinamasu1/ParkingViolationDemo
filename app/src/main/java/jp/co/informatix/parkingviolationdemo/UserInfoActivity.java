package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class UserInfoActivity extends AppCompatActivity {

    private static final String _tag = UserInfoActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(_tag, "onCreate()");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_user_info);

        Button ok = findViewById(R.id.button_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(_tag, "OKボタン押下");
                finish();
            }
        });

        TextView policeStation = findViewById(R.id.text_policestation);
        policeStation.setText("大阪署");
        TextView telephone = findViewById(R.id.text_telephone);
        telephone.setText("090-1111-2222");
        TextView extension = findViewById(R.id.text_extension);
        extension.setText("OOOO");
        TextView device = findViewById(R.id.text_device);
        device.setText("999");

        TextView inputName = findViewById(R.id.text_input_name);
        inputName.setText("入力次郎");
        TextView inputId = findViewById(R.id.text_input_id);
        inputId.setText("1111111");
        TextView inputPeriod = findViewById(R.id.text_input_period);
        inputPeriod.setText("2021/01/31まで");

        TextView printName = findViewById(R.id.text_print_name);
        printName.setText("印刷花子");
        TextView printId = findViewById(R.id.text_print_id);
        printId.setText("2222222");
        TextView printPeriod = findViewById(R.id.text_print_period);
        printPeriod.setText("2021/01/31まで");
    }

    @Override
    protected void onDestroy() {
        Log.d(_tag, "onDestroy()");

        super.onDestroy();
    }
}