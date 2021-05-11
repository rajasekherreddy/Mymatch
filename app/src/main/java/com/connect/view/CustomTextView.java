package com.connect.view;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class CustomTextView extends AppCompatTextView {

    public CustomTextView(Context context) {
        super(context);
    }
    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(AppFonts.getInstance(context).getFutureStdBookFont());

    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        this.setTypeface(AppFonts.getInstance(context).getFutureStdBookFont());
    }


}
