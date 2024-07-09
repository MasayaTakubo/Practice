package ttc;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCountServlet extends javax.servlet.http.HttpServlet {
        protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{
                ServletContext context = getServletContext();
                Integer value = (Integer)context.getAttribute("counter");

                if(value == null) {
                    value = new Integer(1);
                    context.setAttribute("counter", value);
                } else {
                    int count = value.intValue();
                    count++;
                    Integer newValue = new Integer(count);
                    context.setAttribute("counter", newValue);
                }

                RequestDispatcher dispatcher = req.getRequestDispatcher("countshow");
                dispatcher.forward(req, res);
        }
    
}
