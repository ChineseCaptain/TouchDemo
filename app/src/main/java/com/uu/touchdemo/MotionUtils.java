package com.uu.touchdemo;

import android.view.MotionEvent;

/**
 * description：
 * autohor：zhangguiyou
 * date: 2017/9/12.
 */

public class MotionUtils {

    public static String getMotionAction(MotionEvent ev) {
        String result = "未知";
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            result = "down";
        }else if (ev.getAction() == MotionEvent.ACTION_MOVE) {
            result = "move";
        }else if (ev.getAction() == MotionEvent.ACTION_UP) {
            result = "up";
        }
        return result;
    }
}
