package ct_0907.acorn2;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/all2")
public class a extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
a_s s= new a_s();
ArrayList<a_c> list = s.selectAll();

req.setAttribute("list", list);
req.getRequestDispatcher("WEB-INF/views/a_v.jsp").forward(req, resp);
}
}