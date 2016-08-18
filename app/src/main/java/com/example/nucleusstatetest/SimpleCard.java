package com.example.nucleusstatetest;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import hugo.weaving.DebugLog;
import nucleus.factory.RequiresPresenter;
import nucleus.view.NucleusLayout;

@RequiresPresenter(SimpleCardPresenter.class)
public class SimpleCard extends NucleusLayout<SimpleCardPresenter>
        implements SimpleCardPresenter.View {

    @DebugLog
    public SimpleCard(Context context) {
        super(context);
        init(context);
    }

    @DebugLog
    public SimpleCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    @DebugLog
    public SimpleCard(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    @DebugLog
    protected void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.card_simple, this, true);
    }

    @DebugLog
    @Override
    protected Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    @DebugLog
    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(state);
    }

    @DebugLog
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @DebugLog
    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}