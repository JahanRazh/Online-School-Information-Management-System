package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.school.Notice;
import com.school.Subject;
import com.school.schoolDBUtil;

/**
 * Servlet implementation class ViewSubjectServlet
 */
@WebServlet("/ViewSubjectServlet")
public class ViewSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object SubjectDetails;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Subject> subjectDetails = schoolDBUtil.viewsubject();
			request.setAttribute("subjectDetails", subjectDetails);
			System.out.println("Subject SUC");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("SubjectUI.jsp");
		dis.forward(request, response);
	}

}

