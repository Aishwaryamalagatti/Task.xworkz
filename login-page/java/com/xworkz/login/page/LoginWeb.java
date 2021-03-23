package com.xworkz.login.page;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginWeb extends HttpServlet{
	
	public LoginWeb() {
		System.out.println("created "+this.getClass().getName());	
	}
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created doPost ");
		String name=req.getParameter("username");
		String pswd=req.getParameter("password");
		
		System.out.println(name);
		System.out.println(pswd);
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("This is my first writer from resp");
		writer.println("</h1>");
		writer.println("</br>");
		writer.println("<b>");
		writer.println("Login successful");
		writer.println("</b>");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();

	}

}
