package com.example.userinfromation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "homeServlet", value = "/homeServlet")
public class homeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String language = request.getParameter("language") == null ? "Unknown" : request.getParameter("language");
        String firstName = request.getParameter("firstName") == null ? "Unknown" : request.getParameter("firstName");
        String lastName = request.getParameter("lastName") == null ? "Unknown" : request.getParameter("lastName");
        String hometown = request.getParameter("hometown") == null ? "Unknown" : request.getParameter("hometown");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String header = "<h1>Welcome, " + firstName + " " + lastName +  " "+" </h1>";
        String body1 = "<h2>Your Favorite language is " + language + "</h2>";
        String body2 = "<h2>Your Hometown is " + hometown + "</h2>";
        String markup = "<div>" + header + body1 + body2 + "</div>";
        int x = Integer.parseInt("2");
        out.write(markup);
    }

}
