
package ttc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;



public class CustomerBeanServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException {
            req.setCharacterEncoding("Windows-31J");
            String u = req.getParameter("name");
            String p = req.getParameter("pass");

            ttc.customerBean cb = new ttc.customerBean();

            cb.setName(u);
            cb.setPass(p);

            req.setAttribute("customer", cb);
            RequestDispatcher dispatcher = req.getRequestDispatcher("outputcb");

            dispatcher.forward(req, res);

            
        }

}