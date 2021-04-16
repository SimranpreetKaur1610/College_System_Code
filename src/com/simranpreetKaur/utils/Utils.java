package com.simranpreetKaur.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
    public static String currencyFormater(double d){
        Locale india = new Locale("Hello","IN");
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        return defaultFormat.format(d);
    }
}
