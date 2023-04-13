package net.musecom.web05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Hello extends HttpServlet {

	public void init() throws ServletException {
		//thread 시작되면 한 번 실행
		System.out.println("init");
	}
	
	@Override
	public void destroy() {
		//끝날 때 한 번
		System.out.println("destroy");
	}



	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String mytext = req.getParameter("mytext");
		String[] hobby = req.getParameterValues("hobby");
		String major = req.getParameter("major");
		String protocal = req.getParameter("protocal");
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		req.setCharacterEncoding("utf-8");
		
		out.println("<html>");
		out.println("<head><title>문서</title></head>");
		out.println("<body>");
		out.println("<h1 style = 'text-align:center;'>Hello Java</h1>");
		out.println("<ul>");
		
//		out.println("<li><label>하실말씀 : </label>"+mytext+"</li>");
//		out.println("<li><label>취미 : </label>"+Arrays.toString(hobby)+"</li>");
//		out.println("<li><label>좋아하는 과목 : </label>"+major+"</li>");
//		out.println("<li><label>전송 프로토콜 : </label>"+protocal+"</li>");
		
		Enumeration en = req.getParameterNames();
		while(en.hasMoreElements()) {
			String name = (String)en.nextElement();
			String values[] = req.getParameterValues(name);
			if(values != null) {
				for(int i=0; i<values.length; i++) {
					out.println("<li>"+name+" : "+values[i]+"</li>");
				}
			}
		}
		
		out.println("</ul>");
		out.println("</body></html>");	
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
		doGet(req, res);
		
	}
	@PostConstruct
	private void initPostConstruce() {
		System.out.println("init전 한 번 실행됨.");
	}
	@PreDestroy
	private void destroyPreDestroy() {
		System.out.println("destroy 후 한 번 실행");
	}
}
