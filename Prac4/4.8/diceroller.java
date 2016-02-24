import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class diceroller extends HttpServlet{
protected void doGet(HttpServletRequest request, HttpServletResponse
  response)throws ServletException, IOException{
  PrintWriter pw = response.getWriter();
  String dice1 = Integer.toString((int)(Math.random()*6)+3);
  String dice2 = Integer.toString((int)(Math.random()*6)+3);
  pw.println("<html><body>");
  pw.println("<h3>program on the dice roller in which the number in the dice will be selected randomly</h3><br>");
  pw.println("<h1>dice1 value is " + dice1 + " and <br>dice2 value is " 
  +dice2);
}
}