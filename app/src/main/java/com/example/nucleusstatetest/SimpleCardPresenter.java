package com.example.nucleusstatetest;

import android.os.Bundle;

import hugo.weaving.DebugLog;
import nucleus.presenter.RxPresenter;

public class SimpleCardPresenter extends RxPresenter<SimpleCardPresenter.View> {

    public interface View {

    }

    @DebugLog
    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
    }

    @DebugLog
    @Override
    protected void onTakeView(View view) {
        super.onTakeView(view);
    }

}