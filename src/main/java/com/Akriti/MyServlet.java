package com.Akriti;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

        protected void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
            PrintWriter out = res.getWriter();
            out.print("hi ");
            ServletConfig ah= getServletConfig();
            String str= ah.getInitParameter("name");
            out.println(str);


        }

    }

