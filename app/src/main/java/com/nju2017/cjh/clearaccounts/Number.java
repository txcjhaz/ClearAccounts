package com.nju2017.cjh.clearaccounts;

public class Number {
    public void saveInput(String str, String tpye){
        TypeDone action = new TypeDone();
        if (tpye.equals("吃饭")){
            action.Eating(str);
        }
    }

    public static int TypeInput(String str){
        //识别出用户所记账目的类型

    }


}
