package org.tensorflow.sidra;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.tensorflow.demo.Classifier;
import org.tensorflow.demo.ClassifierActivity;
import org.tensorflow.demo.R;

public class DetectedActivity extends Activity {
    public Button resultScan, sendtoserver;
    public ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detected);

        resultScan = (Button) findViewById(R.id.resultScanBtn);

        resultScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ClassifierActivity.class);
                startActivity(i);

            }
        });


        sendtoserver = (Button) findViewById(R.id.sendtoserver);

        sendtoserver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ResultActivity.class);
                startActivity(i);

            }
        });

        Bitmap _bitmap = null;
        img = (ImageView) findViewById(R.id.img);
        if(getIntent().hasExtra("byteArray")) {
            ImageView _imv= new ImageView(this);

             _bitmap = BitmapFactory.decodeByteArray(getIntent().getByteArrayExtra("byteArray"),0,getIntent().getByteArrayExtra("byteArray").length);

            img.setImageBitmap(_bitmap);
        }
    }

}
