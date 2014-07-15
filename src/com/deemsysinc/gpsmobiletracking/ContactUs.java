package com.deemsysinc.gpsmobiletracking;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactUs extends Activity {
	Button email,call;
	 @Override
	  public void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.contactus);
	      email=(Button)findViewById(R.id.email);
	      call=(Button)findViewById(R.id.call);
	   
	      
	      email.setOnClickListener(new View.OnClickListener() {
				
	            
	        	public void onClick(View v) {
	        		Intent intent=new Intent(Intent.ACTION_SEND);
	        		String[] recipients={"xyz@gmail.com"};
	        		intent.putExtra(Intent.EXTRA_EMAIL, recipients);
	        		intent.putExtra(Intent.EXTRA_SUBJECT,"abc");
	        		intent.putExtra(Intent.EXTRA_TEXT,"def");
	        		intent.putExtra(Intent.EXTRA_CC,"ghi");
	        		intent.setType("text/html");
	        		startActivity(Intent.createChooser(intent, "Send mail"));
	        	}
		 });
	      
	      call.setOnClickListener(new View.OnClickListener() {
				
	            
	        	public void onClick(View v) {
	        		
	        		Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse("tel:" + "9677881101"));
	        		startActivity(intent);
	        	}
			 });
	        	
	    }

}
