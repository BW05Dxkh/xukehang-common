package com.xukehang.common.test;

import java.util.Properties;

import org.junit.Test;

import com.xukehang.common.utils.FileUtils;

/**
 * @author 作者:xukehang
 * @version 创建时间：2019年9月9日 下午7:12:40 类功能说明
 */
public class TestFile {
	@Test
	public void testDel() {
		FileUtils.delFilePath("D:\\ec4 - 副本");
	}

	@Test
	public void TestPro() {

		Properties properties = System.getProperties();

		properties.forEach((key, value) -> {
			System.out.println("key is : " + key);
			System.out.println("value is : " + value);
		});
	}
}
