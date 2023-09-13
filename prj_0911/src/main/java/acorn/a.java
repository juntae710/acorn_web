package acorn;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/a")
public class a  extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	as s= new as();
	String p = req.getParameter("p");
	int currentPage=1;
	if(p!= null) {
		currentPage=Integer.parseInt(p);
	}
	
	int grpSize=2;
	int pageSize=5;
	int totRecords=s.getTotalCnt();
	ArrayList<ac> list = s.getListPage(grpSize, pageSize);
	ah h = new ah(currentPage,  totRecords,  pageSize,  grpSize);
	req.setAttribute("list", list);
	req.setAttribute("h", h);
	req.getRequestDispatcher("WEB-INF/views/av.jsp").forward(req, resp);
}
	

}
