<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach var="list" items="${list}">
<div>
<h3>${list.when}</h3>
<p>${list.content}</p>
</div>
</c:forEach>