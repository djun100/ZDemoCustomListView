package com.k;

import java.util.List;

import test.lzb.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class AdapterLVTime extends BaseAdapter{  
    String tag="AdapterLVTime";
  private Context context;  
  List list;
  int minHeight;
  View ll_time;
	    public AdapterLVTime(Context context,List list){  
	    	this.context = context;  
	    	this.list=list;
	    }  
	  
	    public int getCount() {  
	        // TODO Auto-generated method stub  
	        return list.size();  
	    }  
	  
	    public Object getItem(int arg0) {  
	        // TODO Auto-generated method stub  
	        return list.get(arg0);  
	    }  
	  
	    public long getItemId(int position) {  
	        // TODO Auto-generated method stub  
	        return position;  
	    }  
  
        public View getView(int position, View convertView, ViewGroup parent) {  
            // TODO Auto-generated method stub
        	convertView = LayoutInflater.from(context).inflate(R.layout.item_shownow_lv, null);  
    	    TextView tvTemp= (TextView) convertView.findViewById(R.id.tvItemTitle);
    	    View rl= (View) convertView.findViewById(R.id.rl);
    	    rl.setMinimumHeight(minHeight);
    	    
    	    tvTemp.setText("哈哈"+position);
    	    tvTemp.setTextSize(16);
    	    tvTemp.setBackgroundColor(0xff444e97);
            ViewHolder holder = null;  
            if(convertView.getTag() == null){  
                holder = new ViewHolder();  
                holder.tv= (TextView)convertView.findViewById(R.id.tvItemTitle);  
                holder.tv.setText("Date "+position);
                convertView.setTag(holder);  
            }else {  
                holder = (ViewHolder)convertView.getTag();  
                holder.tv= (TextView)convertView.findViewById(R.id.tvItemTitle);  
                holder.tv.setText("Date "+position);

            }  
            return convertView;  
        }  
          
        private class ViewHolder{  
            TextView tv;  
        }  
    }  