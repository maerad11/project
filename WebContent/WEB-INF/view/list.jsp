<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach var="list" items="${list}">
<h1>${list.when}</h1>
<h1>${list.content}</h1>
</c:forEach>