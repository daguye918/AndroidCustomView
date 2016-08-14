package com.aigestudio.custom.firstblood;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import java.util.List;

/**
 * 自定义滚动控件
 *
 * @author AigeStudio{@link http://aigestudio.com/?p=75}
 * @since 2016-08－12
 */
public class WheelView extends View implements IDataSet<List<String>> {
    private Paint mPaint;// 绘制的画笔

    private List<String> mData;// 绘制的数据集

    private float mTextHeight;// 文本高度

    private int mSelectedPosition;// 选中的数据项在数据集中的位置
    private int mCenterX, mCenterY;// 控件中心坐标
    private int mLastDownY;// 上一次触摸事件发生时的Y坐标
    private int mMoveY;// 触摸点在Y轴方向上移动的距离

    public WheelView(Context context) {
        super(context);

        // 构造绘制的画笔
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG | Paint.LINEAR_TEXT_FLAG);

        // 设置画笔颜色和文本字体大小
        mPaint.setColor(Color.GRAY);
        mPaint.setTextSize(64);

        // 计算单条文本高度
        Paint.FontMetrics metrics = mPaint.getFontMetrics();
        mTextHeight = metrics.bottom - metrics.top;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(200, 800);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        // 计算控件中心坐标
        mCenterX = w / 2;
        mCenterY = h / 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (null == mData) return;

        // 绘制数据集
        for (int i = -mSelectedPosition; i < mData.size() - mSelectedPosition; i++) {
            String day = mData.get(i + mSelectedPosition);
            canvas.drawText(day, mCenterX, mCenterY + mTextHeight * i + mMoveY, mPaint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:// 当触摸点接触屏幕 你可以理解为手指按下
                mLastDownY = (int) event.getY();
                break;
            case MotionEvent.ACTION_MOVE:// 当触摸点在屏幕上移动
                mMoveY += (int) (event.getY() - mLastDownY);
                mLastDownY = (int) event.getY();
                break;
            case MotionEvent.ACTION_UP:// 当触摸点离开屏幕 你可以理解为手指抬起
                break;
        }
        invalidate();
        return true;
    }

    @Override
    public void setData(List<String> data) {
        mData = data;
        invalidate();
    }

    @Override
    public void setSelectedPosition(int position) {
        mSelectedPosition = position;
        invalidate();
    }
}