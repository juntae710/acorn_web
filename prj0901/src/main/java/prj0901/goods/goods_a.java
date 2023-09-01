package prj0901.goods;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prj0901.helloSevlet;
@WebServlet("/selectall")
public class goods_a extends helloSevlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	goods_Service s = new goods_Service();
	ArrayList<String> all =s.selectAll();
	
	request.setAttribute("all", all);
	request.getRequestDispatcher("WEB-INF/views/goods_a.jsp").forward(request, response);
}
}
