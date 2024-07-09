<%@page contentType="text/html; charset=Windows-31J"%>
<%@page import="java.util.ArrayList"%>

<html>
    <body>
        <table border="1">
            <tr>
                <%
                    ArrayList list = (ArrayList)request.getAttribute("list");
                    ArrayList ial = (ArrayList)list.get(0);
                    for(int i = 0; i < ial.size(); i++) {
                        String cname = (String)ial.get(i);
                %>
                        <th><%=cname %></th>
                <%
                    }
                %>
                <%
                    for(int j = 1; j < list.size(); j++) {
                        ial = (ArrayList)list.get(j);
                %>
            </tr>
                <tr>
                <%
                        for(int k = 0; k < ial.size(); k++) {
                            String cont = (String) ial.get(k);
                %>
                            <td><%=cont %></td>
                <%
                        }
                    }
                %>
                </tr>

        </table>
    </body>
</html>