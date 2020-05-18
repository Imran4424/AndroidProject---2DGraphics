package com.luminous.android.a2dgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {

    private Paint redPaint;
    private Paint bluePaint;
    private Paint greenPaint;
    private Path myLines;
    private Paint redFillPaint;
    private Paint blackBorderPaint;

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

        greenPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        greenPaint.setStyle(Paint.Style.STROKE);
        greenPaint.setColor(Color.GREEN);
        greenPaint.setStrokeWidth(10);

        redFillPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        redFillPaint.setStyle(Paint.Style.FILL);
        redFillPaint.setARGB(255, 255, 0, 0);

        blackBorderPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        

        myLines = new Path();
        myLines.moveTo(50, 300);
        myLines.lineTo(150, 400);
        myLines.lineTo(180, 350);
        myLines.lineTo(220, 420);
        myLines.lineTo(280, 250);
        myLines.close();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //Add your drawing code here
        canvas.drawRect(10,30,200,200, redPaint);
        canvas.drawCircle(300, 300, 250, bluePaint);

        canvas.drawPath(myLines, greenPaint);

//        Path quizLines = new Path();
//        quizLines.moveTo(50, 300);
//        quizLines.lineTo(160, 280);
//        quizLines.lineTo(300, 380);
//        quizLines.lineTo(380, 370);
//        quizLines.lineTo(280, 450);
//        quizLines.lineTo(100, 390);
//        quizLines.lineTo(160, 380);
//        quizLines.lineTo(50, 300);
//
//        canvas.drawPath(quizLines, greenPaint);
    }
}
