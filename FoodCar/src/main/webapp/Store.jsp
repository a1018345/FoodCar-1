<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jquery/jquery-3.0.0.min.js"></script>
	
<title>Insert title here</title>
</head>
<body>
   <a href="MenusServlet?sID=${select.sID}">${select.sName}</a>
  <h3>${select.sHours}</h3>
  <h3>${select.sUsername}</h3>
  <h3>${select["sIntro"]}</h3>
  <h3>${map}</h3>
   

  

 
<%--   <c:forEach var="bean" items="${map}"> --%>
  
<%--     <h3>${bean.location}</h3> --%>
    
    
<%--   </c:forEach> --%>
  

  
</body>
</html>