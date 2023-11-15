package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.school.Grades;
import com.school.schoolDBUtil;

/**
 * Servlet implementation class ShowGrdDetails
 */
@WebServlet("/ShowGrdDetails")
public class ShowGrdDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Grades> grdDetails = schoolDBUtil.viewGradeDetails();
			request.setAttribute("grdDetails", grdDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("SemesterReg.jsp");
		dis.forward(request, response);
	}

}
