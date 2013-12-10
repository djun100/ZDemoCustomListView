package com.k;

import test.lzb.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button b1 =(Button) findViewById(R.id.Button01);
		Button b2 =(Button) findViewById(R.id.Button02);
		
		b1.setOnClickListener(new OnClickListener(){

			public void onClick(View arg0) {
				Intent i = new Intent(Main.this, ActivityListView.class);
				startActivity(i);
			}
			
		});

		b2.setOnClickListener(new OnClickListener(){

			public void onClick(View arg0) {
				Intent i = new Intent(Main.this, MyGrid.class);
				startActivity(i);				
			}
			
		});
	}
}
