package com.example.nucleusstatetest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import hugo.weaving.DebugLog;
import nucleus.factory.RequiresPresenter;
import nucleus.view.NucleusAppCompatActivity;

@RequiresPresenter(MainActivityPresenter.class)
public class MainActivity extends NucleusAppCompatActivity<MainActivityPresenter> implements MainActivityPresenter.View {

    private static final String FRAGMENT_TAG = "TAG";
    FragmentManager fm;

    @DebugLog
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();

        if (savedInstanceState == null) {
            navigateToAlphaFragment();
        }

    }

    @DebugLog
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @DebugLog
    @Override
    public void navigateToAlphaFragment() {
        Fragment f = new AlphaFragment();
        fm.beginTransaction().replace(R.id.container, f).commit();
    }

    @DebugLog
    @Override
    public void navigateToBetaFragment() {
        Fragment f = new BetaFragment();
        fm.beginTransaction().replace(R.id.container, f, FRAGMENT_TAG).addToBackStack(null).commit();
    }

    public void onButtonClicked() {
       navigateToBetaFragment();
    }
}
