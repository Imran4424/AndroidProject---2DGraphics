package com.luminous.android.a2dgraphics;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {

    private Paint redPaint;

    public MyView(Context context) {
        super(context);

        // Add initialization code here
        redPaint  = new Paint(Paint.ANTI_ALIAS_FLAG);
        redPaint.setStyle(Paint.Style.STROKE);
        redPaint.setColor(0xffff0000); // color red
        redPaint.setStrokeWidth(5); //set the line stroke width to 5
    }
}
