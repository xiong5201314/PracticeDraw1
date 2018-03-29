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

public class Practice11PieChartView extends View {
    Paint paint =new Paint();
    Path path =new Path();
    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        //画扇形
        //Lollipop的红色扇形
        canvas.drawArc(new RectF(200,100,700,600),180,120,true,paint);
        //Marshmallow的黄色部分
        paint.setColor(Color.YELLOW);
        canvas.drawArc(new RectF(220,120,720,620),-60,60,true,paint);
        //Froyo的绿色部分
        paint.setColor(Color.GREEN);
        canvas.drawArc(new RectF(220,120,720,620),5,15,true,paint);
        //Gingerbread的绿色部分
        paint.setColor(Color.WHITE);
        canvas.drawArc(new RectF(220,120,720,620),25,60,true,paint);
        //Kitkat的绿色部分
        paint.setColor(Color.BLACK);
        canvas.drawArc(new RectF(220,120,720,620),90,80,true,paint);

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.STROKE);

        //白线
        path.moveTo(325,125);
        path.lineTo(300,100);
        path.lineTo(180,100);
        canvas.drawPath(path,paint);

        paint.setStyle(Paint.Style.FILL);

        paint.setTextSize(27);
        paint.setStrokeWidth(1);
        canvas.drawText("Lillipop",120,100,paint);

        canvas.drawText("饼图",450,720,paint);





    }
}
