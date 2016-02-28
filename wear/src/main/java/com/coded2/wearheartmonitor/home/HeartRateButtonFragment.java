package com.coded2.wearheartmonitor.home;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.coded2.wearheartmonitor.HeartRateActivity;
import com.coded2.wearheartmonitor.R;


public class HeartRateButtonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_heart_rate_button, container, false);

        TextView txtAction = (TextView) view.findViewById(R.id.txtAction);
        txtAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),HeartRateActivity.class);
                startActivity(it);
            }
        });

        return view;

    }
}
