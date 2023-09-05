package pkprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet ("/selectOne1")
public class selectOneServlet1 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String id_ = req.getParameter("id");
	Pk_Service s = new Pk_Service();
	Pk id =s.selectOne(id_);
	
	req.setAttribute("id", id);
	req.getRequestDispatcher("WEB-INF/views/selectOne1.jsp").forward(req, resp);
}

}
