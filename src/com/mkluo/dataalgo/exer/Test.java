package com.mkluo.dataalgo.exer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: luomingkui
 * @Date: 2019/3/5 16:22
 * @Description:
 */

public class Test {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

    }

}