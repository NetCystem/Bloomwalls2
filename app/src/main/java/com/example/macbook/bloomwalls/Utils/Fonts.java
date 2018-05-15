package com.example.macbook.bloomwalls.Utils;


import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;

public class Fonts {


   public static Typeface tpf;

   Context context;

    public Fonts(Typeface tpfBold) {


        this.tpf = tpfBold;

    }


    public static Typeface getTpfRegular(Context context) {

        tpf = Typeface.createFromAsset(

                context.getAssets(),
                "fonts/sf_ui_display_regular.otf");

        return tpf;
    }


    public static Typeface getTpfBold(Context context) {

        tpf = Typeface.createFromAsset(

                context.getAssets(),
                "fonts/sf_ui_display_bold.otf");

        return tpf;

    }


}




