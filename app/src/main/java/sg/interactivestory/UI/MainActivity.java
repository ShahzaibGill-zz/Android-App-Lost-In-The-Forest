package sg.interactivestory.UI;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import sg.interactivestory.R;

// Main page
public class MainActivity extends ActionBarActivity {

    // variable declarations
    private EditText mNameField;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText) findViewById(R.id.nameEditText);
        mStartButton = (Button) findViewById(R.id.startButton);

        // "listens" for button to be pressed and executes function onClick
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameField.getText().toString();
                startStory(name);
            }
        });
    }

    private void startStory(String name) {
        // "this" refers to main activity class (above)
        Intent intent = new Intent(this,StoryActivity.class);
        // passing data to StoryActivity through intent object
        intent.putExtra(getString(R.string.key_name), name);
        // intent to start activity when startStory is executed in class above.
        startActivity(intent);


    }
}
