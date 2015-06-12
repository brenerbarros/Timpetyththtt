package com.example.dogtinder2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class PageAdopt extends Activity {


    ImageView v;
    int count;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adopt);
       v = (ImageView) findViewById(R.id.imageView1);
       count = 1;
    }
    
    public void click_buttonNoAcept (View view)
    {    	
    	if(count < 5)
    	v.setImageResource(R.drawable.cao1 + count);
    	
    	Log.d("teste de aceitar", "vem, monstro");
    	count++;
    }
    
    public void click_buttonAcept(View view)
    {
    	
    }
}