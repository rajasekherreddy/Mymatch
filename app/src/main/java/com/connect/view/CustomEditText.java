package com.connect.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

import java.lang.reflect.Field;

public class CustomEditText extends androidx.appcompat.widget.AppCompatEditText {

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(AppFonts.getInstance(context).getFutureStdBookFont());
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        this.setTypeface(AppFonts.getInstance(context).getFutureStdBookFont());
    }

    boolean canPaste() {
        return false;
    }

    @Override
    public boolean isSuggestionsEnabled() {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        return super.onTouchEvent(event);
    }



}
