package login_09_05_v1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@ WebServlet ("/order")
public class OrderServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	//주문요청시
	//로그인상태 확인 후 주문 정보를 보여주거나 로그인 상태가 아니면 로그인 화면으로 이동
	
	//세션 저장소에서 아이디가 저장이 되었는지 확인
	HttpSession session = req.getSession();
	String id = (String)session.getAttribute("id");
	
	if(id != null) {//로그인 상태이면 주문페이지 응답
		//해닥고객 주문목록 가져오기
		//서비스 ,dao
		req.getRequestDispatcher("WEB-INF/views/order.jsp").forward(req, resp);
	}else {//로그인 상태가 아니면 로그인 페이지로
		resp.sendRedirect("/login_09_05/login");
	}
	
	
	
}
}
