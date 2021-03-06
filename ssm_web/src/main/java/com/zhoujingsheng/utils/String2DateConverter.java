package com.zhoujingsheng.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String2DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if (s!=null&&s.length()>0){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            try {
                return sdf.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
