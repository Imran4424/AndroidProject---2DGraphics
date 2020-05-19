package com.luminous.android.a2dgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.View;

public class TransformationView extends View {

    Point[] points;
    private Path myLines;
    private Paint blackBorderPaint;
    private Paint gradientPaint;
    private LinearGradient linearGradient;

    public TransformationView(Context context) {
        super(context);

        points = new Point[5];
        points[0] = new Point(50, 300);
        points[1] = new Point(150, 400);
        points[2] = new Point(180, 340);
        points[3] = new Point(240, 420);
        points[4] = new Point(300, 200);

        myLines = new Path();
    }

    protected void updatePath(Point[] newPoints) {
        myLines.reset();

        myLines.moveTo(newPoints[0].x, newPoints[0].y);
        for(int i = 1; i < newPoints.length; i++) {
            myLines.lineTo(newPoints[i].x, newPoints[i].y);
        }

        myLines.close();
    }

    protected Point[] affineTransformation(Point[] vertices, double[][] matrix) {
        Point[] result = new Point[vertices.length];

        for(int i = 0; i < vertices.length; i++) {
            int t = (int) (matrix[0][0] * vertices[i].x + matrix[0][1] * vertices[i].y + matrix[0][2]);
            int u = (int) (matrix[1][0] * vertices[i].x + matrix[1][1] * vertices[i].y + matrix[1][2]);

            result[i] = new Point(t, u);
        }

        return  result;
    }

    protected Point[] translate(Point[] input, int px, int py) {
        double[][] matrix = new double[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 0;
        matrix[0][2] = px;

        matrix[1][0] = 0;
        matrix[1][1] = 1;
        matrix[1][2] = py;

        matrix[2][0] = matrix[2][1] = 0;
        matrix[2][2] = 1;

        return affineTransformation(input, matrix);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }
}
