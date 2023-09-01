package prj0831;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/bucket")
public class bucketList_MVC extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	bucketList_S b = new bucketList_S();
	ArrayList<bucketList> bb = b.getList();
	
	request.setAttribute("bb", bb);
	request.getRequestDispatcher("WEB-INF/views/B_List.jsp").forward(request, response);
}
}
