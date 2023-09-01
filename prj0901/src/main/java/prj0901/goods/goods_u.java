package prj0901.goods;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prj0901.helloSevlet;
@WebServlet("/goods_up")
public class goods_u extends helloSevlet{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
goods_Service s = new goods_Service();
 String id= request.getParameter("id");
 String price =request.getParameter("price");
 	s.updategoods(new goods(id, price));
 	
 	request.getRequestDispatcher("WEB-INF/views/goods_u.jsp").forward(request, response);
 
}
}
