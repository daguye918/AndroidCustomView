package com.aigestudio.sisterinlaw;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * 追踪View内方法调用关系的自定义View
 *
 * @author AigeStudio{@link http://aigestudio.com/?p=88}
 * @since 2016-08-15
 */
public class SisterView extends View {
    public SisterView(Context context) {
        super(context);
        Log.i("AigeStudio", "Constructors");
    }

    public SisterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.i("AigeStudio", "Constructors from xml");
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        Log.i("AigeStudio", "onFinishInflate");
    }

    @Override
    protected void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        Log.i("AigeStudio", "onVisibilityChanged:" + changedView + ":" + visibility);
    }

    @Override
    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
        Log.i("AigeStudio", "onRtlPropertiesChanged:" + layoutDirection);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i("AigeStudio", "onAttachedToWindow");
    }

    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        Log.i("AigeStudio", "onWindowVisibilityChanged:" + visibility);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.i("AigeStudio", "onMeasure");
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Log.i("AigeStudio", "onSizeChanged");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.i("AigeStudio", "onLayout:" + changed + ":(" + left + "," + top + "," + right + ","
                + bottom + ")");
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        Log.i("AigeStudio", "onWindowFocusChanged:" + hasWindowFocus);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i("AigeStudio", "onDraw");
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i("AigeStudio", "onDetachedFromWindow");
    }
}