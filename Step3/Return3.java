package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import library4.DatabaseBookRental;
import model.Rental;
import model.User;


@WebServlet("/Return3")
public class Return3 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		DatabaseBookRental databaseRental = new DatabaseBookRental();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("返却する会員");


		Rental return1 = (Rental) session.getAttribute("図書1");
		Rental return2 = (Rental) session.getAttribute("図書2");
		Rental return3 = (Rental) session.getAttribute("図書3");
		Rental return4 = (Rental) session.getAttribute("図書4");
		Rental return5 = (Rental) session.getAttribute("図書5");
		Rental return6 = (Rental) session.getAttribute("図書6");
		Rental return7 = (Rental) session.getAttribute("図書7");
		Rental return8 = (Rental) session.getAttribute("図書8");
		Rental return9 = (Rental) session.getAttribute("図書9");
		Rental return10 = (Rental) session.getAttribute("図書10");

		String bookId1 = return1.getBookId();
		String bookId2 = return2.getBookId();
		String bookId3 = return3.getBookId();
		String bookId4 = return4.getBookId();
		String bookId5 = return5.getBookId();
		String bookId6 = return6.getBookId();
		String bookId7 = return7.getBookId();
		String bookId8 = return8.getBookId();
		String bookId9 = return9.getBookId();
		String bookId10 = return10.getBookId();

		String msg = null;
		// カレンダークラスのインスタンスを取得
		Calendar cal = Calendar.getInstance();

		//bookidが入力されていたら、すでに登録されている貸し出しデータにsituarionを返却済みに書き換える
		//situationに "2" をset
		//returnDateに本日の日付をset
		if (bookId1 != null && bookId1.length() != 0){
			//各フィールドにset
			return1.setSituation("2");
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			return1.setReturnDate(now);

			//DatabaseBookRental.rentalProcessingでUpdate
			Rental check1 = databaseRental.returnProcessing(return1);
			//ちゃんとinsertされていなかったら(null)エラー文を表示
			if (check1 == null){
				msg += "①update出来ませんでした。";
			}
		}

		if (bookId2 != null && bookId2.length() != 0){

			return2.setSituation("2");
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			return2.setReturnDate(now);

			Rental check2 = databaseRental.returnProcessing(return2);
			if (check2 == null){
				msg += "②update出来ませんでした。";
			}
		}

		if (bookId3 != null && bookId3.length() != 0){

			return3.setSituation("2");
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			return3.setReturnDate(now);

			Rental check3 = databaseRental.returnProcessing(return3);
			if (check3 == null){
				msg += "③update出来ませんでした。";
			}
		}

		if (bookId4 != null && bookId4.length() != 0){

			return4.setSituation("2");
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			return4.setReturnDate(now);

			Rental check4 = databaseRental.returnProcessing(return4);
			if (check4 == null){
				msg += "④update出来ませんでした。";
			}
		}

		if (bookId5 != null && bookId5.length() != 0){

			return5.setSituation("2");
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			return5.setReturnDate(now);

			Rental check5 = databaseRental.returnProcessing(return5);
			if (check5 == null){
				msg += "⑤update出来ませんでした。";
			}
		}

		if (bookId6 != null && bookId6.length() != 0){

			return6.setSituation("2");
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			return6.setReturnDate(now);

			Rental check6 = databaseRental.returnProcessing(return6);
			if (check6 == null){
				msg += "⑥update出来ませんでした。";
			}
		}

		if (bookId7 != null && bookId7.length() != 0){

			return7.setSituation("2");
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			return7.setReturnDate(now);

			Rental check7 = databaseRental.returnProcessing(return7);
			if (check7 == null){
				msg += "⑦update出来ませんでした。";
			}
		}

		if (bookId8 != null && bookId8.length() != 0){

			return8.setSituation("2");
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			return8.setReturnDate(now);

			Rental check8 = databaseRental.returnProcessing(return8);
			if (check8 == null){
				msg += "⑧update出来ませんでした。";
			}
		}

		if (bookId9 != null && bookId9.length() != 0){

			return9.setSituation("2");
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			return9.setReturnDate(now);

			Rental check9 = databaseRental.returnProcessing(return9);
			if (check9 == null){
				msg += "⑨update出来ませんでした。";
			}
		}

		if (bookId10 != null && bookId10.length() != 0){

			return10.setSituation("2");
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			return10.setReturnDate(now);

			Rental check10 = databaseRental.returnProcessing(return10);
			if (check10 == null){
				msg += "⑩update出来ませんでした。";
			}

		}

		if (msg == null){

			//貸し出し処理完了
			RequestDispatcher dispatcher = request.getRequestDispatcher("/returnCommand/return4.jsp");
			dispatcher.forward(request, response);

		}else{

			//処理失敗
			session.setAttribute("処理失敗", "貸し出し処理に失敗しました。入力し直してください。");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/ReturnCansel");
			dispatcher.forward(request, response);

		}
	}

}
