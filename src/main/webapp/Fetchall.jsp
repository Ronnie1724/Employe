<%@page import="dto.detail"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<detail> l=(List<detail>) request.getAttribute("lists"); %>
<table border='1'>
<tr>
<th>id</th>
<th>name</th>
<th>mobile</th>
<th>Delete</th>
<th>Edit</th>
</tr>
<%for(detail d:l){ %>
<tr>
<th><%=d.getEmpid() %></th>
<th><%=d.getName() %></th>
<th><%=d.getNumber() %></th>
<th><a href="delete?id=<%=d.getEmpid() %>"><button>delete</button></a></th>
<th><a href="edit.jsp?id=<%=d.getEmpid() %>"><button>edit</button></a></th>
</tr>
<%} %>
</table><br>
<a href="Home.html"><button>home</button></a>
</body>
</html>