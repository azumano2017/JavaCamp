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

import model.User;


@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//入力した情報が正しいかどうか判定する

		//リクエストパラメータを取得
		request.setCharacterEncoding("UTF-8");
		User user = new User();


		//入力チェック

		String name = request.getParameter("name");
		user.setName(name);
		if( (name == null) || (name.length() == 0)){
			request.setAttribute("氏名", "氏名を入力してください。");
		}else if( !(name.contains("　"))){
			request.setAttribute("氏名", "性と名の間に全角スペースを入力してください。");
		}

		String furigana = request.getParameter("furigana");
		user.setFurigana(furigana);
		if( (furigana == null) || (furigana.length() == 0)){
			request.setAttribute("フリガナ", "フリガナを入力してください。");
		}else if( !(furigana.contains("　"))){
			request.setAttribute("フリガナ", "性と名の間に全角スペースを入力してください。");
		}

		String zipCode = request.getParameter("zipCode");
		user.setZipCode(zipCode);
		if(zipCode.length() == 7){

		}else if( (zipCode == null) || (zipCode.length() == 0)){
			request.setAttribute("郵便番号", "郵便番号を入力してください。");
		}else {
			request.setAttribute("郵便番号", "郵便番号を正しく入力してください。");
		}

		String address = request.getParameter("address");
		user.setAddress(address);
		if( (address == null) || (address.length() == 0)){
			request.setAttribute("住所", "住所を入力してください。");
		}

		String tel = request.getParameter("tel");
		String mobilePhone = request.getParameter("mobilePhone");

		user.setTel(tel);
		user.setMobilePhone(mobilePhone);


		if(tel.length() == 10 || mobilePhone.length() == 11){

		}else{
			request.setAttribute("電話番号", "電話番号か携帯番号どちらかを正しく入力してください。");
		}

		String email = request.getParameter("email");
		user.setEmail(email);

		//年月日それぞれ取得して合体(publicationDate1に)させて、実際に存在する日付か確認する
	    String year = request.getParameter("year");
		String month = request.getParameter("month");
		String days = request.getParameter("days");
		String dataOfBirth = year + "-" + month + "-" + days;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	    try {
	        format.setLenient(false);
	        format.parse(dataOfBirth);

	        user.setDateOfBirth(dataOfBirth);

	    } catch (Exception e) {
	    	request.setAttribute("生年月日", "生年月日を正しく入力してください。");
	    }

		String gender = request.getParameter("gender");
		user.setGender(gender);

		String pass = request.getParameter("pass");
		user.setPass(pass);
		if( (pass == null) || (pass.length() == 0)){
			request.setAttribute("パスワード", "パスワードを入力してください。");
		}
		if((pass.length() > 8 && pass.length() < 4 ) && !(pass.matches("[0-9]+"))){
			request.setAttribute("パスワード", "パスワードを正しく入力してください。");
		}

		//現在の日時をbookのdataCreatedDateにset
		String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		user.setDataCreatedDate(now);

		//bookの情報をセッションスコープに保存
		HttpSession session = request.getSession();
		session.setAttribute("addUser", user);

		String msg1 = (String) request.getAttribute("氏名");
		String msg2 = (String) request.getAttribute("フリガナ");
		String msg3 = (String) request.getAttribute("郵便番号");
		String msg4 = (String) request.getAttribute("住所");
		String msg5 = (String) request.getAttribute("電話番号");
		String msg6 = (String) request.getAttribute("携帯番号");
		String msg7 = (String) request.getAttribute("メールアドレス");
		String msg8 = (String) request.getAttribute("生年月日");
		String msg9 = (String) request.getAttribute("パスワード");


		//エラーがなければ登録を続行
		if( msg1 == null && msg2 == null && msg3 == null && msg4 == null && msg5 == null && msg6 == null && msg7 == null && msg8 == null && msg9 == null ){

			RequestDispatcher dispatcher = request.getRequestDispatcher("/addUserCommand/addUser2.jsp");
			dispatcher.forward(request, response);

		}else{

			RequestDispatcher dispatcher = request.getRequestDispatcher("/addUserCommand/addUser.jsp");
			dispatcher.forward(request, response);
		}

	}

}
