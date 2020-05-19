package com.luminous.android.a2dgraphics;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Point;
import android.view.View;

public class TransformationView extends View {

    Point[] points;
    private Path myLines;

    public TransformationView(Context context) {
        super(context);

        points = new Point[5];
        points[0] = new Point(50, 300);
        points[1] = new Point(150, 400);
        points[2] = new Point(180, 340);
        points[3] = new Point(240, 420);
        points[4] = new Point(300, 200);

    }

    protected void updatePath(Point[] newPoints) {

    }
}
