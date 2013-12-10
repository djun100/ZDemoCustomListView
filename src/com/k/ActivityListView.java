package com.k;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.lzb.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

public class ActivityListView extends Activity {
	Context context;
	String tag="";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shownow_lv_time);
		context = this;
		ListView listView = (ListView) findViewById(R.id.lv);

		List<String> contents = new ArrayList<String>();

		listView.setAdapter(new AdapterLVTime(context, contents));
	}
}