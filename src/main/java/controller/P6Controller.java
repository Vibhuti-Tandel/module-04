package controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class P6Controller
 */
@WebServlet("/P6Controller")
public class P6Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public P6Controller() {
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
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String mobile = request.getParameter("mobile");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			String alphabate = "^[a-zA-Z]*$";
			
			String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			
			boolean validPassword = isValidPassword(password);
			
			if(fname.isEmpty() || lname.isEmpty() || mobile.isEmpty() || email.isEmpty() || password.isEmpty())
			{
				request.setAttribute("msg", "Please fill all details !!");
				request.getRequestDispatcher("M04_P6_form.jsp").forward(request, response);
			}
			else if(!fname.matches(alphabate))
			{
				request.setAttribute("msg1", "Please enter only alphabets in first name !!");
				request.getRequestDispatcher("M04_P6_form.jsp").forward(request, response);
			}
			else if(!lname.matches(alphabate))
			{
				request.setAttribute("msg2", "Please enter only alphabets in last name !!");
				request.getRequestDispatcher("M04_P6_form.jsp").forward(request, response);
			}
			else if(mobile.length()!=10)
			{
				request.setAttribute("msg3", "Please enter 10 digit mobile number !!");
				request.getRequestDispatcher("M04_P6_form.jsp").forward(request, response);
			}
			else if(matcher.matches() == false)
			{
				request.setAttribute("msg4", "Please enter valid email !!");
				request.getRequestDispatcher("M04_P6_form.jsp").forward(request, response);
			}
			else if(validPassword == false)
			{
				request.setAttribute("msg5", "Please enter valid password which has atleast one upper,one lower and one numeric character and special characters like @,#,$,%,_,& !!");
				request.getRequestDispatcher("M04_P6_form.jsp").forward(request, response);
			}
			else
			{
				String fn = request.getParameter("fname");
				String ln = request.getParameter("lname");
				long mob = Long.parseLong(request.getParameter("mobile"));
				String em = request.getParameter("email");
				String pass = request.getParameter("password");
				response.sendRedirect("M04_P6_register.jsp?fname="+fn+"&lname="+ln+"&mobile="+mob+"&email="+em+"&password="+pass);
				
			}
			
			
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
