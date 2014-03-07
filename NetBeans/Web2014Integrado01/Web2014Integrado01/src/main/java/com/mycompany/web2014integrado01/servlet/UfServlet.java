package com.mycompany.web2014integrado01.servlet;

import com.mycompany.web2014integrado01.dao.UfDao;
import com.mycompany.web2014integrado01.modelo.Estado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bhpachulski
 */
@WebServlet(name = "UfServlet", urlPatterns = {"/UfServlet"})
public class UfServlet extends HttpServlet { 

    UfDao ufDao = new UfDao();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Integer id = Integer.parseInt(req.getParameter("id"));
        String nome = req.getParameter("nome");
        String sigla = req.getParameter("sigla").toUpperCase();
        
        Estado e = new Estado();
        e.setId(id);
        e.setNome(nome);
        e.setSigla(sigla);
        
        ufDao.insert(e);
        
        resp.getWriter().print("Estados cadastrados: ");
        resp.getWriter().print(ufDao.list());
    }
    
}
