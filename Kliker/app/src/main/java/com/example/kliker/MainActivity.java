package com.example.kliker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Integer counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("counter")){
            counter = savedInstanceState.getInt("counter");
        }
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.txt_counter)).setText(counter.toString());
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("counter")){
            counter = savedInstanceState.getInt("counter");
            ((TextView)findViewById(R.id.txt_counter)).setText(counter.toString());
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
    }

    public void onClikBtnAddPhone(View view){
        counter=counter+10000;
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }
}