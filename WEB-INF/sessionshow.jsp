<%@ page pageEncoding="Windows-31J" contentType="text/html;charset=Windows-31J" %>
<html>
    <head><title>セッション情報の表示</title></head>
    <body>
        <h1>セッション情報</h1>
        登録されたユーザー:${sessionScope.name}<br>
        登録されたパスワード:${sessionScope.pass}
    </body>
</html>