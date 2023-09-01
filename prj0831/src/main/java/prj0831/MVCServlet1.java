package prj0831;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//화이팅에 응답하기

//m : model :pojo 자바로 작성 class service,dao(repository)
//v : view  :jsp html,css,js
//c : control :servlet 요청,응답까지의 흐름을 제어
@WebServlet("/mvc1")
public class MVCServlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//Model, 데이터
	String message = "퐈이야아";
	
	//request를 저장소로 사용함 (MVC)
	//request 저장소에 MODEL 심기
	request.setAttribute("msg", message);
	request.getRequestDispatcher("WEB-INF/views/mvc1.jsp").forward(request, response);
	}
}
