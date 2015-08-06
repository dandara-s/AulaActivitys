package com.aulaandroid.estudoactivitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Tela_2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_2);
		
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
				
				i = new Intent(this, Main.class);
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
