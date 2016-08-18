package com.example.nucleusstatetest;

import android.os.Bundle;

import hugo.weaving.DebugLog;
import nucleus.presenter.RxPresenter;
import rx.Observable;
import rx.functions.Action2;
import rx.functions.Func0;

public class MainActivityPresenter extends RxPresenter<MainActivityPresenter.View> {

    @DebugLog
    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
    }

    public interface View {

        void navigateToAlphaFragment();

        void navigateToBetaFragment();

    }
}
