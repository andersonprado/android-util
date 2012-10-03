package com.example.testestartforresult;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Login extends Activity {
	EditText tia;
	EditText senha;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

	}

	public void logar(View view) {

		tia = (EditText) findViewById(R.id.tia);
		senha = (EditText) findViewById(R.id.senha);

		Intent retorno = new Intent();

		if ((tia.getText().toString().equalsIgnoreCase("1"))
				&& (senha.getText().toString().equalsIgnoreCase("2"))) {

			retorno.putExtra("valor", "OK");
			setResult(RESULT_OK, retorno);
			finish();

		} else {
			retorno.putExtra("valor", "Rejeitado");
			setResult(RESULT_OK, retorno);
			finish();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}
}
