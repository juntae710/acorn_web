package prj0831;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServley extends HttpServlet {

@Override
	protected void doGet(HttpServletRequest reqeust, HttpServletResponse response) throws ServletException, IOException {
		//로그인 화면 응답
	RequestDispatcher r= reqeust.getRequestDispatcher("WEB-INF/views/login.jsp");
	r.forward(reqeust, response);
	};
@Override
	protected void doPost(HttpServletRequest reqeust, HttpServletResponse response) throws ServletException, IOException {
	
	String method = reqeust.getMethod();
	System.out.println(method);
	System.out.println("post");
	
	String userid = reqeust.getParameter("userid");
	String userpw = reqeust.getParameter("userpw");
	
	System.out.println(userid);
	System.out.println(userpw);
	
	//로그인 비번을 가지고 데이터베이스 정보를 확인한후 정상로그인후 메인페이지,
	//아이디 비번 문제있을 경우 다시 로그인화면으로 응답할수 있다.
	
	boolean result = true;
	if (result) {
		//정상이라면 main페이지가 응답하도록
		reqeust.getRequestDispatcher("WEB-INF/views/main.jsp").forward(reqeust, response);
	}else {
		//비정싱적인 경우 로그인 페이지가 응답하도록
		reqeust.getRequestDispatcher("WEB-INF/views/login.jsp").forward(reqeust, response);
	}
	}
}
