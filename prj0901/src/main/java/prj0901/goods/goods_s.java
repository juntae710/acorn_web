package prj0901.goods;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prj0901.helloSevlet;

@WebServlet("/searach")
public class goods_s extends helloSevlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id=request.getParameter("id");
		goods_Service s = new goods_Service();
		
		goods g = s.selectOne(id);
		
		request.setAttribute("g", g);
		request.getRequestDispatcher("WEB-INF/views/goods_s.jsp").forward(request, response);
		
		
		
	}
}
