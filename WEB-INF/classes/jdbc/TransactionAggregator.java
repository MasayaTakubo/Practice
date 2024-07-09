package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class TransactionAggregator {
    public static void displayTable(String table) {
        Connection cn = new OracleConnector("info", "pro").getCn();

        TableReferer tr = new TableReferer(cn, table);
        String title = tr.getColumnName();
        System.out.println(title);

        ResultSet rs = tr.gatTableContentsA();

        try { 
            ResultSetMetaData rsmeta = rs.getMetaData();
            int columnCount = rsmeta.getColumnCount();
            while(rs.next()) {
                String raw = "";
                for(int i = 1; i <= columnCount; i++) {
                    raw += rs.getString(i) + " ";
                }
                System.out.println(raw);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                cn.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ú‘±I—¹");
    }
}
