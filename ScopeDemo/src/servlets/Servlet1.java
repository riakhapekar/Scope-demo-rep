package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("uname");
		
		//request scope
		//request.setAttribute("userName", userName);
		
		//session scope
		HttpSession session=request.getSession();
		session.setAttribute("userName", userName);
		
		//application scope(context scope)
//		ServletContext context=request.getServletContext();
//		context.setAttribute("userName", userName);
		
		//there is only one ServletContext object per web application
		request.getServletContext().setAttribute("userName", userName);
		
		System.out.println("Redirecting from Servlet1 to Servlet2");
		
		//request.getRequestDispatcher("Servlet2").forward(request, response);
		//response.sendRedirect("Servlet2");
		PrintWriter out=response.getWriter();
		out.println("<a href='Servlet2'>Servlet2</a>");
		
		
	}

}
