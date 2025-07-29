package com.Akriti;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import jakarta.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/sq")
public class SqServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        int k =Integer.parseInt(req.getParameter("k"));

    HttpSession session = req.getSession();
     k = (int)session.getAttribute("k");
       Cookie cookies[] = req.getCookies();

        for(Cookie c : cookies){
            if(c.getName().equals("k"))
            {
                k= Integer.parseInt(c.getValue());
            }

        }
       k=k*k;
        PrintWriter out = res.getWriter();
        out.println("the result is="+k);
       System.out.println("sq called");
        res.sendRedirect("home");
    }
}

