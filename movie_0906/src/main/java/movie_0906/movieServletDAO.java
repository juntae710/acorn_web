package movie_0906;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
@WebServlet("/movieDAO")
public class movieServletDAO extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	movieService s = new movieService();
	
	resp.setCharacterEncoding("utf-8");
	resp.setContentType("text/html;charset=utf-8");
	
	
	JSONArray arr = s.getMovieRealList();
	
	resp.getWriter().println(arr);
}
}
