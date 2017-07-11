package com.ideaz.dancepasstracker;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DancePasses extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dance_pass_activity);
        ListView listView = (ListView) findViewById(R.id.list_view);
        String[] dancePasses = getDancePasses();
        listView.setAdapter(new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, dancePasses));
    }

    @NonNull
    private String[] getDancePasses() {
        return new String[]{"dancepass 1", "dancepass 2", "dancepass 3"};
    }
}
