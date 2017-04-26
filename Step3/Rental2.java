package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import library4.DatabaseBookCatalog;
import model.Book;
import model.Rental;

//登録内容を確認する
@WebServlet("/Rental2")
public class Rental2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//リクエストパラメータを取得
		request.setCharacterEncoding("UTF-8");
		DatabaseBookCatalog catalog = new DatabaseBookCatalog();
		HttpSession session = request.getSession();
		Rental[] rentalBooks = (Rental[]) session.getAttribute("会員の既に借りている図書");
		int bookLength = rentalBooks.length;
		//これから借りることのできる冊数↓
		int rentalOKBooks = (10 - bookLength);


		//10個あるフォームのうち、何個のフォームに入力されているかカウントする
		int books = 0;
		String bookId1 = request.getParameter("bookId1");
		if(bookId1.length() != 0){
			books += 1;
		}
		String bookId2 = request.getParameter("bookId2");
		if(bookId2.length() != 0){
			books += 1;
		}
		String bookId3 = request.getParameter("bookId3");
		if(bookId3.length() != 0){
			books += 1;
		}
		String bookId4 = request.getParameter("bookId4");
		if(bookId4.length() != 0){
			books += 1;
		}
		String bookId5 = request.getParameter("bookId5");
		if(bookId5.length() != 0){
			books += 1;
		}
		String bookId6 = request.getParameter("bookId6");
		if(bookId6.length() != 0){
			books += 1;
		}
		String bookId7 = request.getParameter("bookId7");
		if(bookId7.length() != 0){
			books += 1;
		}
		String bookId8 = request.getParameter("bookId8");
		if(bookId8.length() != 0){
			books += 1;
		}
		String bookId9 = request.getParameter("bookId9");
		if(bookId9.length() != 0){
			books += 1;
		}
		String bookId10 = request.getParameter("bookId10");
		if(bookId10.length() != 0){
			books += 1;
		}

		//貸し出し可能冊数をこえて入力されていないか確認
		int checkBooks = rentalOKBooks - books;
		//借りることのできる冊数 - 入力した冊数 が、0以上だったらOK
		if (checkBooks >= 0){

			String memo1 = request.getParameter("memo1");
			Rental rental1 = new Rental();
			rental1.setBookId(bookId1);
			rental1.setMemo(memo1);
			session.setAttribute("図書1", rental1);
			if(bookId1 != null && bookId1.length() != 0){
				Book book1 = catalog.searchBook(bookId1);
				//IDが存在しない場合
				if (book1 == null){
					System.out.println("IDなし");
					request.setAttribute("IDなし1", "入力されたIDは存在しません。");
				}else{
					rental1.setTitle(book1.getTitle());
				}
			}

			String memo2 = request.getParameter("memo2");
			Rental rental2 = new Rental();
			rental2.setBookId(bookId2);
			rental2.setMemo(memo2);
			session.setAttribute("図書2", rental2);
			if(bookId2 != null && bookId2.length() != 0){
				Book book2 = catalog.searchBook(bookId2);
				if (book2 == null){
					request.setAttribute("IDなし2", "入力されたIDは存在しません。");
				}else{
					rental2.setTitle(book2.getTitle());
				}
			}

			String memo3 = request.getParameter("memo3");
			Rental rental3 = new Rental();
			rental3.setBookId(bookId3);
			rental3.setMemo(memo3);
			session.setAttribute("図書3", rental3);
			if(bookId3 != null && bookId3.length() != 0){
				Book book3 = catalog.searchBook(bookId3);
				if (book3 == null){
					request.setAttribute("IDなし3", "入力されたIDは存在しません。");
				}else{
					rental3.setTitle(book3.getTitle());
				}
			}

			String memo4 = request.getParameter("memo4");
			Rental rental4 = new Rental();
			rental4.setBookId(bookId4);
			rental4.setMemo(memo4);
			session.setAttribute("図書4", rental4);
			if(bookId4 != null && bookId4.length() != 0){
				Book book4 = catalog.searchBook(bookId4);
				if (book4 == null){
					request.setAttribute("IDなし4", "入力されたIDは存在しません。");
				}else{
					rental4.setTitle(book4.getTitle());
				}
			}

			String memo5 = request.getParameter("memo5");
			Rental rental5 = new Rental();
			rental5.setBookId(bookId5);
			rental5.setMemo(memo5);
			session.setAttribute("図書5", rental5);
			if(bookId5 != null && bookId5.length() != 0){
				Book book5 = catalog.searchBook(bookId5);
				if (book5 == null){
					request.setAttribute("IDなし5", "入力されたIDは存在しません。");
				}else{
					rental5.setTitle(book5.getTitle());
				}
			}

			String memo6 = request.getParameter("memo6");
			Rental rental6 = new Rental();
			rental6.setBookId(bookId6);
			rental6.setMemo(memo6);
			session.setAttribute("図書6", rental6);
			if(bookId6 != null && bookId6.length() != 0){
				Book book6 = catalog.searchBook(bookId6);
				if (book6 == null){
					request.setAttribute("IDなし6", "入力されたIDは存在しません。");
				}else{
					rental6.setTitle(book6.getTitle());
				}
			}

			String memo7 = request.getParameter("memo7");
			Rental rental7 = new Rental();
			rental7.setBookId(bookId7);
			rental7.setMemo(memo7);
			session.setAttribute("図書7", rental7);
			if(bookId7 != null && bookId7.length() != 0){
				Book book7 = catalog.searchBook(bookId7);
				if (book7 == null){
					request.setAttribute("IDなし7", "入力されたIDは存在しません。");
				}else{
					rental7.setTitle(book7.getTitle());
				}
			}

			String memo8 = request.getParameter("memo8");
			Rental rental8 = new Rental();
			rental8.setBookId(bookId8);
			rental8.setMemo(memo8);
			session.setAttribute("図書8", rental8);
			if(bookId8 != null && bookId8.length() != 0){
				Book book8 = catalog.searchBook(bookId8);
				if (book8 == null){
					request.setAttribute("IDなし8", "入力されたIDは存在しません。");
				}else{
					rental8.setTitle(book8.getTitle());
				}
			}

			String memo9 = request.getParameter("memo9");
			Rental rental9 = new Rental();
			rental9.setBookId(bookId9);
			rental9.setMemo(memo9);
			session.setAttribute("図書9", rental9);
			if(bookId9 != null && bookId9.length() != 0){
				Book book9 = catalog.searchBook(bookId9);
				if (book9 == null){
					request.setAttribute("IDなし9", "入力されたIDは存在しません。");
				}else{
					rental9.setTitle(book9.getTitle());
				}
			}

			String memo10 = request.getParameter("memo10");
			Rental rental10 = new Rental();
			rental10.setBookId(bookId10);
			rental10.setMemo(memo10);
			session.setAttribute("図書10", rental10);
			if(bookId10 != null && bookId10.length() != 0){
				Book book10 = catalog.searchBook(bookId10);
				if (book10 == null){
					request.setAttribute("IDなし10", "入力されたIDは存在しません。");
				}else{
					rental10.setTitle(book10.getTitle());
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

				RequestDispatcher dispatcher = request.getRequestDispatcher("/rentalCommand/rental3.jsp");
				dispatcher.forward(request, response);

			}else{

				System.out.println("入力IDエラーがあります。：rental2.jspに戻る");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/rentalCommand/rental2.jsp");
				dispatcher.forward(request, response);
			}

		//借りられる冊数以上に入力したら、フォーム画面に戻る
		}else{

			String memo1 = request.getParameter("memo1");
			Rental rental1 = new Rental();
			rental1.setBookId(bookId1);
			rental1.setMemo(memo1);
			session.setAttribute("図書1", rental1);
			if(bookId1 != null && bookId1.length() != 0){
				Book book1 = catalog.searchBook(bookId1);
				//IDが存在しない場合
				if (book1 == null){
					System.out.println("IDなし");
					request.setAttribute("IDなし1", "入力されたIDは存在しません。");
				}else{
					rental1.setTitle(book1.getTitle());
				}
			}

			String memo2 = request.getParameter("memo2");
			Rental rental2 = new Rental();
			rental2.setBookId(bookId2);
			rental2.setMemo(memo2);
			session.setAttribute("図書2", rental2);
			if(bookId2 != null && bookId2.length() != 0){
				Book book2 = catalog.searchBook(bookId2);
				if (book2 == null){
					request.setAttribute("IDなし2", "入力されたIDは存在しません。");
				}else{
					rental2.setTitle(book2.getTitle());
				}
			}

			String memo3 = request.getParameter("memo3");
			Rental rental3 = new Rental();
			rental3.setBookId(bookId3);
			rental3.setMemo(memo3);
			session.setAttribute("図書3", rental3);
			if(bookId3 != null && bookId3.length() != 0){
				Book book3 = catalog.searchBook(bookId3);
				if (book3 == null){
					request.setAttribute("IDなし3", "入力されたIDは存在しません。");
				}else{
					rental3.setTitle(book3.getTitle());
				}
			}

			String memo4 = request.getParameter("memo4");
			Rental rental4 = new Rental();
			rental4.setBookId(bookId4);
			rental4.setMemo(memo4);
			session.setAttribute("図書4", rental4);
			if(bookId4 != null && bookId4.length() != 0){
				Book book4 = catalog.searchBook(bookId4);
				if (book4 == null){
					request.setAttribute("IDなし4", "入力されたIDは存在しません。");
				}else{
					rental4.setTitle(book4.getTitle());
				}
			}

			String memo5 = request.getParameter("memo5");
			Rental rental5 = new Rental();
			rental5.setBookId(bookId5);
			rental5.setMemo(memo5);
			session.setAttribute("図書5", rental5);
			if(bookId5 != null && bookId5.length() != 0){
				Book book5 = catalog.searchBook(bookId5);
				if (book5 == null){
					request.setAttribute("IDなし5", "入力されたIDは存在しません。");
				}else{
					rental5.setTitle(book5.getTitle());
				}
			}

			String memo6 = request.getParameter("memo6");
			Rental rental6 = new Rental();
			rental6.setBookId(bookId6);
			rental6.setMemo(memo6);
			session.setAttribute("図書6", rental6);
			if(bookId6 != null && bookId6.length() != 0){
				Book book6 = catalog.searchBook(bookId6);
				if (book6 == null){
					request.setAttribute("IDなし6", "入力されたIDは存在しません。");
				}else{
					rental6.setTitle(book6.getTitle());
				}
			}

			String memo7 = request.getParameter("memo7");
			Rental rental7 = new Rental();
			rental7.setBookId(bookId7);
			rental7.setMemo(memo7);
			session.setAttribute("図書7", rental7);
			if(bookId7 != null && bookId7.length() != 0){
				Book book7 = catalog.searchBook(bookId7);
				if (book7 == null){
					request.setAttribute("IDなし7", "入力されたIDは存在しません。");
				}else{
					rental7.setTitle(book7.getTitle());
				}
			}

			String memo8 = request.getParameter("memo8");
			Rental rental8 = new Rental();
			rental8.setBookId(bookId8);
			rental8.setMemo(memo8);
			session.setAttribute("図書8", rental8);
			if(bookId8 != null && bookId8.length() != 0){
				Book book8 = catalog.searchBook(bookId8);
				if (book8 == null){
					request.setAttribute("IDなし8", "入力されたIDは存在しません。");
				}else{
					rental8.setTitle(book8.getTitle());
				}
			}

			String memo9 = request.getParameter("memo9");
			Rental rental9 = new Rental();
			rental9.setBookId(bookId9);
			rental9.setMemo(memo9);
			session.setAttribute("図書9", rental9);
			if(bookId9 != null && bookId9.length() != 0){
				Book book9 = catalog.searchBook(bookId9);
				if (book9 == null){
					request.setAttribute("IDなし9", "入力されたIDは存在しません。");
				}else{
					rental9.setTitle(book9.getTitle());
				}
			}

			String memo10 = request.getParameter("memo10");
			Rental rental10 = new Rental();
			rental10.setBookId(bookId10);
			rental10.setMemo(memo10);
			session.setAttribute("図書10", rental10);
			if(bookId10 != null && bookId10.length() != 0){
				Book book10 = catalog.searchBook(bookId10);
				if (book10 == null){
					request.setAttribute("IDなし10", "入力されたIDは存在しません。");
				}else{
					rental10.setTitle(book10.getTitle());
				}
			}

			System.out.println("貸し出し可能冊数が超えてる");
			request.setAttribute("貸し出しNG", "貸し出し可能な冊数を超えています。入力しなおしてください。");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/rentalCommand/rental2.jsp");
			dispatcher.forward(request, response);

		}
	}

}
