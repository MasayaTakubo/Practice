package tera;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddUserServlet extends HttpServlet {
    private ArrayList<UserBean> users = new ArrayList<UserBean>();
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
        throws ServletException, IOException {
            req.setCharacterEncoding("Windows-31J");

            String n = req.getParameter("name");
            String p = req.getParameter("pass");

            UserBean user = new UserBean();
            user.setName(n);
            user.setPassWord(p);

            users.add(user);

            req.setAttribute("users", users);

            RequestDispatcher dispatcher = req.getRequestDispatcher("userslist");

            dispatcher.forward(req, res);
            
        }
        
    
}
