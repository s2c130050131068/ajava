import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class loggedinpage extends HttpServlet {
	String name="system";
	String upass="apache";

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uname=request.getParameter("uname");
		String pass=request.getParameter("password");
		if(name.equals(uname)&&upass.equals(pass))
		{
			response.sendRedirect("hellopage");
		}
		else
		{
			response.sendRedirect("login.html");
			out.println("Wrong username or password");
		}
		
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
			  doGet(request,response);
		  }
}