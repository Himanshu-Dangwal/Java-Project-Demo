package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double operand1 = Double.parseDouble(req.getParameter("operand1"));
        double operand2 = Double.parseDouble(req.getParameter("operand2"));
        String operation = req.getParameter("operation");

        Calculator calculator = new Calculator();
        double result = calculator.performOperation(operand1, operand2, operation);

        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Result: " + result + "</h1>");
    }
}

