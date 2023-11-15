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

@WebServlet("/updateStudentAccountServlet")
public class updateStudentAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String adminUname = request.getParameter("adminUname");
		int sid =Integer.parseInt(request.getParameter("sid"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		int phone = Integer.parseInt(request.getParameter("phone"));
		int grade = Integer.parseInt(request.getParameter("grade"));
		String username = request.getParameter("username");
		String password  = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = schoolDBUtil.updatestudentaccount(sid, name, age, address, phone, grade, username, password);
		
		if(isTrue == true) {
			List<Admin> adminDetails = schoolDBUtil.getAdminDetails(adminUname);
			request.setAttribute("adminDetails", adminDetails);
			RequestDispatcher dis = request.getRequestDispatcher("AdminUI.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Incorrect Details');");
			out.println("location = 'updateStudentAccount.jsp'");
			out.println("</script>");
		}
	}

}
