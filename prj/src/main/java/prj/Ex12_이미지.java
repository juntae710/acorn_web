package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex12")
public class Ex12_이미지 extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			out.println("<html>");;
			out.println("<head>");;
			out.println("</head>");;
			out.println("<body>");;
			out.println("<img src=\"/prj/img/img.jpg\">");;
			out.println("</body>");;
			out.println("</html>");;
}
}
