package com.coded2.wearheartmonitor;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.wearable.view.DotsPageIndicator;
import android.support.wearable.view.GridViewPager;
import android.widget.TextView;

import com.coded2.wearheartmonitor.home.HeartRateButtonFragment;
import com.coded2.wearheartmonitor.home.RealTimeStartButtonFragment;

public class MainWearActivity extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_wear);
        final Resources res = getResources();
        final GridViewPager pager = (GridViewPager) findViewById(R.id.pager);
        GridFragmentAdapter adapter = new GridFragmentAdapter(getFragmentManager());
        adapter.addRow(new HeartRateButtonFragment(),new RealTimeStartButtonFragment());
        pager.setAdapter(adapter);
        DotsPageIndicator dotsPageIndicator = (DotsPageIndicator) findViewById(R.id.page_indicator);
        dotsPageIndicator.setPager(pager);

    }
}
