package com.mycompany.web2014integrado01.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bhpachulski
 */
@WebServlet(name = "FormularioInicioServlet", urlPatterns = {"/FormularioInicioServlet"})
public class FormularioInicioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String nome = req.getParameter("nome");
            Integer idade = Integer.parseInt(req.getParameter("idade"));
            Date nascimento = sdf.parse(req.getParameter("nasc"));
            
            resp.getWriter().print("<h1>Olá " + nome + " (" + idade + ", " + nascimento.getYear() + ")  </h1>");
        } catch (Exception e) {
            resp.getWriter().print("<h1>Data ou Número incorreto.</h1>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().print("<h1>Olá Mundo</h1>");

    }

}
