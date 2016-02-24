import java.io.*;
import java.io.IOException;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class holistic extends HttpServlet{
int counter = 0; //separate For Each Servlet
static Hashtable hashTable = new Hashtable(); //Shared by all the threads 

public void doGet(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
  response.setContentType("text/html");
  PrintWriter pw = response.getWriter();
  counter++;

  pw.println("<h1>This servlet has been accessed :" + counter + " :times<br>");
  hashTable.put(this,this);
  pw.println("There are currently :" + hashTable.size() + " :threads<br>");
  }
}