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
import model.Rental;


@WebServlet("/Return2")
public class Return2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Return2にきてる");
		//リクエストパラメータを取得
		request.setCharacterEncoding("UTF-8");
		DatabaseBookRental databaseBookRental = new DatabaseBookRental();
		HttpSession session = request.getSession();


		String bookId1 = request.getParameter("bookId1");
		String bookId2 = request.getParameter("bookId2");
		String bookId3 = request.getParameter("bookId3");
		String bookId4 = request.getParameter("bookId4");
		String bookId5 = request.getParameter("bookId5");
		String bookId6 = request.getParameter("bookId6");
		String bookId7 = request.getParameter("bookId7");
		String bookId8 = request.getParameter("bookId8");
		String bookId9 = request.getParameter("bookId9");
		String bookId10 = request.getParameter("bookId10");



		//rentalの情報をsetして、rental1.jspのフォームに表示できるようにセッションスコープに保存
		Rental return1 = new Rental();
		return1.setBookId(bookId1);
		return1.setSituation("1");
		session.setAttribute("図書1", return1);
		if(bookId1 != null && bookId1.length() != 0){
			//図書IDが入力されていたら、その図書が本当に貸し出し中の図書のIDか判定
			Rental rental1 = databaseBookRental.searchRental(return1);
			//IDが存在しない場合、エラー文を保存
			if (rental1 == null){
				System.out.println("IDなし");
				request.setAttribute("IDなし1", "入力されたIDは存在しません。");

			}else{
				System.out.println("***" + rental1.getBookId());
				//nullでなければ、返却したい図書の図書ID、タイトル、備考が返ってくる
				return1.setTitle(rental1.getTitle());
				return1.setMemo(rental1.getMemo());
			}

		}

		Rental return2 = new Rental();
		return2.setBookId(bookId2);
		return2.setSituation("1");
		session.setAttribute("図書2", return2);
		if(bookId2 != null && bookId2.length() != 0){
			Rental rental2 = databaseBookRental.searchRental(return2);
			if (rental2 == null){
				request.setAttribute("IDなし2", "入力されたIDは存在しません。");

			}else{
				return2.setTitle(rental2.getTitle());
				return2.setMemo(rental2.getMemo());
			}
		}

		Rental return3 = new Rental();
		return3.setBookId(bookId3);
		return3.setSituation("1");
		session.setAttribute("図書3", return3);
		if(bookId3 != null && bookId3.length() != 0){
			Rental rental3 = databaseBookRental.searchRental(return3);
			if (rental3 == null){
				request.setAttribute("IDなし3", "入力されたIDは存在しません。");

			}else{
				return3.setTitle(rental3.getTitle());
				return3.setMemo(rental3.getMemo());
			}
		}

		Rental return4 = new Rental();
		return4.setBookId(bookId4);
		return4.setSituation("1");
		session.setAttribute("図書4", return4);
		if(bookId4 != null && bookId4.length() != 0){
			Rental rental4 = databaseBookRental.searchRental(return4);
			if (rental4 == null){
				request.setAttribute("IDなし4", "入力されたIDは存在しません。");

			}else{
				return4.setTitle(rental4.getTitle());
				return4.setMemo(rental4.getMemo());
			}
		}

		Rental return5 = new Rental();
		return5.setBookId(bookId5);
		return5.setSituation("1");
		session.setAttribute("図書5", return5);
		if(bookId5 != null && bookId5.length() != 0){
			Rental rental5 = databaseBookRental.searchRental(return5);
			if (rental5 == null){
				request.setAttribute("IDなし5", "入力されたIDは存在しません。");

			}else{
				return5.setTitle(rental5.getTitle());
				return5.setMemo(rental5.getMemo());
			}
		}

		Rental return6 = new Rental();
		return6.setBookId(bookId6);
		return6.setSituation("1");
		session.setAttribute("図書6", return6);
		if(bookId6 != null && bookId6.length() != 0){
			Rental rental6 = databaseBookRental.searchRental(return6);
			if (rental6 == null){
				request.setAttribute("IDなし6", "入力されたIDは存在しません。");

			}else{
				return6.setTitle(rental6.getTitle());
				return6.setMemo(rental6.getMemo());
			}
		}

		Rental return7 = new Rental();
		return7.setBookId(bookId7);
		return7.setSituation("1");
		session.setAttribute("図書7", return7);
		if(bookId7 != null && bookId7.length() != 0){
			Rental rental7 = databaseBookRental.searchRental(return7);
			if (rental7 == null){
				request.setAttribute("IDなし7", "入力されたIDは存在しません。");

			}else{
				return7.setTitle(rental7.getTitle());
				return7.setMemo(rental7.getMemo());
			}
		}

		Rental return8 = new Rental();
		return8.setBookId(bookId8);
		return8.setSituation("1");
		session.setAttribute("図書8", return8);
		if(bookId8 != null && bookId8.length() != 0){
			Rental rental8 = databaseBookRental.searchRental(return8);
			if (rental8 == null){
				request.setAttribute("IDなし8", "入力されたIDは存在しません。");

			}else{
				return8.setTitle(rental8.getTitle());
				return8.setMemo(rental8.getMemo());
			}
		}

		Rental return9 = new Rental();
		return9.setBookId(bookId9);
		return9.setSituation("1");
		session.setAttribute("図書9", return9);
		if(bookId9 != null && bookId9.length() != 0){
			Rental rental9 = databaseBookRental.searchRental(return9);
			if (rental9 == null){
				request.setAttribute("IDなし9", "入力されたIDは存在しません。");

			}else{
				return9.setTitle(rental9.getTitle());
				return9.setMemo(rental9.getMemo());
			}
		}

		Rental return10 = new Rental();
		return10.setBookId(bookId10);
		return1.setSituation("1");
		session.setAttribute("図書10", return10);
		if(bookId10 != null && bookId10.length() != 0){
			Rental rental10 = databaseBookRental.searchRental(return10);
			if (rental10 == null){
				request.setAttribute("IDなし10", "入力されたIDは存在しません。");

			}else{
				return10.setTitle(rental10.getTitle());
				return10.setMemo(rental10.getMemo());
			}
		}

		String msg1 = (String) request.getAttribute("IDなし1");
		String msg2 = (String) request.getAttribute("IDなし2");
		String msg3 = (String) request.getAttribute("IDなし3");
		String msg4 = (String) request.getAttribute("IDなし4");
		String msg5 = (String) request.getAttribute("IDなし5");
		String msg6 = (String) request.getAttribute("IDなし6");
		String msg7 = (String) request.getAttribute("IDなし7");
		String msg8 = (String) request.getAttribute("IDなし8");
		String msg9 = (String) request.getAttribute("IDなし9");
		String msg10 = (String) request.getAttribute("IDなし10");

		if( msg1 == null && msg2 == null && msg3 == null && msg4 == null && msg5 == null && msg6 == null
				&& msg7 == null && msg8 == null && msg9 == null && msg10 == null){

			RequestDispatcher dispatcher = request.getRequestDispatcher("/returnCommand/return3.jsp");
			dispatcher.forward(request, response);

		}else{

			System.out.println("入力IDエラーがあります。：rental2.jspに戻る");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/returnCommand/return2.jsp");
			dispatcher.forward(request, response);
		}

	}

}
