package org.tensorflow.sidra;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import org.tensorflow.demo.Classifier;
import org.tensorflow.demo.ClassifierActivity;
import org.tensorflow.demo.R;

public class ResultActivity extends Activity {
    public Button resultScan,sendtoserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        resultScan = (Button) findViewById(R.id.resultScan);

        resultScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ClassifierActivity.class);
                startActivity(i);

            }
        });
    }

}
