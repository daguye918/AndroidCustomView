package com.aigestudio.sisterinlaw;

import android.app.Activity;
import android.os.Bundle;

/**
 * 主界面
 *
 * @author AigeStudio{@link http://aigestudio.com/?p=88}
 * @since 2016-08-15
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        final SisterView view = new SisterView(this);
//        setContentView(view);
        setContentView(R.layout.ac_main);
    }
}