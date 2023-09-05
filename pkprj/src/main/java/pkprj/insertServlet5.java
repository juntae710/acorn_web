package pkprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/insert5")
public class insertServlet5 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String age = req.getParameter("age");

	HttpSession session = req.getSession();
	
	String id = (String)session.getAttribute("id");
	String name = (String)session.getAttribute("name");
	String tel = (String)session.getAttribute("tel");
	
	req.setAttribute("id", id);
	req.setAttribute("name", name);
	req.setAttribute("tel", tel);
	req.setAttribute("age", age);
	
	req.getRequestDispatcher("WEB-INF/views/insert5.jsp").forward(req, resp);
}
}
