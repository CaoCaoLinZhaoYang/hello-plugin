package com.itranswarp.learnjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * App entry for Maven project.
 * 
 * @author liaoxuefeng
 */

/**
 * 用于学习maven，相关的笔记链接：
 * https://app.yinxiang.com/fx/dc7959ca-5477-43a5-a468-4dbfeba5c994
 */
public class Main {

	public static void main(String[] args) throws Exception {
//		Logger logger = LoggerFactory.getLogger(Main.class);
//		var logger = LoggerFactory.getLogger(Main.class);
		System.out.println("11111111caocao");
//		logger.info("start application...");
		for (int i = 1; i <= 10; i++) {
			Thread.sleep(100);
//			logger.warn("begin task {}...", i);
			System.out.println("2222222caocao" + i);
		}
//		logger.info("done.");
		System.out.println("333333caocao");


	}
}
