<%@ page contentType="text/html; charset=Windows-31J" pageEncoding="Windows-31J" %>
<html>
    <head><title>JSP�̈ÖكI�u�W�F�N�g</title></head>
    <body>
        <h1>JSP�̈ÖكI�u�W�F�N�g</h1>
        <p>���͂��ꂽ�p�����[�^=<%= request.getParameter("input") %></p>
        <p>���N�G�X�g�X�R�[�v�̃f�[�^=<%= request.getAttribute("test1") %></p>
        <%
            String data2 = (String) session.getAttribute("test2");
            out.println("<p>�Z�b�V�����X�R�[�v�̃f�[�^=" + data2 + "</p>");

            String data3 = (String) application.getAttribute("test3");
            out.println("<p>�A�v���P�[�V�����X�R�[�v�̃f�[�^=" + data3 + "</p>");
        %>
        <p>����JSP���g�̃N���X�� = <%= page.getClass().getName() %></p>
        <%
            String data4 = config.getInitParameter("param1");
            out.println("<p>JSP�̏������p�����[�^=" + data4 + "</p>");
        %>
        <% 
            pageContext.setAttribute("test4", new String("�f�[�^�S"));
        %>
        <%
            Class[] ints = request.getClass().getInterfaces();
            for(int i = 0; i < ints.length; i++) {
                String name = ints[i].getName();
                out.println("<p>request�̎�������C���^�[�t�F�[�X��" + name + "</p>");
            }
        %>
        <p>�y�[�W�X�R�[�v�̃f�[�^= <%= pageContext.getAttribute("test4") %></p>
        <p>JspWriter���p�������ۃN���X�̖��O<%= out.getClass().getName() %></p>
    </body>
</html>
