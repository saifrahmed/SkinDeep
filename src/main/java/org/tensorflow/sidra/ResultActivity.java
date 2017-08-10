package org.tensorflow.sidra;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.tensorflow.demo.Classifier;
import org.tensorflow.demo.ClassifierActivity;
import org.tensorflow.demo.R;

public class ResultActivity extends Activity {
    public Button resultScan,sendtoserver;
    public TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        resultScan = (Button) findViewById(R.id.resultScan);

        info = (TextView) findViewById(R.id.info);


        if(getIntent().hasExtra("info")) {
            info.setText(getIntent().getStringExtra("info"));

        }

        resultScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ClassifierActivity.class);
                startActivity(i);

            }
        });
    }

}
