package controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDaoP7;
import model.StudentP7;

/**
 * Servlet implementation class P7Controller
 */
@WebServlet("/P7Controller")
public class P7Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public P7Controller() {
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
		if(action.equalsIgnoreCase("Register"))
		{
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			
			boolean validPassword = isValidPassword(password);
			
			if(matcher.matches() == false)
			{
				request.setAttribute("msg1", "Please enter valid email !!");
				request.getRequestDispatcher("M04_P7_register.jsp").forward(request, response);
			}
			else if(validPassword == false)
			{
				request.setAttribute("msg2", "Please enter valid password which has atleast one upper,one lower and one numeric character and special characters like @,#,$,%,_,& !!");
				request.getRequestDispatcher("M04_P7_register.jsp").forward(request, response);
			}
			else
			{
				StudentP7 s = new StudentP7();
				s.setFname(request.getParameter("fname"));
				s.setLname(request.getParameter("lname"));
				s.setEmail(request.getParameter("email"));
				s.setMobile(Long.parseLong(request.getParameter("mobile")));
				s.setGender(request.getParameter("gender"));
				s.setPassword(request.getParameter("password"));
				StudentDaoP7.insertStudent(s);
				response.sendRedirect("M04_P7_display.jsp");
			}
		}
		else if(action.equalsIgnoreCase("Update"))
		{
			StudentP7 s = new StudentP7();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(Long.parseLong(request.getParameter("mobile")));
			s.setGender(request.getParameter("gender"));
			s.setPassword(request.getParameter("password"));
			StudentDaoP7.updateStudent(s);
			response.sendRedirect("M04_P7_display.jsp");
		}
	}
	
	public boolean isValidPassword(String password)
	{
		boolean isValid = true;
		String upperCaseChars = "(.*[A-Z].*)";
		String lowerCaseChars = "(.*[a-z].*)"; 
		String numbers = "(.*[0-9].*)";
		String specialChars = "(.*[@,#,$,%,_,&].*$)";
		
		if(password.length() > 12 || password.length() < 8)
		{
			isValid = false;
		}
		if(!password.matches(upperCaseChars))
		{
			isValid = false;
		}
		if(!password.matches(lowerCaseChars))
		{
			isValid = false;
		}
		if(!password.matches(numbers))
		{
			isValid = false;
		}
		if(!password.matches(specialChars))
		{
			isValid = false;
		}
		return isValid;
	}


}
