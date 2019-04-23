package com.cheer.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "HelloServlet", urlPatterns = "/servlet/HelloServlet")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("UTF-8");
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       System.out.println("username={},password={}"+username+","+password);
       if("admin".equals(username)&&"admin".equals(password)){
           System.out.println("登陆成功！");
       }else{
           System.out.println("登陆失败！");
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
