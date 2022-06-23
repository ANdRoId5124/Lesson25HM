package com.example.lesson25hm;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


    @WebServlet(name = "helloServl", value = "/second-servlet")
    public class Second_Servlet extends HttpServlet {

        private String message;

        @Override
        public void init() {
            message = "Hello";
        }

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


            response.setContentType("text/html");

            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + message + "</h1>");
            out.println("</body></html>");

        }

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
        }

        public void destroy() {
        }
    }
