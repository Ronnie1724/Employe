package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Emp;
import dto.detail;

@WebServlet("/Search")
public class Fetch extends  HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	Emp e=new Emp();
	detail d=e.details(id);
	if(e==null)
	{
		resp.setContentType("html/text");
		resp.getWriter().print("<h1>no data is found</h1>");
	}	
	else
	{

		List<detail> l=new ArrayList();
		l.add(d);
		req.setAttribute("list", l);
		req.getRequestDispatcher("fetch.jsp").forward(req, resp);
		
	}
}
}
