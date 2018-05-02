package com.nju2017.cjh.clearaccounts;


import android.icu.util.Calendar;
import android.text.format.Time;

public class TypeDone {
    //吃饭
    public void Eating(String contents) {
        //获取系统当前时间
       long time = System.currentTimeMillis();
       final Calendar mCalendar = Calendar.getInstance();
       mCalendar.setTimeInMillis(time);
       int mHour = mCalendar.get(Calendar.HOUR);
       int mMinuts = mCalendar.get(Calendar.MINUTE);

    }

    public static void save_data(String data){
        //保存到本地数据库
    }
}
