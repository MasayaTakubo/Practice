<%@ page pageEncoding="Windows-31J" contentType="text/html;charset=Windows-31J" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head><title>セッション情報の表示</title></head>
    <body>
        <h1>カート情報</h1>
        <table border="1">
            <tr><th>id</th><th>タイトル</th><th>価格</th></tr>
                <c:forEach var="book" items="${sessionScope.cart.books}">
                    <tr>
                        <td>${book.id}</td>
                        <td>${book.title}</td>
                        <td>${book.price}</td>
                    </tr>
                </c:forEach>
        </table>
    </body>
</html>