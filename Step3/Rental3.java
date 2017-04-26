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

@WebServlet("/Rental3")
public class Rental3 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		DatabaseBookRental databaseRental = new DatabaseBookRental();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("貸し出しする会員");


		Rental rental1 = (Rental) session.getAttribute("図書1");
		Rental rental2 = (Rental) session.getAttribute("図書2");
		Rental rental3 = (Rental) session.getAttribute("図書3");
		Rental rental4 = (Rental) session.getAttribute("図書4");
		Rental rental5 = (Rental) session.getAttribute("図書5");
		Rental rental6 = (Rental) session.getAttribute("図書6");
		Rental rental7 = (Rental) session.getAttribute("図書7");
		Rental rental8 = (Rental) session.getAttribute("図書8");
		Rental rental9 = (Rental) session.getAttribute("図書9");
		Rental rental10 = (Rental) session.getAttribute("図書10");

		String bookId1 = rental1.getBookId();
		String bookId2 = rental2.getBookId();
		String bookId3 = rental3.getBookId();
		String bookId4 = rental4.getBookId();
		String bookId5 = rental5.getBookId();
		String bookId6 = rental6.getBookId();
		String bookId7 = rental7.getBookId();
		String bookId8 = rental8.getBookId();
		String bookId9 = rental9.getBookId();
		String bookId10 = rental10.getBookId();

		String msg = null;
		// カレンダークラスのインスタンスを取得
		Calendar cal = Calendar.getInstance();

		//bookidが入力されていたら
		if (bookId1 != null && bookId1.length() != 0){
			//各フィールドにset
			rental1.setUserId(user.getUserId());
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			rental1.setRentalDate(now);
			//14日を加算
			cal.add(Calendar.DATE, 14);
			//結果を返却予定日にset
			String returnplan = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
			rental1.setReturnPlan(returnplan);
			System.out.println(returnplan);
			rental1.setSituation("1");

			//DatabaseBookRental.rentalProcessingでinsert
			Rental check1 = databaseRental.rentalProcessing(rental1);
			//ちゃんとinsertされていなかったら(null)エラー文を表示
			if (check1 == null){
				msg += "①insert出来ませんでした。";
			}
		}

		if (bookId2 != null && bookId2.length() != 0){
			//各フィールドにset
			rental2.setUserId(user.getUserId());
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			rental2.setRentalDate(now);
			//14日を加算
			cal.add(Calendar.DATE, 14);
			//結果を返却予定日にset
			String returnplan = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
			rental2.setReturnPlan(returnplan);
			rental2.setSituation("1");

			//DatabaseBookRental.rentalProcessingでinsert
			Rental check2 = databaseRental.rentalProcessing(rental2);
			//ちゃんとinsertされていなかったら(null)エラー文を表示
			if (check2 == null){
				msg += "②insert出来ませんでした。";
			}
		}

		if (bookId3 != null && bookId3.length() != 0){
			//各フィールドにset
			rental3.setUserId(user.getUserId());
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			rental3.setRentalDate(now);
			//14日を加算
			cal.add(Calendar.DATE, 14);
			//結果を返却予定日にset
			String returnplan = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
			rental3.setReturnPlan(returnplan);
			rental3.setSituation("1");

			//DatabaseBookRental.rentalProcessingでinsert
			Rental check3 = databaseRental.rentalProcessing(rental3);
			//ちゃんとinsertされていなかったら(null)エラー文を表示
			if (check3 == null){
				msg += "③insert出来ませんでした。";
			}
		}

		if (bookId4 != null && bookId4.length() != 0){
			//各フィールドにset
			rental4.setUserId(user.getUserId());
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			rental4.setRentalDate(now);
			//14日を加算
			cal.add(Calendar.DATE, 14);
			//結果を返却予定日にset
			String returnplan = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
			rental4.setReturnPlan(returnplan);
			rental4.setSituation("1");

			//DatabaseBookRental.rentalProcessingでinsert
			Rental check4 = databaseRental.rentalProcessing(rental4);
			//ちゃんとinsertされていなかったら(null)エラー文を表示
			if (check4 == null){
				msg += "④insert出来ませんでした。";
			}
		}

		if (bookId5 != null && bookId5.length() != 0){
			//各フィールドにset
			rental5.setUserId(user.getUserId());
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			rental5.setRentalDate(now);
			//14日を加算
			cal.add(Calendar.DATE, 14);
			//結果を返却予定日にset
			String returnplan = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
			rental5.setReturnPlan(returnplan);
			rental5.setSituation("1");

			//DatabaseBookRental.rentalProcessingでinsert
			Rental check5 = databaseRental.rentalProcessing(rental5);
			//ちゃんとinsertされていなかったら(null)エラー文を表示
			if (check5 == null){
				msg += "⑤insert出来ませんでした。";
			}
		}

		if (bookId6 != null && bookId6.length() != 0){
			//各フィールドにset
			rental6.setUserId(user.getUserId());
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			rental6.setRentalDate(now);
			//14日を加算
			cal.add(Calendar.DATE, 14);
			//結果を返却予定日にset
			String returnplan = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
			rental6.setReturnPlan(returnplan);
			rental6.setSituation("1");

			//DatabaseBookRental.rentalProcessingでinsert
			Rental check6 = databaseRental.rentalProcessing(rental6);
			//ちゃんとinsertされていなかったら(null)エラー文を表示
			if (check6 == null){
				msg += "⑥insert出来ませんでした。";
			}
		}

		if (bookId7 != null && bookId7.length() != 0){
			//各フィールドにset
			rental7.setUserId(user.getUserId());
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			rental7.setRentalDate(now);
			//14日を加算
			cal.add(Calendar.DATE, 14);
			//結果を返却予定日にset
			String returnplan = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
			rental7.setReturnPlan(returnplan);
			rental7.setSituation("1");

			//DatabaseBookRental.rentalProcessingでinsert
			Rental check7 = databaseRental.rentalProcessing(rental7);
			//ちゃんとinsertされていなかったら(null)エラー文を表示
			if (check7 == null){
				msg += "⑦insert出来ませんでした。";
			}
		}

		if (bookId8 != null && bookId8.length() != 0){
			//各フィールドにset
			rental8.setUserId(user.getUserId());
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			rental8.setRentalDate(now);
			//14日を加算
			cal.add(Calendar.DATE, 14);
			//結果を返却予定日にset
			String returnplan = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
			rental8.setReturnPlan(returnplan);
			rental8.setSituation("1");

			//DatabaseBookRental.rentalProcessingでinsert
			Rental check8 = databaseRental.rentalProcessing(rental8);
			//ちゃんとinsertされていなかったら(null)エラー文を表示
			if (check8 == null){
				msg += "⑧insert出来ませんでした。";
			}
		}

		if (bookId9 != null && bookId9.length() != 0){
			//各フィールドにset
			rental9.setUserId(user.getUserId());
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			rental9.setRentalDate(now);
			//14日を加算
			cal.add(Calendar.DATE, 14);
			//結果を返却予定日にset
			String returnplan = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
			rental9.setReturnPlan(returnplan);
			rental9.setSituation("1");

			//DatabaseBookRental.rentalProcessingでinsert
			Rental check9 = databaseRental.rentalProcessing(rental9);
			//ちゃんとinsertされていなかったら(null)エラー文を表示
			if (check9 == null){
				msg += "⑨insert出来ませんでした。";
			}
		}

		if (bookId10 != null && bookId10.length() != 0){
			//各フィールドにset
			rental10.setUserId(user.getUserId());
			String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			rental10.setRentalDate(now);
			//14日を加算
			cal.add(Calendar.DATE, 14);
			//結果を返却予定日にset
			String returnplan = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
			rental10.setReturnPlan(returnplan);
			rental10.setSituation("1");

			//DatabaseBookRental.rentalProcessingでinsert
			Rental check10 = databaseRental.rentalProcessing(rental3);
			//ちゃんとinsertされていなかったら(null)エラー文を表示
			if (check10 == null){
				msg += "⑩insert出来ませんでした。";
			}

		}

		if (msg == null){

			//貸し出し処理完了
			RequestDispatcher dispatcher = request.getRequestDispatcher("/rentalCommand/rental4.jsp");
			dispatcher.forward(request, response);

		}else{

			//処理失敗
			session.setAttribute("処理失敗", "貸し出し処理に失敗しました。入力し直してください。");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/RentalCansel");
			dispatcher.forward(request, response);

		}

	}

}
