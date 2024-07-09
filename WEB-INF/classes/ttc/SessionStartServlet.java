package ttc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletContext;

public class SessionStartServlet extends javax.servlet.http.HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
        throws ServletException, IOException {
            HttpSession session = req.getSession();
            
            ServletContext context = getServletContext();
            String s = context.getInitParameter("name");

            session.setAttribute("name", "ashi");
            session.setAttribute("pass", "tera");

            RequestDispatcher dispatcher = req.getRequestDispatcher("sessionshow");
            dispatcher.forward(req, res);
        }    
}
