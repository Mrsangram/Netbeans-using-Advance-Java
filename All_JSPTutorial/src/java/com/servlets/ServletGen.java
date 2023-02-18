/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author sangram
 */
public class ServletGen extends GenericServlet{
    
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException,IOException{
         resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>I'm Servlet</h1>");
        out.print("<h3>Date :"+new Date()+"</h3>");
        
    }
    
}
