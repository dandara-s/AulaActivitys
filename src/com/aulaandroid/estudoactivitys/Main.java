package com.aulaandroid.estudoactivitys;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main extends ActionBarActivity {

	Button btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			// chamando uma activity
				Intent i = new Intent(v.getContext(), Tela_2.class);
				startActivity( i );
			}
		});

		  
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		Intent i = null;
		
		switch(item.getItemId()){

			case R.id.mnTela1:
				Toast.makeText(this, "Tela 1", Toast.LENGTH_LONG).show();;
				
				break;
				
			case R.id.mnTela2:
				
				i = new Intent(this, Tela_2.class);
				Toast.makeText(this, "Tela 2", Toast.LENGTH_LONG).show();;
				break;
			case R.id.mnTela3:
				
				i = new Intent(this, Tela_3.class);
				Toast.makeText(this, "Tela 3", Toast.LENGTH_LONG).show();;
				break;
				
		}

		startActivity( i );
		return super.onOptionsItemSelected(item);
	}
}
