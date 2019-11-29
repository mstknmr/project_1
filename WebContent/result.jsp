<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ page import="model.Recipe" %>
<%@ page import="java.util.ArrayList" %>
	<%
	// Servletのデータ受け取り
	request.setCharacterEncoding("UTF8");
	String strServlet = (String) request.getAttribute("fromServlet");
	ArrayList<Recipe> recipes = (ArrayList<Recipe>) request.getAttribute("recipes");
	
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>PAGE</title>
</head>
<body>
	Servletでセットしたデータを表示 ：
	<%=strServlet%>
	全要素<br>
	<%for(int i=0;i<recipes.size();i++){ 
		%>
		<%=recipes.get(i).getId() %> <br>
		<%=recipes.get(i).getName() %> <br>
	<% 
	}
	%>
	
</body>
</html>