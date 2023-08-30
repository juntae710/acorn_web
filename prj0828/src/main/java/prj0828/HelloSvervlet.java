package prj0828;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;


@WebServlet("/hi")
public class HelloSvervlet extends HttpServlet{
 @Override
protected void service(HttpServletRequest request, HttpServletResponse respinse) throws ServletException, IOException {
	
	 respinse.setContentType("text/html;charset=utf-8");
	 respinse.setCharacterEncoding("utf-8");
	 
	PrintWriter out = respinse.getWriter();
	String name = request.getParameter("name");
	
	if(name == null ) {
		out.print("누구인가?");
	}else {
		out.print(name + "hi~");
		
	}
	out.close();
}
}
