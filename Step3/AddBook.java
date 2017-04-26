package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Book;


@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//フォームに入力した情報が正しいか判定する

		//リクエストパラメータを取得
		request.setCharacterEncoding("UTF-8");
		Book book = new Book();


		//パラメータを取得
		//bookの各フィールドにset
		//未入力だったら、リクエストスコープにエラーメッセージを保存
		String title = request.getParameter("title");
		book.setTitle(title);
		if( (title == null) || (title.length() == 0)){
			request.setAttribute("タイトル", "タイトルを入力してください。");
		}

		String author = request.getParameter("author");
		book.setAuthor(author);
		if( (author == null) || (author.length() == 0)){
			request.setAttribute("著者", "著者を入力してください。");
		}

		String translator = request.getParameter("translator");
		book.setTranslator(translator);

		String publisher = request.getParameter("publisher");
		book.setPublisher(publisher);

		if( (publisher == null) || (publisher.length() == 0)){
			request.setAttribute("出版社", "出版社を入力してください。");
		}

		//年月日それぞれ取得して合体(publicationDate1に)させて、実際に存在する日付か確認する
	    String pdyear = request.getParameter("pdyear");
		String pdmonth = request.getParameter("pdmonth");
		String pddays = request.getParameter("pddays");
		String publicationDate1 = pdyear + "-" + pdmonth + "-" + pddays;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	    try {
	        format.setLenient(false);
	        format.parse(publicationDate1);

	        book.setPublicationDate(publicationDate1);

	    } catch (Exception e) {
	    	request.setAttribute("出版年月日", "出版年月日を正しく入力してください。");
	    }


		String code = request.getParameter("code");
		book.setCode(code);

		String memo = request.getParameter("memo");
		book.setMemo(memo);

		String keyword = request.getParameter("keyword");
		book.setKeyword(keyword);

		String dataCreator = request.getParameter("dataCreator");
		book.setDataCreator(dataCreator);
		if( (dataCreator == null) || (dataCreator.length() == 0)){
			request.setAttribute("登録者", "登録者を入力してください。");
		}

		//現在の日時をbookのdataCreatedDateにset
		String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		book.setDataCreatedDate(now);

		//bookの情報をセッションスコープに保存
		HttpSession session = request.getSession();
		session.setAttribute("addBook", book);

		String msg1 = (String) request.getAttribute("タイトル");
		String msg2 = (String) request.getAttribute("著者");
		String msg3 = (String) request.getAttribute("出版社");
		String msg4 = (String) request.getAttribute("出版年月日");
		String msg5 = (String) request.getAttribute("登録者");


		//エラーがなければ登録を続行
		if( msg1 == null && msg2 == null && msg3 == null && msg4 == null && msg5 == null ){

			RequestDispatcher dispatcher = request.getRequestDispatcher("/addBookCommand/addBook2.jsp");
			dispatcher.forward(request, response);

		//ひとつでもエラーメッセージがあれば、フォーム画面に戻って、エラーメッセージ表示
		}else{

			RequestDispatcher dispatcher = request.getRequestDispatcher("/addBookCommand/addBook1.jsp");
			dispatcher.forward(request, response);
		}

	}

}
