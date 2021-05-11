package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class VioListActivity extends AppCompatActivity implements EntryFragment.OnVioListListener {

    private static final String _tag = VioListActivity.class.getSimpleName();
    private EntryFragment _entryFragment;
    private WorkFragment _workFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(_tag, "onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vio_list);
        _entryFragment = new EntryFragment();
        _workFragment = new WorkFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.activity_vio_list, _entryFragment).show(_entryFragment);
        transaction.add(R.id.activity_vio_list, _workFragment).hide(_workFragment);
        transaction.commit();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putString("param1", "string1");
    }

    @Override
    public void onResult(View view) {
        int id = view.getId();

        if (id == R.id.button_work) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.hide(_entryFragment);
            transaction.show(_workFragment);
            transaction.commit();
        } else if (id == R.id.button_entry) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.hide(_workFragment);
            transaction.show(_entryFragment);
            transaction.commit();
        }
    }
}
