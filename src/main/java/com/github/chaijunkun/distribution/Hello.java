package com.github.chaijunkun.distribution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello
 * @author chaijunkun
 * @since 2016年3月14日
 */
public class Hello {
	
	private static final Logger log = LoggerFactory.getLogger(Hello.class);
	
	public void say(){
		log.info("test commit");
		log.info("Hello World! Mum! Dad, Brother!");
	}
	
}