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

@WebServlet("/Searchh")
public class FetchbyName extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Emp emp=new Emp();
	String name=req.getParameter("Name");
	List<detail> fetchAll = emp.fetchAll();
	int id=0;
	for(detail d:fetchAll){
		if(d.getName().equals(name)){
			id=d.getEmpid();
		}
	}
	detail details = emp.details(id);
	List<detail> finall=new ArrayList<detail>();
	finall.add(details);
	req.setAttribute("lists", finall);
	req.getRequestDispatcher("fetchbyname.jsp").forward(req, resp);
}
}
