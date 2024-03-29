package com.geekyants.kitchensinkappnativebase;

import android.os.Bundle;
import android.view.MotionEvent;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactRootView;
import com.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;
import com.tl.uic.Tealeaf;

import expo.modules.ReactActivityDelegateWrapper;

public class MainActivity extends ReactActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(null);
  }


    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "main";
    }

    @Override
    protected ReactActivityDelegate createReactActivityDelegate() {
        return new ReactActivityDelegateWrapper(this,
            new ReactActivityDelegate(this, getMainComponentName()) {
                @Override
                protected ReactRootView createRootView() {
                    return new RNGestureHandlerEnabledRootView(MainActivity.this);
                }
            }
        );
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent e) {
        Tealeaf.dispatchTouchEvent(this, e);
        return super.dispatchTouchEvent(e);
    }
}
