

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ClientTull extends HttpServlet {
	
	int count = 0;
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;set=UTF-8");
		PrintWriter out = response.getWriter();
		response.setHeader("Refresh","3");
		out.println("<html><head><title>Clinet pull</title></head></html>");
		out.println("<body><h2 style = \"text-align:center\">Client Pull 테스트</h2>");
		out.println(++count);
		out.println("</ol></body></html>");
	}


}
