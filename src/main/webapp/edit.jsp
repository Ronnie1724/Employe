<%@page import="dto.detail"%>
<%@page import="dao.Emp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Update" method="post">
<table>
<tr>
<th>Name:</th>
 <th><input type="text" placeholder="enter your name" name="name"></th>
 </tr>
 <tr>
 <th>Employee id:</th>
<th><input type="number" placeholder="enter your employe id" name="empid"></th>
</tr>
<tr>
<th>Mobile no:</th>
<th><input type="tel" Placeholder="enter your number" name="number" pattern="{0-9}[10]"></th>
</tr>
    <tr>                                         
    <td> <button type="reset">Cancel</button></td>
   <td> <button formaction="Save">Update</button>
    </td>
</tr>
</table>
</form>
</body>
</html>