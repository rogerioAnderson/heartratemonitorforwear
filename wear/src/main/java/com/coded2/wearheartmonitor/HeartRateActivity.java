package com.coded2.wearheartmonitor;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class HeartRateActivity extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_rate);
        ImageView heartIco = (ImageView) findViewById(R.id.heartico);
        Animation pulse = AnimationUtils.loadAnimation(this, R.anim.pulse);
        heartIco.setAnimation(pulse);
    }
}
