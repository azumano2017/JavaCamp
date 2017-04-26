package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ReturnCansel")
public class ReturnCansel extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//貸し出し処理を途中でキャンセルする場合、セッションスコープを削除、最初のページに戻る

		System.out.println("Canselに来てる");
		HttpSession session = request.getSession();
		session.removeAttribute("図書1");
		session.removeAttribute("図書2");
		session.removeAttribute("図書3");
		session.removeAttribute("図書4");
		session.removeAttribute("図書5");
		session.removeAttribute("図書6");
		session.removeAttribute("図書7");
		session.removeAttribute("図書8");
		session.removeAttribute("図書9");
		session.removeAttribute("図書10");

		RequestDispatcher dispatcher = request.getRequestDispatcher("/returnCommand/return1.jsp");
		dispatcher.forward(request, response);

	}

}
