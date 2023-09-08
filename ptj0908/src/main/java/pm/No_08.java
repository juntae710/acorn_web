package pm;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/no8")
public class No_08 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<No_08_Coffee> coffee= new ArrayList<>();
		coffee.add(new No_08_Coffee("c001","아메리카노",2000));
		coffee.add(new No_08_Coffee("c002","카라멜마끼아또",3000));
		coffee.add(new No_08_Coffee("c003","고구마라때",2000));
		coffee.add(new No_08_Coffee("c004","자바칩크라프치노",3000));
		
		req.setAttribute("coffee", coffee);
		req.getRequestDispatcher("WEB-INF/views/pm/no_08.jsp").forward(req, resp);
	}
}
