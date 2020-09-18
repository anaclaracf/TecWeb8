package br.edu.insper.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cria")
public class Cria extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<form method='post'>");
			out.println("Nome: <input type='text' name='nome'><br>");
			out.println("Altura: <input type='number' name='altura' step='0.01'><br>");
			out.println("<input type='submit' value='Submit'>");
			out.println("</form>");
			out.println("<body><html>");
		}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException {
			
			
			DAO dao = null;
			dao = new DAO();
			Pessoas pessoa = new Pessoas();
			pessoa.setNome(request.getParameter("nome"));
			pessoa.setAltura(Double.valueOf(request.getParameter("altura")));
			
			dao.adiciona(pessoa);
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("adicionado" + pessoa.getNome());
			out.println("</body></html>");
			dao.close();
	}
}
