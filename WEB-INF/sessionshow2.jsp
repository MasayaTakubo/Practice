<%@ page pageEncoding="Windows-31J" contentType="text/html;charset=Windows-31J" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head><title>�Z�b�V�������̕\��</title></head>
    <body>
        <h1>�J�[�g���</h1>
        <table border="1">
            <tr><th>id</th><th>�^�C�g��</th><th>���i</th></tr>
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