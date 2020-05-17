package com.luminous.android.a2dgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {

    private Paint redPaint;
    private Paint bluePaint;

    public MyView(Context context) {
        super(context);

        // Add initialization code here
        redPaint  = new Paint(Paint.ANTI_ALIAS_FLAG);
        redPaint.setStyle(Paint.Style.STROKE); //stroke only no fill
        redPaint.setColor(0xffff0000); // color red
        redPaint.setStrokeWidth(5); //set the line stroke width to 5

        bluePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        bluePaint.setStyle(Paint.Style.STROKE);
        bluePaint.setColor(Color.BLUE);
        bluePaint.setStrokeWidth(10);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //Add your drawing code here
        canvas.drawRect(10,30,200,200, redPaint);

        canvas.drawCircle(300, 300, 250, bluePaint);
        canvas.drawCircle(500, 450, 50, bluePaint);

        canvas.drawRect(500,500,700,700, redPaint);
        canvas.drawCircle(600, 600, 145, bluePaint);
    }
}
