
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String name = req.getParameter("name");
        String pass = req.getParameter("pass");
    
        if(name.equals("Demo")&&pass.equals("1234"))
        {
            // Redirect to Second Servlet
            RequestDispatcher rd = req.getRequestDispatcher("/SecondServlet");
            rd.forward(req, resp);
        }
        else
        {
            // Redirect to Login page
        }
    }
    
}
