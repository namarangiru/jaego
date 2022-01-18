<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
 <script type="text/javascript" charset="utf-8">
	sessionStorage.setItem("contextpath", "${pageContext.request.contextPath}");
</script>
<title>Jaego</title>
</head>
<div class="mx-5 border">
	<header>
		<nav class="navbar navbar-expand-lg text-dark navbar-dark ">
			  <a class="navbar-brand"  class="ml-3" href="<c:url value="/main"/>">    	
			  	<img src="${pageContext.request.contextPath}/resources/icon/logo.jpg" width="100" height="80" alt="logo">
			  </a>
			    <div class="navbar-nav  mx-auto mt-5">
				    <form class="d-flex " action="<c:url value="/main/search"/>" method="get">
				    <input class="form-control me-4 col-lg-10" type="search" name ="search" placeholder="Search" aria-label="Search" id="inputlg">
				    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				   </form>
			     </div>
		 	   <nav class="navbar navbar-dark ml-4 ">
			 	   	   	<a class="nav-item nav-link mx-2 text-dark border" href="<c:url value='/user/regist'/>">register</a>
			 		  	<a class="nav-item nav-link text-dark border" href="<c:url value='/user/login'/>">login</a>
			   </nav>			
		</nav>
	</header>
	<hr>
<body>
