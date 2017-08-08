package org.tensorflow.sidra;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;

import org.tensorflow.demo.ClassifierActivity;
import org.tensorflow.demo.R;

public class SplashActivity extends Activity {

    public Handler splashHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashHandler = new Handler();
        splashHandler.postDelayed(new welcomeEntry(), 3000);
    }

    class welcomeEntry implements Runnable {
        public void run() {

            Intent intent2 = new Intent(SplashActivity.this, ClassifierActivity.class);
            intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent2);
            finish();
        }

    }
}
