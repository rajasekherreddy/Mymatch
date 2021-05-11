package com.connect.view;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;

public class AppFonts {

    static AppFonts appFonts = null;
    private Context mContext = null;
    private Typeface nanoSans = null;
    private Typeface opificioBoldWebfont = null;

    public static AppFonts getInstance(Context context) {
        if (appFonts == null)
            appFonts = new AppFonts(context);
        return appFonts;
    }

    private AppFonts(Context context) {
        this.mContext = context;

        AssetManager assets = mContext.getAssets();
        nanoSans = Typeface.createFromAsset(assets, "fonts/NotoSans-Regular.ttf");
        opificioBoldWebfont = Typeface.createFromAsset(assets, "fonts/NotoSans-Bold.ttf");
    }

    public Typeface getFutureStdBookFont() {
        return nanoSans;
    }

}
