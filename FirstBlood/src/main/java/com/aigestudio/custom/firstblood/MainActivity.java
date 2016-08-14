package com.aigestudio.custom.firstblood;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 主界面的Activity
 *
 * @author AigeStudio{@link http://aigestudio.com/?p=75}
 * @since 2016-08－12
 */
public class MainActivity extends Activity {
    private WheelView mWheelView;// 滚动控件

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 构造一个滚动控件并设置为Activity的根视图
        mWheelView = new WheelView(this);
        setContentView(mWheelView);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // 获取一个日历对象
        Calendar c = Calendar.getInstance();

        // 获取当前日期以及当前月总的天数
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
        int daysOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        Log.i("AigeStudio", "Current day is " + dayOfMonth + " and " + daysOfMonth +
                " days in this month.");

        // 构造数据集
        List<String> date = new ArrayList<>();
        for (int i = 1; i <= daysOfMonth; i++)
            date.add(String.valueOf(i));

        // 设置数据集和选中的位置
        mWheelView.setData(date);
        mWheelView.setSelectedPosition(dayOfMonth);
    }
}