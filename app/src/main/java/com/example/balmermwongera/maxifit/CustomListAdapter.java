package com.example.balmermwongera.maxifit;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {
    private final Activity context;
    private final String[] nameArray;
    private final Integer[] imageArray;

    public CustomListAdapter(Activity context, String[] nameArray, Integer[] imageArray) {
        super(context, R.layout.listview_row, nameArray);
        this.context = context;
        this.nameArray = nameArray;
        this.imageArray = imageArray;
    }

    @Override
    public View getView(int position, View View, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.listview_row, null, true);

        TextView nameTextField = rowview.findViewById(R.id.nameTextView);
        nameTextField.setText(nameArray[position]);
        ImageView imageView = rowview.findViewById(R.id.imgpart);
        imageView.setImageResource(imageArray[position]);

        return rowview;
    }
}
