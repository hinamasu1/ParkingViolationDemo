package jp.co.informatix.parkingviolationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class WorkFragment extends Fragment {

    private EntryFragment.OnVioListListener _onResultListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        if (activity instanceof EntryFragment.OnVioListListener) {
            _onResultListener = (EntryFragment.OnVioListListener)activity;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle sabedInstanceState) {
        super.onCreateView(inflater, container, sabedInstanceState);
        return inflater.inflate(R.layout.fragment_work, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button entryButton = getActivity().findViewById(R.id.button_entry);
        entryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_onResultListener != null) {
                    _onResultListener.onResult(v);
                }
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        _onResultListener = null;
    }
}
