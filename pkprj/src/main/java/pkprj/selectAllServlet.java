package pkprj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/selectAll")
public class selectAllServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Pk_Service s = new Pk_Service();
	ArrayList<String> list =s.selectAll();
	
	req.setAttribute("list", list);
	req.getRequestDispatcher("WEB-INF/views/selectAll.jsp").forward(req, resp);
}
}
