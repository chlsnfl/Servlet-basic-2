

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.musecom.web05.JsonWriteEx;

public class Myajax extends HttpServlet {
		
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		JsonWriteEx wr = new JsonWriteEx();
		String uname = req.getParameter("uname");
		String age = req.getParameter("age");
		String chari = req.getParameter("chari");
		wr.jsonIn(uname, age, chari);
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		res.setCharacterEncoding("utf-8");
		
		out.println(1);
	}

}
