package com.example.dogtinder2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class PageMenu extends Activity {

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        
    }
    
    public void click_buttonAdopt(View view)
    {
    	Intent intent = new Intent(this, PageAdopt.class);
    	startActivity(intent);
    }
}