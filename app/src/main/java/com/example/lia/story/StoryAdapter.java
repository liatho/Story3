package com.example.lia.story;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
/**
 * Created by Lia on 2018.06.17..
 */
/**
 * An {@link StoryAdapter} knows how to create a list item layout for each story
 * in the data source (a list of {@link Story} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class StoryAdapter extends ArrayAdapter<Story> {
    /**
     * Constructs a new {@link StoryAdapter}.
     *
     * @param context of the app
     * @param stories is the list of stories, which is the data source of the adapter
     */
    public StoryAdapter(Context context, List<Story> stories) {
        super(context, 0, stories);
    }
    /**
     * Returns a list item view that displays information about the story at the given position
     * in the list of stories.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.story_list_item, parent, false);
        }
        // Find the story at the given position in the list of stories
        Story currentStory = getItem(position);
        // Find the TextView with view ID sectionName
        TextView sectionNameView = (TextView) listItemView.findViewById(R.id.sectionName);
        // Display the sectionName of the current news in that TextView
        sectionNameView.setText(currentStory.getSectionName());
        // Find the TextView with view ID webTitle
        TextView webTitleView = (TextView) listItemView.findViewById(R.id.webTitle);
        // Display the sectionName of the current news in that TextView
        webTitleView.setText(currentStory.getWebTitle());
        // Find the TextView with view ID webPublicationDate
        TextView webPublicationDateView = (TextView) listItemView.findViewById(R.id.webPublicationDate);
        // Display the sectionName of the current news in that TextView
        webPublicationDateView.setText(currentStory.getWebPublicationDate());
        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
