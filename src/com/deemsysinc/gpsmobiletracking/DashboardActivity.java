package com.deemsysinc.gpsmobiletracking;


import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import android.view.View;
public class DashboardActivity extends Activity{
	ListView lstvw;
	TextView welcomeusername;
	Button aboutus,contactus,signout;
	static final String[] MOBILE_OS =new String[] { "Android", "iOS", "WindowsMobile", "Blackberry"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
	
				ListView list2 = (ListView) findViewById(R.id.list);
				aboutus=(Button)findViewById(R.id.aboutus);
				contactus=(Button)findViewById(R.id.contactus);
				signout=(Button)findViewById(R.id.button1);
				welcomeusername=(TextView)findViewById(R.id.welcomeusername);
				welcomeusername.setText(LoginActivity.usernamepassed+"!");
		list2.setAdapter(new VehichleArrayAdapter(this, MOBILE_OS));
		list2.setOnItemClickListener(new OnItemClickListener()
		   {
		      
			@Override
			public void onItemClick(AdapterView<?> adapter, View arg1, int position,
					long arg3) {
				 Intent i= new Intent(DashboardActivity.this,TrackingActivity.class);
			        i.putExtra("string",(String)adapter.getItemAtPosition(position));
			        startActivity(i);
			        finish();  
				
			}
		   });
		
		 signout.setOnClickListener(new View.OnClickListener() {
				
	            
	        	public void onClick(View v) {
	        		Intent intentSignUP=new Intent(getApplicationContext(),LoginActivity.class);
     			startActivity(intentSignUP);
	        	}
		 });
		 
		 aboutus.setOnClickListener(new View.OnClickListener() {
				
	            
	        	public void onClick(View v) {
	        		Intent intentSignUP=new Intent(getApplicationContext(),Aboutus.class);
        			startActivity(intentSignUP);
	        	}
		 });
		 
		 contactus.setOnClickListener(new View.OnClickListener() {
				
	            
	        	public void onClick(View v) {
	        		Intent intentSignUP=new Intent(getApplicationContext(),ContactUs.class);
     			startActivity(intentSignUP);
	        	}
		 });
	}
		

}