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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("one");
        words.add(new Word("I am Student", "Watashi wa gakusei desu"));
        words.add(new Word("Eating using chopstick", "Hashi de tabemasu"));
        words.add(new Word("Beautiful Girlfriend", "Kirei na Kanojyo"));
        words.add(new Word("See you tommorow", "Mata ashita"));
        words.add(new Word("Uchi kara byouin made arukimashita", "I walked from home to hospital"));
        words.add(new Word("I have to drink", "Nomanakereba narimasen"));
        words.add(new Word("This book is interesting", "Kono hon wa omoshiroi desu"));
        words.add(new Word("That bag was not expensive", "kono hon wa kyonen takakunakatta no desu"));
        words.add(new Word("I gave this clothes to him", "Kare ni fuku o agemashita"));
        words.add(new Word("This shirt is too small", "Kono shatsu wa chiisasugimasu"));

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
        ListView listView = (ListView) findViewById(R.id.listPhrases);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
