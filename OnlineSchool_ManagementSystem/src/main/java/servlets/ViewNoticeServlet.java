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
import com.school.schoolDBUtil;

/**
 * Servlet implementation class NoticeServlet
 */
@WebServlet("/ViewNoticeServlet")
public class ViewNoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Notice> noticeDetails = schoolDBUtil.viewNotices();
			request.setAttribute("noticeDetails", noticeDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("NoticesUI.jsp");
		dis.forward(request, response);
	}

}
