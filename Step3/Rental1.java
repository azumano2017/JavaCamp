package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import library4.DatabaseBookRental;
import model.User;

@WebServlet("/Rental")
public class Rental extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//パラメータで受け取ったIDが存在するか判定する
		DatabaseBookRental rental = new DatabaseBookRental();
		request.setCharacterEncoding("UTF-8");

		String userId = request.getParameter("userId");
		//int userId = Integer.parseInt(userIdString);

		//未入力だったら、リクエストスコープにエラーメッセージを保存して、フォーム画面に戻る
		if(userId.length() == 0){
			request.setAttribute("IDなし", "IDを入力してください。");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/rentalCommand/rental1.jsp");
			dispatcher.forward(request, response);

		}else{
			User user = rental.searchUser(userId);

			if(user != null){
				//セッションスコープに会員の情報を保存
				HttpSession session = request.getSession();
				session.setAttribute("貸し出しする会員", user);

				//セッションスコープに会員が借りている図書の情報を保存
				model.Rental[] rentalbooks = rental.searchUserRental(userId);
				System.out.println("借りてる本：" + rentalbooks.length + "冊");
				session.setAttribute("会員の既に借りている図書", rentalbooks);

				RequestDispatcher dispatcher = request.getRequestDispatcher("/rentalCommand/rental2.jsp");
				dispatcher.forward(request, response);

			}else{
				request.setAttribute("IDなし", "検索されたIDは存在しません。");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/rentalCommand/rental1.jsp");
				dispatcher.forward(request, response);
			}
		}

	}

}
