package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.school.Student;
import com.school.schoolDBUtil;

/**
 * Servlet implementation class StdLoginServlet
 */
@WebServlet("/StdLoginServlet")
public class StdLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		boolean isTrue = schoolDBUtil.validateStudent(uname, pass);
		
		if(isTrue == true) {
			List<Student> stdDetails = schoolDBUtil.getStudentDetails(uname);
			request.setAttribute("stdDetails", stdDetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("StudentUI.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect!')");
			out.println("location='stdLoginUI.jsp'");
			out.println("</script>");
		}

	}

}
