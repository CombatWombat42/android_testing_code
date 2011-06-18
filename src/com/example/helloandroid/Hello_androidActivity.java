package com.example.helloandroid;

import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Hello_androidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    	final Camera camer = Camera.open();
    	Camera.Parameters camParam = camer.getParameters();
    	camParam.setFlashMode(Parameters.FLASH_MODE_TORCH);
    	camer.setParameters(camParam);
    	
    	
        final Button okB = (Button) findViewById(R.id.ok);
        final EditText entry = (EditText) findViewById(R.id.entry);
        final Button cancelB = (Button) findViewById(R.id.cancel);
        okB.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
                Toast.makeText(Hello_androidActivity.this, entry.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        cancelB.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		//Perform action on clicks
        		entry.setText("");
        	}
        }); 
        


    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}

	
}