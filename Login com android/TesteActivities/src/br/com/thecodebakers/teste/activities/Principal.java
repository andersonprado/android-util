package br.com.thecodebakers.teste.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends Activity {
	private EditText saida;
	private static final int CODIGO_SUBATIVIDADE = 11;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void chamar(View view) {
		Intent i = new Intent(this.getApplicationContext(), Outra.class);
		startActivityForResult(i, CODIGO_SUBATIVIDADE);

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		try {

			super.onActivityResult(requestCode, resultCode, data);
			if (requestCode == CODIGO_SUBATIVIDADE) {
				Bundle extras = data.getExtras();

				String texto = extras.getString("valor");

				saida = (EditText) findViewById(R.id.texto);
				saida.setText(texto);

				new AlertDialog.Builder(this)
						.setMessage(texto)
						.setTitle(R.string.titulo)
						.setNeutralButton("OK",
								new DialogInterface.OnClickListener() {
									public void onClick(DialogInterface dialog,
											int which) {
									}
								}).show();
			}

		} catch (NullPointerException e) {

		}
	}
}