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

@WebServlet("/createTeacherAccount")
public class createTeacherAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String adminUname = request.getParameter("adminUname");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String nic = request.getParameter("nic");
		String address = request.getParameter("address");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String email = request.getParameter("email");
		float salary =Integer.parseInt(request.getParameter("salary"));
		String username = request.getParameter("username");
		String password  = request.getParameter("password");
		
		String principleUname = request.getParameter("principleUname");
		boolean isTrue;
		
		isTrue = schoolDBUtil.createteacheraccount(name,  age,  nic,  address,  phone,  email,  salary,  username,  password);
		
		if(isTrue == true) {
			List<Principle> principleDetails = schoolDBUtil.getPrincipleDetails(principleUname);
			request.setAttribute("principleDetails", principleDetails);
			RequestDispatcher dis = request.getRequestDispatcher("PrincipleUI.jsp");
			dis.forward(request, response);
		} else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Incorrect Details');");
			out.println("location = 'createTeacherAccount.jsp'");
			out.println("</script>");
		}
	}

}
