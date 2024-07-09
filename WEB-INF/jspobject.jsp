<%@ page contentType="text/html; charset=Windows-31J" pageEncoding="Windows-31J" %>
<html>
    <head><title>JSPの暗黙オブジェクト</title></head>
    <body>
        <h1>JSPの暗黙オブジェクト</h1>
        <p>入力されたパラメータ=<%= request.getParameter("input") %></p>
        <p>リクエストスコープのデータ=<%= request.getAttribute("test1") %></p>
        <%
            String data2 = (String) session.getAttribute("test2");
            out.println("<p>セッションスコープのデータ=" + data2 + "</p>");

            String data3 = (String) application.getAttribute("test3");
            out.println("<p>アプリケーションスコープのデータ=" + data3 + "</p>");
        %>
        <p>このJSP自身のクラス名 = <%= page.getClass().getName() %></p>
        <%
            String data4 = config.getInitParameter("param1");
            out.println("<p>JSPの初期化パラメータ=" + data4 + "</p>");
        %>
        <% 
            pageContext.setAttribute("test4", new String("データ４"));
        %>
        <%
            Class[] ints = request.getClass().getInterfaces();
            for(int i = 0; i < ints.length; i++) {
                String name = ints[i].getName();
                out.println("<p>requestの実装するインターフェースは" + name + "</p>");
            }
        %>
        <p>ページスコープのデータ= <%= pageContext.getAttribute("test4") %></p>
        <p>JspWriterを継承する具象クラスの名前<%= out.getClass().getName() %></p>
    </body>
</html>
