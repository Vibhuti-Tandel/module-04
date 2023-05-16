package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class P3Controller
 */
@WebServlet("/P3Controller")
public class P3Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public P3Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");
		System.out.println(action);
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		long mobile = Long.parseLong(request.getParameter("mobile"));
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");
		
		System.out.println("Name: "+fname+" "+lname);
		System.out.println("Email: "+email);
		System.out.println("Mobile No: "+mobile);
		System.out.println("Gender: "+gender);
		System.out.println("Password: "+password);
		response.sendRedirect("M04_P4_display.jsp?fname="+fname+"&lname="+lname+"&email="+email+"&mobile="+mobile+"&gender="+gender+"&password="+password);
		
	}

}
