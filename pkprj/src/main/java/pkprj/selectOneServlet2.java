package pkprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet ("/selectOne2")
public class selectOneServlet2 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String search = req.getParameter("search");
	Pk_Service s = new Pk_Service();
	Pk id =s.selectOne(search);
	
	req.setAttribute("id", id);
	req.getRequestDispatcher("WEB-INF/views/selectOne2.jsp").forward(req, resp);
}

}
