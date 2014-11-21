package com.example.rosario.firstlabandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onClickName(View view){
        EditText text = (EditText)findViewById(R.id.nombre);
        Intent nombre = new Intent();
        nombre.putExtra("value", text.getText().toString());
        nombre.setClass(this,NameActivity.class);
        startActivity(nombre);

       /* Intent intent = new Intent(this, AgeActivity.class);
        EditText editText = (EditText) findViewById(R.id.nombre);
        String message = editText.getText().toString();
        intent.putExtra(nombre, message);
        startActivity(intent);*/

    }

    public void onClickSurname(View view){
        EditText text = (EditText)findViewById(R.id.apeido);
        Intent apeido = new Intent();
        apeido.putExtra("value", text.getText().toString());
        apeido.setClass(this,SurnameActivity.class);
        startActivity(apeido);
    }

    public void onClickAge(View view){
        EditText text = (EditText)findViewById(R.id.edad);
        Intent edad = new Intent();
        edad.putExtra("value",text.getText().toString());
        edad.setClass(this, AgeActivity.class);
        startActivity(edad);
    }

    public void onClickImg(View view){
        Intent img = new Intent(this,ImageActivity.class);
        startActivity(img);
    }



}
