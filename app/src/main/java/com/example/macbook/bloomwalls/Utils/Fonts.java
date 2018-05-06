package com.example.macbook.bloomwalls.Utils;


import android.content.Context;
import android.graphics.Typeface;

public class Fonts {


   public static Typeface tpfRegular;
   public static Typeface tpfBold;

    public Fonts(Typeface tpfRegular, Typeface tpfBold) {

        this.tpfRegular = tpfRegular;
        this.tpfBold = tpfBold;

    }


    public static Typeface getTpfRegular(Context context) {

        tpfRegular = Typeface.createFromAsset(

                context.getAssets(),
                "fonts/sf_ui_display_regular.otf");

        return tpfRegular;
    }


    public static Typeface getTpfBold(Context context) {

        tpfBold = Typeface.createFromAsset(

                context.getAssets(),
                "fonts/sf_ui_display_bold.otf");

        return tpfBold;
    }


}




