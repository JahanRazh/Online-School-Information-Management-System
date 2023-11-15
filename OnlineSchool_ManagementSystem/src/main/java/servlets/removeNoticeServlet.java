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

import com.school.Notice;
import com.school.schoolDBUtil;

/**
 * Servlet implementation class removeNoticeServlet
 */
@WebServlet("/removeNoticeServlet")
public class removeNoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean isTrue;
		int id = Integer.parseInt(request.getParameter("id"));
		
		isTrue = schoolDBUtil.removeNotice(id);
		
		if(isTrue == true) {
			List<Notice> noticeDetails = schoolDBUtil.viewNotices();
			request.setAttribute("noticeDetails", noticeDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("NoticesUI.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Incorrect Notice ID');");
			out.println("location = 'RemoveNoticeUI.jsp'");
			out.println("</script>");
		}
	}

}
