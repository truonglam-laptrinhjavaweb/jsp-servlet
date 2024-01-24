package com.laptrinhjavaweb.controller;

import com.laptrinhjavaweb.model.HelloModel;
import com.laptrinhjavaweb.service.HelloWorldService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/hello")
public class HelloController extends HttpServlet {

    private HelloWorldService helloWorldService = new HelloWorldService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        request.setAttribute("model", helloWorldService.find(Integer.parseInt(id)));
        RequestDispatcher rd = request.getRequestDispatcher("/views/hello.jsp");
        rd.forward(request, response);
    }
}