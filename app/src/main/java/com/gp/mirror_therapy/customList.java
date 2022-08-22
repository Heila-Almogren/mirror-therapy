package com.gp.mirror_therapy;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class customList extends ArrayAdapter {



    private String[] sessionNumbers;
    private Integer[] sessionValues;
    private Activity context;

    public customList(Activity context, String[] sessionNumbers, Integer[] sessionValues) {
        super(context, R.layout.ListItem, sessionNumbers);
        this.context = context;
        this.sessionNumbers = sessionNumbers;
        this.sessionValues = sessionValues;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)

            row = inflater.inflate(R.layout.ListItem, null, true);
        row.setPadding(0,10,0,10);
        TextView sessionNumber = (TextView) row.findViewById(R.id.sessionName);
        TextView sessionValue = (TextView) row.findViewById(R.id.sessionValue);

        sessionNumber.setText(sessionNumbers[position]);
        sessionValue.setText(sessionValues[position]);
        return  row;
    }
}


