package pkprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/insert2")
public class insertServlet2 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id  = req.getParameter("id");
	
	HttpSession  session = req.getSession();
	
	session.setAttribute("id", id);
	
	req.getRequestDispatcher("WEB-INF/views/insert2.jsp").forward(req, resp);
}
}
