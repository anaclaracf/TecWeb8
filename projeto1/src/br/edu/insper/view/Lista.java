package br.edu.insper.view;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import br.edu.insper.controller.DAO;
import br.edu.insper.controller.Pessoas;

import javax.servlet.annotation.WebServlet;

@WebServlet("/lista")

public class Lista extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
	
		throws ServletException, IOException {
			DAO dao = new DAO();
			List<Pessoas> pessoas = dao.getLista();
			
			request.setAttribute("pessoas",pessoas);
			RequestDispatcher dispatcher = request.getRequestDispatcher("cabecalho.jsp");
			dispatcher.forward(request, response);

			dao.close();
		}
}
