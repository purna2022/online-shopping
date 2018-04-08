<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<h1 class="my-4">Shop Name</h1>
<div class="list-group">

	<c:forEach items="${catagories}" var="catagory">
		<a href="${contextRoot}/show/catagory/${catagory.id}/products" class="list-group-item" id="a_${catagory.name}">${catagory.name}</a>
		
	</c:forEach>
	</div>