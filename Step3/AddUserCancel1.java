package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AddUserCancel1")
public class AddUserCancel1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//登録を途中でキャンセルした場合、セッションスコープを削除して最初のページに戻る

		HttpSession session = request.getSession();
		session.removeAttribute("addUser");

		RequestDispatcher dispatcher = request.getRequestDispatcher("/addUserCommand/addUser.jsp");
		dispatcher.forward(request, response);
	}

}
