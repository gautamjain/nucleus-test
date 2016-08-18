package com.example.nucleusstatetest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import hugo.weaving.DebugLog;
import nucleus.factory.RequiresPresenter;
import nucleus.view.NucleusSupportFragment;

@RequiresPresenter(AlphaFragmentPresenter.class)
public class AlphaFragment extends NucleusSupportFragment<AlphaFragmentPresenter> {

    @DebugLog
    public AlphaFragment() {
        // Required empty public constructor
    }

    @DebugLog
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @DebugLog
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alpha, container, false);

        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClicked();
            }
        });

        return view;
    }

    private void onButtonClicked() {
        ((MainActivity) getActivity()).onButtonClicked();
    }

}
