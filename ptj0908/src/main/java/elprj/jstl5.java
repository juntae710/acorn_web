package elprj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/jstl5")
public class jstl5 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ArrayList<Book> books = new ArrayList<>();
		
		books.add(new Book("b001", "부의인문학", 23000));
		books.add(new Book("b002", "칼의노래", 23000));
		books.add(new Book("b003", "난쟁이가쏘아올린공", 23000));
		
		req.setAttribute("books", books);
		req.getRequestDispatcher("WEB-INF/views/jstl5.jsp").forward(req, resp);
	}
}
