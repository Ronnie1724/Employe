package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Emp;
import dto.detail;

@WebServlet("/Update")
public class Update extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	detail d=new detail();
	String name=req.getParameter("name");
	int empid=Integer.parseInt(req.getParameter("empid"));
	long mobile=Long.parseLong(req.getParameter("number"));
	d.setName(name);
	d.setEmpid(empid);
	d.setNumber(mobile);
	Emp e=new Emp();
	e.update(d);
}
}
