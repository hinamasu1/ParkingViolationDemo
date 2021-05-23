package jp.co.informatix.parkingviolationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WizSeriesActivity extends AppCompatActivity {

    private static final String _tag = WizSeriesActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(_tag, "onCreate()");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_wiz_series);

        GridView gridView = findViewById(R.id.grid_list);
        /*ArrayAdapter<String> gridAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);
        gridAdapter.add("項目１");
        gridAdapter.add("項目２");
        gridAdapter.add("項目３");
        gridAdapter.add("項目４");
        gridAdapter.add("項目５");*/
        ArrayList<Bitmap> bitmapList = new ArrayList<Bitmap>();
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb1));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb2));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb3));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb4));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb5));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb6));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb7));
        //BitmapAdapter gridAdapter = new BitmapAdapter(getApplicationContext(), R.layout.row_wiz_series, bitmapList);
        BitmapAdapter gridAdapter = new BitmapAdapter(getApplicationContext(), R.layout.row_wiz_series);
        gridAdapter.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb1));
        gridAdapter.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb2));
        gridAdapter.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb3));
        gridAdapter.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb4));
        gridAdapter.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb5));
        gridAdapter.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb6));
        gridAdapter.add(BitmapFactory.decodeResource(getResources(), R.drawable.gb7));
        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(_tag, "onItemCkick()");
            }
        });

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setDropDownVerticalOffset(50);
        adapter.add("Led Zeppelin");
        adapter.add("King Crimson");
        adapter.add("Yes");
        adapter.add("Frank Zappa");
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    private class BitmapAdapter extends ArrayAdapter<Bitmap> {

        private int resourceId = R.layout.row_wiz_series;

        public BitmapAdapter(Context context, int resource) {
            super(context, resource);
            resourceId = resource;
        }

        public BitmapAdapter(Context context, int resource, List<Bitmap> objects) {
            super(context, resource, objects);
            resourceId = resource;
        }

        private BitmapAdapter(Context context, int resource, Bitmap[] object) {
            super(context, resource, object);
            resourceId = resource;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(resourceId, null);
            }

            View view = convertView;
            ImageView b = view.findViewById(R.id.image_bitmap);
            b.setImageBitmap(getItem(position));
            TextView t = view.findViewById(R.id.text_text);
            t.setText("名称");

            return view;
        }
    }
}