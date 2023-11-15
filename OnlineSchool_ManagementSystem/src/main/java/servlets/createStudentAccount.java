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

/**
 * Servlet implementation class createStudentAccount
 */
@WebServlet("/createStudentAccount")
public class createStudentAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String sID = request.getParameter("sid");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String grade = request.getParameter("grade");
		String regStatus = request.getParameter("regStatus");
		String username = request.getParameter("username");
		String password  = request.getParameter("password");
		
		System.out.println(sID);
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(phone);
		System.out.println(grade);
		System.out.println(regStatus);
		System.out.println(username);
		System.out.println(password);
		
		
		boolean isTrue;
		
		isTrue = schoolDBUtil.createstudentaccount(sID, name, age, address, phone, grade, username, password, regStatus);
		
		System.out.println("value :"+isTrue);
		
		if(isTrue == true) {
			//List<Admin> adminDetails = schoolDBUtil.getAdminDetails(adminUname);
			//request.setAttribute("adminDetails", adminDetails);
			RequestDispatcher dis = request.getRequestDispatcher("AdminUI.jsp");
			dis.forward(request, response);
		} else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Incorrect Details');");
			out.println("location = 'createStudentAccount.jsp'");
			out.println("</script>");
		}
	}

}
