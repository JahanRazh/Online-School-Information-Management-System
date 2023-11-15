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

import com.school.Payment;
import com.school.Student;
import com.school.schoolDBUtil;

@WebServlet("/SemRegServlet")
public class SemRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int sid = Integer.parseInt(request.getParameter("id"));
		String cardNo = request.getParameter("cardNo");
		String expDate = request.getParameter("expDate");
		int cvv = Integer.parseInt(request.getParameter("cvv"));
		boolean isTrue = false;
		
		isTrue = schoolDBUtil.validatePayment(sid, cardNo, expDate, cvv);
		
		if(isTrue == true) {
			List<Payment> payDetails = schoolDBUtil.getPaymentDetails(cardNo);
			request.setAttribute("payDetails", payDetails);
			System.out.println("Pay details set attribute");
				
			List<Student> stdDetails = schoolDBUtil.getStudentDetails(sid);
			request.setAttribute("stdDetails", stdDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("StudentUI.jsp");
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
