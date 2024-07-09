<%@ page contentType="text/html; charset=Windows-31J" pageEncoding="Windows-31J"%>
<html>
    <head><title>ELの暗黙オブジェクト</title></head>
    <body>
        <h1>ELの暗黙オブジェクト</h1>
        <%
            // スクリプトレットを使用してクラス名を取得
            String requestClassName = pageContext.getRequest().getClass().getName();
        %>
        <p>JSPの暗黙オブジェクトrequestの利用=<%= requestClassName %></p>
        <p>JSPの暗黙オブジェクトrequestの利用=${pageContext.request.contextPath}</p>
        <p>JSPの暗黙オブジェクトsessionの利用=${pageContext.session.id}</p>

        <p>リクエストスコープのデータ=${requestScope.test1}</p>
        <p>セッションスコープのデータ=${sessionScope.test2}</p>
        <p>アプリケーションスコープのデータ=${applicationScope.test3}</p>

        <p>リクエスト入力パラメータのデータ=${param.input}</p>

        <p>リクエスト入力パラメータのデータ=${paramValues.input[0]}</p>
        <p>リクエスト入力パラメータのデータ=${paramValues.input[1]}</p>

        <p>リクエストヘッダのデータ=${header["user-agent"]}</p>

        <p>コンテキストの初期化パラメータのデータ=${initParam.param3}</p>
    </body>
</html>
