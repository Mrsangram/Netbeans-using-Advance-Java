/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author sangram
 */
public  class FristServlet implements Servlet{
    ServletConfig conf;
    @Override
    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Servlet Starting.........");
    }
    @Override
    public void service(ServletRequest req,ServletResponse rep) throws ServletException,IOException {
        rep.setContentType("text/html");
        PrintWriter out =rep.getWriter();
        
        out.print("<h1>This is My Output from my servlet</h1>");
        out.print("<h2>Today Date and Day :"+new Date()+"</h2>");
        System.out.println("Servlet Request Accesing.....");
    }
    @Override
    public void  destroy(){
        System.out.println("Servlet Destroy...");
    }
    
    @Override
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    @Override
    public String getServletInfo(){
        return "This Servlet Creating By Sangram";
    }
    
    
}
