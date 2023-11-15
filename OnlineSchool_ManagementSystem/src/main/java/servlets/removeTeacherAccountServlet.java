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
import com.school.Principle;
import com.school.schoolDBUtil;

@WebServlet("/removeTeacherAccountServlet")
public class removeTeacherAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String principleUname = request.getParameter("principleUname");
		boolean isTrue;
		int teacherID =Integer.parseInt(request.getParameter("teacherID"));
		
		
		isTrue = schoolDBUtil.removeTeacher(teacherID);
		
		if(isTrue == true) {
			List<Principle> principleDetails = schoolDBUtil.getPrincipleDetails(principleUname);
			request.setAttribute("principleDetails", principleDetails);
			RequestDispatcher dis = request.getRequestDispatcher("PrincipleUI.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Incorrect Teacher ID');");
			out.println("location = 'removeTeacherAccount.jsp'");
			out.println("</script>");
			
		}
	}

}
