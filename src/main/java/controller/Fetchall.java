package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Emp;
import dto.detail;

@WebServlet("/Fetchall")
public class Fetchall extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Emp e=new Emp();
	List<detail> list =e.fetchAll();
	req.setAttribute("lists", list);
	req.getRequestDispatcher("Fetchall.jsp").forward(req, resp);
}
}
