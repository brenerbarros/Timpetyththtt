package com.example.dogtinder2;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PageLogin extends Activity {
	
	public DataStorage dt;
	private EditText textName, textPass;
	private TextView textInfo;
	String name, pass;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        dt = new DataStorage();
        Bundle extras = getIntent().getExtras();
        	if (extras != null) {
        		name = extras.getString("login");
        		pass = extras.getString("password");
        	}
        
        textName = (EditText)findViewById(R.id.loginName);
        textPass = (EditText)findViewById(R.id.loginPass);
        textInfo = (TextView)findViewById(R.id.textInfo);
    }
    
    public void click_textRegister (View view)
    {
    	Intent intent = new Intent(this, MainActivity.class);
    	startActivity(intent);
    }
    
    public void click_buttonLogin(View view)
    {
    	String alg = dt.getData(view.getContext(), textName.getText().toString());
    	
    	if(!alg.equals("0"))
    	{	
    		if(alg.equals(textPass.getText().toString())){
	    		Intent intent = new Intent (this, PageMenu.class);
	    		startActivity(intent);
    		}
    	}
    	
    	
    	else
    		textInfo.setText("Senha incorreta ou não há usuário registrado");
    }
}