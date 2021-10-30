package com.example.simplepoject;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Home")
public class homeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String firstName = request.getParameter("firstName");
        if(firstName ==  null){
            request.getParameter("Unknown");
        }
        String lastName = request.getParameter("lastName") ;
        if(lastName ==  null){
            request.getParameter("Unknown");
        }
        String language = request.getParameter("language");
        if(language ==  null){
            request.getParameter("Unknown");
        }
        String hometown = request.getParameter("hometown");
        if(hometown ==  null){
            request.getParameter("Unknown");
        }

        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        out.println("<h1>Welcome, " + firstName + " " + lastName +  "  "+" </h1>");
        out.println("<h2>Your Favorite language is : " + language + "</h2>");
        out.println("<h2>Your Hometown is : " + hometown + "</h2>");
        out.println("</body></html>");
    }
    public void destroy() {
    }
}