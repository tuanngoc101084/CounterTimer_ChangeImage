package com.example.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    int[] arrayImage= new int [4];
    int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        mapview();

    }

    private void mapview() {
        final CountDownTimer countDownTimer = new CountDownTimer(1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageView.setImageResource(arrayImage[i++]);
                if (i>=arrayImage.length)
                {i=0;}

            }

            @Override
            public void onFinish() {
                this.start();
            }
        };
        countDownTimer.start();
    }

    private void init() {
        imageView= findViewById(R.id.imagebanner);
        arrayImage[0]= R.drawable.banner1;
        arrayImage[1]= R.drawable.banner2;
        arrayImage[2]= R.drawable.banner3;
        arrayImage[3]= R.drawable.banner4;
    }
}
