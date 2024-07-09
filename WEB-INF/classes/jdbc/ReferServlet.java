package jdbc;

import java.io.IOException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReferServlet extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
        throws ServletException, IOException {
            req.setCharacterEncoding("Windows-31J");
            String table = req.getParameter("table");
            System.out.println(table);
            res.setContentType("text/plain; charset=Windows-31J");

            Connection cn = null;
            Statement st = null;
            ArrayList oal =new ArrayList();

            cn = new OracleConnector("info", "pro").getCn();
            TableReferer tr = new TableReferer(cn, table);
            oal.add(tr.getColumnNameList());

            ResultSet rs = tr.gatTableContentsA();

            try {
                ResultSetMetaData rsmeta = rs.getMetaData();
                int columnCount = rsmeta.getColumnCount();
                while(rs.next()) {
                    ArrayList ial = new ArrayList();
                        for(int i = 1; i <= columnCount; i++) {
                            ial.add(rs.getString(i));
                        }
                        oal.add(ial);
                }
                req.setAttribute("list", oal);
            }catch(SQLException e){
                throw new ServletException(e);
            }finally {
                if(st != null) {
                    try {
                        st.close();
                    }catch(SQLException e) {
                        e.printStackTrace();
                    }
                }
                if(cn != null) {
                    try {
                        cn.close();
                    }catch(SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
            req.getRequestDispatcher("/result.jsp").forward(req, res);
        }
    
}
