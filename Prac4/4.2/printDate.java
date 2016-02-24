import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class printDate extends HttpServlet{
     public void service(HttpServletRequest request, HttpServletResponse
                    response) throws ServletException, IOException{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    Date today = new Date();
    out.print("<h1>Today Date and time : </h1>");
    out.println(today);
  }
}