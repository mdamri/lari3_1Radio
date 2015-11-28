package com.example.roua.radiotn;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
public class MainActivity extends AppCompatActivity {
    protected int seconds = 4;

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 1000);


    }


    private Runnable runnable = new Runnable() {
        public void run() {
            long currentMilliseconds = System.currentTimeMillis();
            seconds--;
            if (seconds > 0) {
                handler.postAtTime(this, currentMilliseconds);
                handler.postDelayed(runnable, 1000);
            } else {
                Intent it = new Intent(MainActivity.this,
                        Main2Activity.class);
                startActivity(it);
                handler.removeCallbacks(runnable);
                finish();
            }
        }
    };


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            handler.removeCallbacks(runnable);
            Intent it = new Intent(MainActivity.this,
                    Main2Activity.class);
            startActivity(it);
            finish();
        }
        return true;
    }
}
