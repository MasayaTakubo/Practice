<%@ page pageEncoding="Windows-31J" contentType="text/html;charset=Windows-31J" %>
<html>
    <head><title>ログイン</title></head>
    <body>
        <h1>ログイン</h1>
        <form method='post' action="/shoji${requestScope.target}">
            ユーザー名<input type='text' name='name'><br>
            パスワード<input type='text' name='pass'><br>
            <input type='submit' value='ログイン'>
        </form>
    </body>
</html>
