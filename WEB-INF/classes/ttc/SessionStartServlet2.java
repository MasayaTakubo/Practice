package ttc;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionStartServlet2 extends javax.servlet.http.HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
            HttpSession session = req.getSession();
            
            CartBean cart = (CartBean)session.getAttribute("cart"); 
            if(cart == null) {
                cart = new CartBean();
            }

            BookBean b1 = new BookBean();
            b1.setId("1");
            b1.setTitle("Java“ü–å");
            b1.setPrice("2500");
            
            cart.addBook(b1);
            session.setAttribute("cart", cart);

            RequestDispatcher dispatcher = req.getRequestDispatcher("sessionshow2");
            dispatcher.forward(req, res);
        }

    
}
