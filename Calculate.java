/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author longptse04304
 */
@WebServlet(urlPatterns = {"/cal"})
public class Calculate extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value1 = req.getParameter("First");
        String value2 = req.getParameter("Second");
        String value3 = req.getParameter("calcu");
        double a = Double.parseDouble(value1);
        double b = Double.parseDouble(value2);
        
        switch (value3) {
            case "+":
                resp.getWriter().println(a+b);
                break;
            case "-":
                resp.getWriter().println(a-b);
                break;
            case "*":
                resp.getWriter().println(a*b);
                break;
            case "/":
                if(b==0){
                    resp.getWriter().println("can't divide");
                }else
                    resp.getWriter().println(a/b);
                break;
            default:
                break;
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
    }
    
}
