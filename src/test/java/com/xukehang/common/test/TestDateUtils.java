package com.xukehang.common.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.xukehang.common.utils.DateUtils;

/**
 * @author 作者:xukehang
 * @version 创建时间：2019年9月9日 下午7:12:40 类功能说明
 */
public class TestDateUtils {
	@Test
	public void testLastDate() throws ParseException {

		Date end = DateUtils.getMonthEnd(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(" end is " + end);
		System.out.println(" end is " + format.format(end));

	}
}
