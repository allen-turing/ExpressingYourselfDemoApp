package com.example.prtsh.expressingyourself.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Upcount(View view) {
        Log.i("Message:","In Upcount Method");
        int x=0;
        while(true){
            x++;
            Log.i("x=", "" + x);
            Toast.makeText(this, "Now Value is "+ x, Toast.LENGTH_SHORT).show();

            if(x==5)
                break;
        }
        Toast.makeText(this, "Value is "+ x, Toast.LENGTH_SHORT).show();
    }

    public void Downcount(View view) {
        Log.i("Message:","In Upcount Method");
        int x=6;
        while(true){
            x--;
            Log.i("x=", "" + x);
            Toast.makeText(this, "Now Value is "+ x, Toast.LENGTH_SHORT).show();

            if(x==1)
                break;
        }
        Toast.makeText(this, "Value is "+ x, Toast.LENGTH_SHORT).show();
    }


    public void Nested(View view) {
        Log.i("message:","In nested method");
        for(int i = 0; i < 3; i ++){
            for(int j = 3; j > 0; j --){
                Log.i("i =" + i,"j=" + j);
                Toast.makeText(this, "Value is "+ j, Toast.LENGTH_SHORT).show();

            }
        }
    }
}
