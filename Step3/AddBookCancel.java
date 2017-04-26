package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AddBookCancel")
public class AddBookCancel extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//図書登録を途中でキャンセルする場合、セッションスコープを削除して、最初のページに戻る

		HttpSession session = request.getSession();
		session.removeAttribute("addBook");

		RequestDispatcher dispatcher = request.getRequestDispatcher("/addBookCommand/addBook1.jsp");
		dispatcher.forward(request, response);

	}

}
