package com.k;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.lzb.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class MyGrid extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mygrid);
		GridView gridView = (GridView) findViewById(R.id.grid);

		List<Map<String, Object>> contents = new ArrayList<Map<String, Object>>();

		for (int i = 0; i < 10; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("PIC", R.drawable.pic);
			map.put("TITLE", "Test Title");
			contents.add(map);
		}
		SimpleAdapter adapter = new SimpleAdapter(this,
				(List<Map<String, Object>>) contents, R.layout.griditem,
				new String[] { "PIC", "TITLE" }, new int[] { R.id.griditem_pic,
						R.id.griditem_title, });

		gridView.setAdapter(adapter);
	}
}
