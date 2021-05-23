package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VioStaticsActivity extends AppCompatActivity {

    private static final String _tag = VioStaticsActivity.class.getSimpleName();
    private ArrayList<VioItem> _vioList = new ArrayList<VioItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(_tag, "onCreate()");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_vio_statics);

        View header = (View) getLayoutInflater().inflate(R.layout.header_vio_statics, null, false);
        ListView vioList = findViewById(R.id.list_list);
        vioList.addHeaderView(header, null, false);

        _vioList.add(new VioItem(1, "項目１"));
        _vioList.add(new VioItem(2, "項目２"));
        _vioList.add(new VioItem(3, "項目３"));
        _vioList.add(new VioItem(4, "項目４"));
        _vioList.add(new VioItem(5, "項目５"));
        VioListAdapter adapter = new VioListAdapter();
        vioList.setAdapter(adapter);
        vioList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(_tag, "onItemClick()");
            }
        });
    }

    private class VioItem {
        public int _count;
        public String _title;

        public VioItem(int count, String title) {
            _count = count;
            _title = title;
        }
    }

    private class VioListAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return _vioList.size();
        }

        @Override
        public Object getItem(int position) {
            return _vioList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return (long)position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup pararent) {
            View view;
            if (convertView == null) {
                LayoutInflater inflater =
                        (LayoutInflater)
                                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.row_vio_statics, null);
            } else {
                view = convertView;
            }
            VioItem vioItem = _vioList.get(position);
            TextView column1 = view.findViewById(R.id.text_column1);
            column1.setText(String.valueOf(vioItem._count));
            TextView column2 = view.findViewById(R.id.text_column2);
            column2.setText(vioItem._title);
            return view;
        }
    }
}