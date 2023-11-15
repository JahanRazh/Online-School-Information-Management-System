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

import com.school.Admin;
import com.school.schoolDBUtil;

@WebServlet("/removeStudentAccountServlet")
public class removeStudentAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String adminUname = request.getParameter("adminUname");
		boolean isTrue;
		int sid =Integer.parseInt(request.getParameter("sid"));
		
		isTrue = schoolDBUtil.removeStudent(sid);
		
		if(isTrue == true) {
			List<Admin> adminDetails = schoolDBUtil.getAdminDetails(adminUname);
			request.setAttribute("adminDetails", adminDetails);
			RequestDispatcher dis = request.getRequestDispatcher("AdminUI.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Incorrect Student ID');");
			out.println("location = 'removeStudentAccount.jsp'");
			out.println("</script>");
		}
	}

}
