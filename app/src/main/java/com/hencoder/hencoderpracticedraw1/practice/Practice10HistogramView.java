package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice10HistogramView extends View {
    Paint paint =new Paint();
    Path path =new Path();
    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(100,50);
        path.lineTo(100,600);
        path.lineTo(1000,600);
        path.moveTo(100,600);
        canvas.drawPath(path,paint);
        paint.setTextSize(18);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(R.color.colorAccent));
        canvas.drawRect(new RectF(150,350,200,600),paint);
        canvas.drawText("500",150,340,paint);
        paint.setColor(getResources().getColor(R.color.colorPrimaryDark));

        canvas.drawRect(new RectF(250,550,300,600),paint);
        canvas.drawText("270",250,540,paint);
        paint.setColor(Color.BLUE);

        canvas.drawRect(new RectF(350,550,400,600),paint);
        canvas.drawText("370",350,540,paint);

    }
}
