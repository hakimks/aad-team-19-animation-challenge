package com.team19.animation.utils;


import android.view.View;

public class ViewUtil {
	public static float GetScaleX(View view, int deduct) {
		return (float) (view.getWidth() - deduct) / view.getWidth();
	}
}
