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

import com.school.Subject;
import com.school.Teacher;
import com.school.schoolDBUtil;

/**
 * Servlet implementation class TeacherLoginServlet
 */
@WebServlet("/TeacherLoginServlet")
public class TeacherLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		
		boolean isTrue = schoolDBUtil.validateTeacher(uname, pass);
		
		if(isTrue == true) {
			List<Teacher> teacherDetails = schoolDBUtil.getTeacherDetails(uname);
			request.setAttribute("teacherDetails", teacherDetails);
			
			List<Subject> subjectDetails = schoolDBUtil.showSubject(uname);
			request.setAttribute("subjectDetails", subjectDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("TeacherUI.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect!')");
			out.println("location='teacherLoginUI.jsp'");
			out.println("</script>");
		}
	}

}
