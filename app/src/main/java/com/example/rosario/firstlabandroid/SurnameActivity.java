package com.example.rosario.firstlabandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class SurnameActivity extends Activity {

    TimerTask timerTask;
    Timer timer = new Timer();
    TextView textview;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surname);
        textview = (TextView)findViewById(R.id.mySurname);
        textview.setText(getIntent().getStringExtra("value"));
        //callTimerTask();

    }

    public void homeView(View view){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }

    public void callTimerTask(){
        timerTask = new TimerTask() {
            @Override
            public void run() {
                if(count == 0){
                    count++;
                    textview.setText("");
                }else{
                    textview.setText(getIntent().getStringExtra("value"));
                    count = 0;
                }
            }
        };
        timer.schedule(timerTask,200,500);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_surname, menu);
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
}
