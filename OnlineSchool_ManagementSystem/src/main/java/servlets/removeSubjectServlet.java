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
 * Servlet implementation class removeSubjectServlet
 */
@WebServlet("/removeSubjectServlet")
public class removeSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String teacherUname = request.getParameter("teacherUname");
		boolean isTrue;
		String id = request.getParameter("id");
		
		isTrue = schoolDBUtil.removeSubject(id);
		
		if(isTrue == true) {
			List<Teacher> teacherDetails = schoolDBUtil.getTeacherDetails(teacherUname);
			request.setAttribute("teacherDetails", teacherDetails);
			List<Subject> subjectDetails = schoolDBUtil.showSubject(teacherUname);
			request.setAttribute("subjectDetails", subjectDetails);
			RequestDispatcher dis = request.getRequestDispatcher("TeacherUI.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Incorrect Subject ID');");
			out.println("location = 'RemoveSubjectUI.jsp'");
			out.println("</script>");
		}
	}

}
