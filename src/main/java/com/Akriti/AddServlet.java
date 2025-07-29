package com.Akriti;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import static java.awt.Color.blue;

//@WebServlet("/add")
public class AddServlet extends HttpServlet {




    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int k = i + j;
        PrintWriter out = res.getWriter();
       out.println("<html><body bgcolor='blue'>");
       out.println("the result is ="+k);
        out.println("</body></html>");


        Cookie cookie = new Cookie("k",k+"");
        res.addCookie(cookie);
        HttpSession session = req.getSession();
        session.setAttribute("k", k);
        req.setAttribute("k",k);
        res.sendRedirect("sq");


       RequestDispatcher rd= req.getRequestDispatcher("sq");
       rd.forward(req,res);
 }
}