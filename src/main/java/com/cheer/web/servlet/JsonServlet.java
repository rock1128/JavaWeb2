package com.cheer.web.servlet;

import com.cheer.dao.EmpDao;
import com.cheer.dao.impl.EmpDaoImpl;
import com.cheer.model.Emp;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "JsonServlet", urlPatterns = "/servlet/JsonServlet" )
public class JsonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer=response.getWriter();
        EmpDao empDao = new EmpDaoImpl();
        List<Emp> empList=empDao.getList();
        Gson gson=new Gson();
        String jsonData=gson.toJson(empList);
        writer.println(jsonData);
        writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

