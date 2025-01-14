<%@ page language="java" contentType="text/html; charset=Windows-31J" pageEncoding="Windows-31J"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>初期化パラメータの取得</title>
    </head>
    <body>
        <p>初期化パラメータの取得</p>
        <p>${initParam.data_format}</p>
        <p>${initParam.encoding_type}</p>

        <p>リクエストパラメータの取得</p>
        <p>${param.name}</p>
        <p>${param.pass}</p>

        <p>JSTLと併用したリクエストパラメータの取得</p>
        <c:forEach var="par" items="${paramValues.name}">
            <p>${par}</p>
        </c:forEach>
        <c:forEach var="par" items="${paramValues.pass}">
            <p>${par}</p>
        </c:forEach>
    </body>
</html>