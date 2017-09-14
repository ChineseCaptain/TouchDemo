package com.uu.touchdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * description：
 * autohor：zhangguiyou
 * date: 2017/9/12.
 */

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("uu", "View dispatchTouchEvent, 事件："+MotionUtils.getMotionAction(ev));
        return super.dispatchTouchEvent(ev);
//        return false;
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("uu", "View onTouchEvent, 事件："+MotionUtils.getMotionAction(event));
        return super.onTouchEvent(event);
//        return false;
//        return true;
    }
}
