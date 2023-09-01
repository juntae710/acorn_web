package prj0901.goods;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prj0901.helloSevlet;
@WebServlet("/G_delete")
public class goods_d extends helloSevlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	
	
	goods_Service s = new goods_Service();
	String id =request.getParameter("id");
	s.deleteOne(id);
	
	request.getRequestDispatcher("WEB-INF/views/goods_d.jsp").forward(request, response);
}
}
