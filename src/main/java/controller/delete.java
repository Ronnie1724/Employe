package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Emp;

@WebServlet("/delete")
public class delete  extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("empid"));
	Emp e=new Emp();
	e.delete(id);
}
}
