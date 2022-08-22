package com.gp.mirror_therapy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class reportsList extends AppCompatActivity {

    private  View root;
    private ListView listView;
    static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports_list);
        context = this;

        listView = (ListView) findViewById(R.id.OptionsList);

        final String[] sessionsList = new String[]{"session 1", "session 2",
                "session 3"};
        Integer sessionsValues[] = {
                -3,
                1,
                -2,
        };

        customList adapter = new customList(this, sessionsList, sessionsValues);

        listView.setAdapter(adapter);

    }

    public static Context getContext(){
        return getContext();
    }
    public static Context getMainContext(){
        return context;
    }


}