package com.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
/**
 * 
 * ����string����ת��Ϊdate����
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
			System.out.println("ת��ʧ��...");
		}
		return date;
	}

	
	
}
