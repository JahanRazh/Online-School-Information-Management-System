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
 * Servlet implementation class NoticeUpdateServlet
 */
@WebServlet("/NoticeUpdateServlet")
public class NoticeUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String desc = request.getParameter("desc");
		
		boolean isTrue = schoolDBUtil.updateNotice(id, title, desc);
		
		if(isTrue == true) {
			List<Notice> noticeDetails = schoolDBUtil.viewNotices();
			request.setAttribute("noticeDetails", noticeDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("NoticesUI.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Incorrect Details');");
			out.println("location = 'updateNoticeUI.jsp'");
			out.println("</script>");
		}
	}

}
