/**
 * @author  Madhavi
 */
package  demoservlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class serv15  extends HttpServlet
{            

	public void service(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter  pw=res.getWriter();

		pw.println("<font color=green>");
		pw.println("good evening everybody..<br>");
		pw.println("execution of original page..<br>");
		pw.println("</font>");

		RequestDispatcher rd=req.getRequestDispatcher("demodoc.html");
		rd.forward(req,res);

		pw.println("<font color=magenta>");
		pw.println("back to original page..<br>");
		pw.println("process is over..<br>");
		pw.println("</font>");

	}
}
