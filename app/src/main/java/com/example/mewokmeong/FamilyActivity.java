package com.example.mewokmeong;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("one");
        words.add(new Word("Father", "Otousan"));
        words.add(new Word("Mother", "Okaasan"));
        words.add(new Word("Younger Sister", "Imouto"));
        words.add(new Word("Older Sister", "Ane"));
        words.add(new Word("Younger Brother", "Itouto"));
        words.add(new Word("Older Brother", "Ani"));
        words.add(new Word("Son", "Musuko"));
        words.add(new Word("Daughter", "Musume"));
        words.add(new Word("Cousin", "Itoko"));
        words.add(new Word("Niece", "Mei"));

      /* example using Linear Layout and Text View to update
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView); // Parent View
       for (int index = 0; index < words.size(); index++) { // 0 to 9, word size = 10
            TextView wordView = new TextView(this); // Child View
            wordView.setText(words.get(index));
            rootView.addView(wordView);
        } */

      /*Here is GridView Code
      ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words); // Layout that is predefined by Android
        GridView gridView = (GridView) findViewById(R.id.list);
        gridView.setAdapter(itemsAdapter);
      */
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.listFamily);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
