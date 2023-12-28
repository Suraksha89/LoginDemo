package LoginDemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/loginForm")
public class LoginForm extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("email");
		String password = request.getParameter("pswd");
		
		if(username.equals("suraksha@email.com")&& password.equals("test")) {
			request.getRequestDispatcher("Success.html").forward(request, response);
			
		}
		else
		{
			request.setAttribute("msg", "Wrong info entered");
			request.getRequestDispatcher("Login.html").forward(request, response);
		}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}
