package com.alick.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 功能:
 * 作者: 崔兴旺
 * 日期: 2017/10/29
 * 备注:
 */
public class CustomView extends View{
    Paint paint = new Paint();


    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        // 绘制一个圆
//        canvas.drawCircle(300, 300, 200, paint);

        //绘制一个矩形
        RectF rect=new RectF(100,500,500,600);
//        canvas.drawRect(rect,paint);

        //绘制路径
        Path path = new Path(); // 初始化 Path 对象
        paint.setStrokeWidth(20);
        paint.setTextSize(100);
        LinearGradient shader = new LinearGradient(300,0,300,800,Color.MAGENTA,Color.BLUE, Shader.TileMode.MIRROR);
        paint.setShader(shader);

        canvas.drawText("gjyGJY",100, 0,paint);

        //绘制一组图形:圆形+矩形
        path.addCircle(300, 300, 200,Path.Direction.CW);
        path.addRect(rect,Path.Direction.CCW);
        path.rLineTo(100,200);
        path.rMoveTo(100,100);
        path.rLineTo(100,-100);

        path.arcTo(100, 100, 300, 300, -90, 90, true); // 强制移动到弧形起点（无痕迹）

        canvas.drawPath(path,paint);





    }




}
