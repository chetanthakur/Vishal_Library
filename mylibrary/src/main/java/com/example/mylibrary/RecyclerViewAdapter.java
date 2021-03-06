package com.example.mylibrary;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;

/**
 * Created by VISHAL on 4/12/2017.
 */

public class RecyclerViewAdapter implements ViewAdapter {

    private final RecyclerView mRecyclerView;

    public RecyclerViewAdapter(RecyclerView recyclerView) {
        mRecyclerView = recyclerView;
    }

    @Override
    public Context getContext() {
        return mRecyclerView.getContext();
    }

    @Override
    public int getWidth() {
        return mRecyclerView.getWidth();
    }

    @Override
    public int getChildCount() {
        return mRecyclerView.getChildCount();
    }

    @Override
    public void getLocationOnScreen(int[] locations) {
        mRecyclerView.getLocationOnScreen(locations);
    }

    @Override
    public View getChildAt(int index) {
        return mRecyclerView.getChildAt(index);
    }

    @Override
    public int getChildPosition(View childposition) {
        return mRecyclerView.getChildPosition(childposition);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        mRecyclerView.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override
    public void onTouchEvent(MotionEvent e) {
        mRecyclerView.onTouchEvent(e);
    }

    @Override
    public Object makeScrollListener(final AbsListView.OnScrollListener listener) {
        return new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                listener.onScrollStateChanged(null, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            }
        };
    }
}
