package ttc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

public class AuthenticateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req ,HttpServletResponse res)
        throws ServletException, IOException {
            req.setCharacterEncoding("Windows-31J");

            String name = req.getParameter("name");
            String pass = req.getParameter("pass");

            if(name.equals("ica") && pass.equals("tera")) {
                HttpSession session = req.getSession();
                session.setAttribute("token", "OK");
            }
            RequestDispatcher dispatcher = req.getRequestDispatcher("/productinput");
            dispatcher.forward(req, res);

    }
}
