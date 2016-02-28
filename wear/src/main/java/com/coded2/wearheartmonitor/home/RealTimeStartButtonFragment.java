package com.coded2.wearheartmonitor.home;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coded2.wearheartmonitor.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RealTimeStartButtonFragment extends Fragment {


    public RealTimeStartButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_real_time_start_button, container, false);
    }

}
