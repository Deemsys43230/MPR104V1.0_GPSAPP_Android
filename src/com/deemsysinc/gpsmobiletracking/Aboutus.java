package com.deemsysinc.gpsmobiletracking;






import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

@SuppressWarnings("deprecation")
public class Aboutus extends TabActivity implements OnTabChangeListener{
	TabHost tabHost;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutus);
		  tabHost = getTabHost();
		  tabHost.setOnTabChangedListener(this);
		  
	      TabHost.TabSpec spec;
	      Intent intent;
	      intent = new Intent().setClass(this, AboutusTab.class);
	      spec = tabHost.newTabSpec("First").setIndicator("")
	                    .setContent(intent);
	      tabHost.addTab(spec);
	      intent = new Intent().setClass(this, PrivacyAndPolicyTab.class);
	      spec = tabHost.newTabSpec("Second").setIndicator("")
	                    .setContent(intent);  
	      tabHost.addTab(spec);
	      intent = new Intent().setClass(this, TermsAndConditionTab.class);
	      spec = tabHost.newTabSpec("Third").setIndicator("")
	                    .setContent(intent);
	      tabHost.addTab(spec);
	     
	      tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.ic_launcher);
		  tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.ic_launcher);
		  tabHost.getTabWidget().setCurrentTab(0);
	      tabHost.getTabWidget().getChildAt(0).setBackgroundResource(R.drawable.ic_launcher);
}

	@Override
	public void onTabChanged(String arg0) {
		// TODO Auto-generated method stub
	    for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
			{
		    	if(i==0)
		    	    tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.ic_launcher);
		    	else if(i==1)
		    		tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.ic_launcher);
		    	else if(i==2)
		    		tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.ic_launcher);
		    }
		    
		    
		    Log.i("tabs", "CurrentTab: "+tabHost.getCurrentTab());
		    
		    if(tabHost.getCurrentTab()==0)
		    	tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.ic_launcher);
		    else if(tabHost.getCurrentTab()==1)
		    	tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.ic_launcher);
		    else if(tabHost.getCurrentTab()==2)
		    	tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.ic_launcher);
		    
		
	}
}