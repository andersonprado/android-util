package br.com.thecodebakers.teste.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Outra extends Activity {
	
	private EditText txt;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outra);
    }
    
    public void fechar (View view) {
    	
    	txt = (EditText) this.findViewById(R.id.txt1);
    	Intent retorno = new Intent();
    	retorno.putExtra("valor", txt.getText().toString());
    	setResult(RESULT_OK, retorno);
    	finish();
    }
    
}
