package ttc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionEndServlet2 extends javax.servlet.http.HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
        throws ServletException, IOException {
            HttpSession session = req.getSession();
            
            session.invalidate();

            RequestDispatcher dispatcher = req.getRequestDispatcher("sessionshow2");
            dispatcher.forward(req, res);
        }    
}
