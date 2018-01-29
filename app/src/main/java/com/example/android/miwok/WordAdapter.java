package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Pulkit on 10/21/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorId;

    public WordAdapter(Activity context, ArrayList<Word> word, int color) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, word);
        mColorId = color;
    }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;

            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.my_layout_1, parent, false);
            }

            // Get the {@link AndroidFlavor} object located at this position in the list
            final Word current = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView nameTextView = (TextView) listItemView.findViewById(R.id.Miwok_word);
            // Get the version name from the current AndroidFlavor object and
            // set this text on the name TextView
            nameTextView.setText(current.getMiwokTranslation());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView numberTextView = (TextView) listItemView.findViewById(R.id.English_word);
            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            numberTextView.setText(current.getDefaultTranslation());



            //image view
            ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

            if(current.hasImage())
            iconView.setImageResource(current.getImageResourceId());

            else
            iconView.setVisibility(View.GONE);
            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView

            View textContainer = listItemView.findViewById(R.id.text_container);
            int color = ContextCompat.getColor(getContext(), mColorId);
            textContainer.setBackgroundColor(color);

            return listItemView;
    }
}
