package cn.psvmc.zjslidingtab;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by PSVMC on 15/12/11.
 */
public class ZJTabViewPager extends ViewPager {
    private boolean isCanScroll = true;
    public ZJTabViewPager(Context context) {
        super(context);
    }

    public ZJTabViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setCanScroll(boolean isCanScroll) {
        this.isCanScroll = isCanScroll;
    }

    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        if (isCanScroll) {
            return super.onTouchEvent(arg0);
        } else {
            return false;
        }

    }
}
