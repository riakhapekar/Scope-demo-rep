package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String name=request.getAttribute("userName").toString();
		
		
//		HttpSession session=request.getSession();
//		String name=session.getAttribute("userName").toString();
		
		String name=request.getServletContext().getAttribute("userName").toString();
		
		System.out.println("User Name: "+name);
		System.out.println("Redirecting to Servlet3....");
		
		//request.getRequestDispatcher("Servlet3").forward(request, response);
		//response.sendRedirect("Servlet3");
		PrintWriter out=response.getWriter();
		out.println("<a href='Servlet3'>Servlet3</a>");
		out.println("<p>"+name+"</p>");
	}

}
