package com.applicationcontext;

import com.applicationcontext.config.AppConfig;
import com.applicationcontext.hello.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld helloWorld = context.getBean(HelloWorld.class);

		helloWorld.Hello();
	}
}
