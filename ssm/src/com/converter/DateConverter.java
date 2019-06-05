package com.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
/**
 * 
 * 处理将string类型转换为date类型
 *
 */
public class DateConverter implements Converter<String,Date>{

	@Override
	public Date convert(String str) {
		System.out.println(str);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		
		try {
			date=sdf.parse(str);
		} catch (ParseException e) {
			System.out.println("转换失败...");
		}
		return date;
	}

	
	
}
