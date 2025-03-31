package com;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class LogListener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Application Started!!.");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Application Context Distroyed");
	}
}
