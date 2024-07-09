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
            req.setAttribute("test1", new String("�f�[�^�P"));

            HttpSession session = req.getSession();
            session.setAttribute("test2", new String("�f�[�^�Q"));
            
            ServletContext context = getServletContext();
            context.setAttribute("test3", new String("�f�[�^�R"));

            RequestDispatcher disp = req.getRequestDispatcher("/elobject");
            disp.forward(req, res);

        }
    
}
