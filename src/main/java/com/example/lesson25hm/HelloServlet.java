package com.example.lesson25hm;

import java.io.*;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private User user;

    @Override
    public void init() {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        user = new User();
        response.setContentType("text/html");


        user.setLogin(request.getParameter("login"));
        user.setPassword(request.getParameter("password"));


        if (user.getLogin().length() > 2 && user.getPassword().length() > 2) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
//            ServletContext servletContext = getServletContext();
//            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/welcome-servlet");
//            requestDispatcher.forward(request, response);
            response.sendRedirect("welcome-servlet");

        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);


        }


    }


    public void destroy() {
    }
}
