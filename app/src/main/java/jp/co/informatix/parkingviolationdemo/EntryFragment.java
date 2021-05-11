package jp.co.informatix.parkingviolationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class EntryFragment extends Fragment {

    private final String _tag = getClass().getSimpleName();
    private VioListActivity _activity;
    private OnVioListListener _onResultListener;

    public interface OnVioListListener {
        public void onResult(View view);
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        Log.d(_tag, "onAttach()");

        super.onAttach(activity);

        _activity = (VioListActivity)activity;
        if (activity instanceof OnVioListListener) {
            _onResultListener = (OnVioListListener) activity;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle sabedInstanceState) {
        super.onCreateView(inflater, container, sabedInstanceState);
        return inflater.inflate(R.layout.fragment_entry, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button workButton = _activity.findViewById(R.id.button_work);
        workButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                FragmentTransaction transaction = _activity.getSupportFragmentManager().beginTransaction();
//                transaction.hide(_activity._entryFragment);
//                transaction.show(_activity._workFragment);
                transaction.setMaxLifecycle(_activity._workFragment, Lifecycle.State.RESUMED);
                transaction.setMaxLifecycle(_activity._entryFragment, Lifecycle.State.STARTED);
                transaction.commit();
              */
                if (_onResultListener != null) {
                    _onResultListener.onResult(v);
                }
            }
        });
    }

    @Override
    public void onResume() {
        Log.d("xxxx", "xxx");
        super.onResume();
    }
    @Override
    public void onPause() {
        Log.d("xxx", "xxxx");
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        _activity = null;
        _onResultListener = null;
    }
}
