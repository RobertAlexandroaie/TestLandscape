package com.fii.testlandscape;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);

	if (savedInstanceState != null) {
	    counter = savedInstanceState.getInt("counter");
	    TextView textView = (TextView) (findViewById(R.id.counterTextView));
	    if (textView != null) {
		textView.setText(String.valueOf(counter));
	    }
	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
    }

    public void incrementCounter(View view) {
	counter++;
	TextView textView = (TextView) this.findViewById(R.id.counterTextView);
	textView.setText(String.valueOf(counter));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
	super.onSaveInstanceState(outState);
	outState.putInt("counter", counter);
    }

}
