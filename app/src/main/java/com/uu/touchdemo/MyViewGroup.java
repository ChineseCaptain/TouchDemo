package com.uu.touchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/**
 * description：
 * autohor：zhangguiyou
 * date: 2017/9/12.
 */

public class MyViewGroup extends RelativeLayout {


    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("uu", "ViewGroup onInterceptTouchEvent, 事件："+MotionUtils.getMotionAction(ev));
        return super.onInterceptTouchEvent(ev);
//        return false;
//        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("uu", "ViewGroup dispatchTouchEvent, 事件："+MotionUtils.getMotionAction(ev));
        return super.dispatchTouchEvent(ev);
//        return false;
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("uu", "ViewGroup onTouchEvent, 事件："+MotionUtils.getMotionAction(event));
        return super.onTouchEvent(event);
//        return false;
//        return true;
    }
}
