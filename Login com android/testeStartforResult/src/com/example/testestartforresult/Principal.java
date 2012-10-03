package com.example.testestartforresult;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.EditText;

public class Principal extends Activity {
	EditText saida;
	private static final int CODIGO_SUBATIVIDADE = 11;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);
		
		Intent i = new Intent(this.getApplicationContext(), Login.class);
		startActivityForResult(i, CODIGO_SUBATIVIDADE);

	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == CODIGO_SUBATIVIDADE) {
			Bundle extras = data.getExtras();
		
			String texto = extras.getString("valor");
			
			saida = (EditText) findViewById(R.id.texto);
			saida.setText(texto);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}
}
