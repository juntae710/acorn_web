package prj0831;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mv")
public class MV_MVC extends HttpServlet{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	MV_S mv_ = new MV_S();
	ArrayList<MV> mv = mv_.getList();
	
	request.setAttribute("mv", mv);
	request.getRequestDispatcher("WEB-INF/views/MV.jsp").forward(request, response);
}
}
