package prj0901.goods;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prj0901.helloSevlet;

@WebServlet("/goodsreg")
public class goods_r extends helloSevlet{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	String id =request.getParameter("id");
	String name =request.getParameter("name");
	String price =request.getParameter("price");
	
	goods_Service s = new goods_Service();
	s.insertgoods(new goods(id,name,price));
	
	request.getRequestDispatcher("WEB-INF/views/goods_r.jsp").forward(request, response);
}
}
