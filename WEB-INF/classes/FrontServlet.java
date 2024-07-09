import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class FrontServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
        throws IOException, ServletException {
            req.setAttribute("test1", new String("データ１"));

            HttpSession session = req.getSession();
            session.setAttribute("test2", new String("データ２"));
            
            ServletContext context = getServletContext();
            context.setAttribute("test3", new String("データ３"));

            RequestDispatcher disp = req.getRequestDispatcher("/elobject");
            disp.forward(req, res);

        }
    
}
