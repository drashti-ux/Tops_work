package com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class MyListener implements HttpSessionListener{
	int cuser = 0;
	int tuser = 0;
	@Override
	public void sessionCreated(HttpSessionEvent se) {	
		cuser++;
		tuser++;
		ServletContext ctx = se.getSession().getServletContext();
		ctx.setAttribute("cuser", cuser+"");
		ctx.setAttribute("tuser", tuser+"");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		cuser--;
		ServletContext ctx = se.getSession().getServletContext();
		ctx.setAttribute("tuser", tuser+"");
	}
}
