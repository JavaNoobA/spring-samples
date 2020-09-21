package com.erudev.architecture.b_factory.servlet;

import com.erudev.architecture.a_original.service.DemoService;
import com.erudev.architecture.a_original.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 19:42
 */
@WebServlet(urlPatterns = "/demo2")
public class DemoServlet2 extends HttpServlet {

    DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(demoService.findAll().toString());
    }
}
