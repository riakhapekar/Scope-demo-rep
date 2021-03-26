package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String name=request.getAttribute("userName").toString();
		HttpSession session=request.getSession();
		String name=session.getAttribute("userName").toString();
		PrintWriter out=response.getWriter();
		out.println("User Name: "+name); 
	}

}
