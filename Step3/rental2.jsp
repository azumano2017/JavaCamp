<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%@ page import="model.Rental" %>
<%
	System.out.println("rental2に来てる");
	User user = (User) session.getAttribute("貸し出しする会員");
	String userName = user.getName();

	Rental[] rentalBooks = (Rental[]) session.getAttribute("会員の既に借りている図書");
	int bookLength = rentalBooks.length;
	//これから借りることのできる冊数↓
	int rentalOKBooks = (10 - bookLength);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>図書貸し出し</title>
<style type="text/css">
body { background: white; color: black; margin: 30px; }
h1 {
	padding: 1em;
	border: 3px solid #ffd700;
	border-radius: 3em .7em 2em .7em/.7em 2em .7em 3em;
}
.yohaku { margin: 40px; }
p {
	font-color: #1a1a1a;
	padding: 1em;
	border: 3px solid #ffd700;
	border-radius: 3em .7em 2em .7em/.7em 2em .7em 3em;
}
table { border-collapse: collapse; }
th { border: solid 1px; padding: 0.5em; }
td { border: solid 1px; padding: 0.5em; }
.btn3{
	margin: 0 0 5px 0;
	display: inline-block;
	border-radius: 5px;
	box-shadow: 0 5px slategray;
	border-bottom: 1px solid slategray;
	font-size: 1.0em; font-weight: bold; padding: 7px 25px;
}
</style>
</head>
<body>
<h1><span style="border-bottom:dotted 7px #ffd700;">図書貸し出し</span></h1>
<div class="yohaku">
<%
	Rental newRental1 = (Rental) session.getAttribute("図書1");
	Rental newRental2 = (Rental) session.getAttribute("図書2");
	Rental newRental3 = (Rental) session.getAttribute("図書3");
	Rental newRental4 = (Rental) session.getAttribute("図書4");
	Rental newRental5 = (Rental) session.getAttribute("図書5");
	Rental newRental6 = (Rental) session.getAttribute("図書6");
	Rental newRental7 = (Rental) session.getAttribute("図書7");
	Rental newRental8 = (Rental) session.getAttribute("図書8");
	Rental newRental9 = (Rental) session.getAttribute("図書9");
	Rental newRental10 = (Rental) session.getAttribute("図書10");

	//newRental1～10のnullチェック
	//全部nullだったら初めてフォームに入力する
	if (newRental1 == null && newRental2 == null && newRental3 == null && newRental4 == null && newRental5 == null
		&& newRental6 == null && newRental7 == null && newRental8 == null && newRental9 == null && newRental10 == null){

		//既に借りている図書が10冊の場合、返却するまで借りられない
		if (bookLength == 10){   //❷
%>
			<%= userName %>さんは現在、10冊借りています。<br>
			返却をしていただいてから貸し出しをお願いします。<br>
			<br>
			<br>
<%
		//既に借りている図書が0～9冊の場合(初入力)
		}else{     //❷
			System.out.println("初入力で10冊未満にきてる");
%>
			<font color="red">
<%= userName %>さんの借りている図書</font><br>
			<br>
			<table>
				<tr>
					<th>図書ID</th>
					<th>タイトル</th>
					<th>貸し出し日</th>
					<th>備考</th>
				</tr>
				<% for(int i=0; i<bookLength; i++){ %>
					<tr>
						<td><% out.print(rentalBooks[i].getBookId()); %></td>
						<td><% out.print(rentalBooks[i].getTitle()); %></td>
						<td><% out.print(rentalBooks[i].getRentalDate()); %></td>
						<td><% out.print(rentalBooks[i].getMemo()); %></td>
					</tr>
				<% } %>
			</table>
			<br><br><br>
			<font color="red">
			<%= userName %>さんは あと<%= rentalOKBooks %>冊まで借りることができます。<br>
			<br>
			</font>
			<br>
			<form action="/library4/Rental2" method="post">
			<table>
				<tr>
					<td><div align="right">図書ID</div></td>
					<td><input type="text" name="bookId1" class="form1"></td>
					<td><div align="right">備考</div></td>
					<td><input type="text" name="memo1" class="form1"></td>
				</tr>
				<tr>
					<td><div align="right">図書ID</div></td>
					<td><input type="text" name="bookId2" class="form1"></td>
					<td><div align="right">備考</div></td>
					<td><input type="text" name="memo2" class="form1"></td>
				</tr>
				<tr>
					<td><div align="right">図書ID</div></td>
					<td><input type="text" name="bookId3" class="form1"></td>
					<td><div align="right">備考</div></td>
					<td><input type="text" name="memo3" class="form1"></td>
				</tr>
				<tr>
					<td><div align="right">図書ID</div></td>
					<td><input type="text" name="bookId4" class="form1"></td>
					<td><div align="right">備考</div></td>
					<td><input type="text" name="memo4" class="form1"></td>
				</tr>
				<tr>
					<td><div align="right">図書ID</div></td>
					<td><input type="text" name="bookId5" class="form1"></td>
					<td><div align="right">備考</div></td>
					<td><input type="text" name="memo5" class="form1"></td>
				</tr>
				<tr>
					<td><div align="right">図書ID</div></td>
					<td><input type="text" name="bookId6" class="form1"></td>
					<td><div align="right">備考</div></td>
					<td><input type="text" name="memo6" class="form1"></td>
				</tr>
				<tr>
					<td><div align="right">図書ID</div></td>
					<td><input type="text" name="bookId7" class="form1"></td>
					<td><div align="right">備考</div></td>
					<td><input type="text" name="memo7" class="form1"></td>
				</tr>
				<tr>
					<td><div align="right">図書ID</div></td>
					<td><input type="text" name="bookId8" class="form1"></td>
					<td><div align="right">備考</div></td>
					<td><input type="text" name="memo8" class="form1"></td>
				</tr>
				<tr>
					<td><div align="right">図書ID</div></td>
					<td><input type="text" name="bookId9" class="form1"></td>
					<td><div align="right">備考</div></td>
					<td><input type="text" name="memo9" class="form1"></td>
				</tr>
				<tr>
					<td><div align="right">図書ID</div></td>
					<td><input type="text" name="bookId10" class="form1"></td>
					<td><div align="right">備考</div></td>
					<td><input type="text" name="memo10" class="form1"></td>
				</tr>
			</table><br>
			<input type="submit" value="登録"></form>
<%
		}    //❷

	//編集かエラーで戻ってきた場合
	}else{   //❶

		System.out.println("編集、エラー文で10冊未満にきてる");

		String bookId1 = newRental1.getBookId();
		String memo1 = newRental1.getMemo();
		String bookId2 = newRental2.getBookId();
		String memo2 = newRental2.getMemo();
		String bookId3 = newRental3.getBookId();
		String memo3 = newRental3.getMemo();
		String bookId4 = newRental4.getBookId();
		String memo4 = newRental4.getMemo();
		String bookId5 = newRental5.getBookId();
		String memo5 = newRental5.getMemo();
		String bookId6 = newRental6.getBookId();
		String memo6 = newRental6.getMemo();
		String bookId7 = newRental7.getBookId();
		String memo7 = newRental7.getMemo();
		String bookId8 = newRental8.getBookId();
		String memo8 = newRental8.getMemo();
		String bookId9 = newRental9.getBookId();
		String memo9 = newRental9.getMemo();
		String bookId10 = newRental10.getBookId();
		String memo10 = newRental1.getMemo();
%>
		<font color="red">
<%= userName %>さんの借りている図書</font><br>
		<br>
		<table>
			<tr>
				<th>図書ID</th>
				<th>タイトル</th>
				<th>貸し出し日</th>
				<th>備考</th>
			</tr>
			<% for(int i=0; i<bookLength; i++){ %>
				<tr>
					<td><% out.print(rentalBooks[i].getBookId()); %></td>
					<td><% out.print(rentalBooks[i].getTitle()); %></td>
					<td><% out.print(rentalBooks[i].getRentalDate()); %></td>
					<td><% out.print(rentalBooks[i].getMemo()); %></td>
				</tr>
			<% } %>
		</table>
		<br><br><br>
		<font color="red">
		<%= userName %>さんは あと<%= rentalOKBooks %>冊まで借りることができます。<br>
		<br>
		<br>
		<%
			String errorMsg1 = (String) request.getAttribute("貸し出しNG");
			if(errorMsg1 != null){
				out.println("*** " + errorMsg1 + " ***");
				request.removeAttribute("貸し出しNG");
			}
		%>
		<%
			String errorMsg2 = (String) request.getAttribute("貸し出し可能冊数");
			if(errorMsg2 != null){
				out.println("*** " + errorMsg2 + " ***");
				request.removeAttribute("貸し出し可能冊数");
			}
		%>
		</font>
		<br><br>
		<form action="/library4/Rental2" method="post">
		<table>
			<tr>
				<td><div align="right">図書ID</div></td>
				<% if (bookId1 != null){ %>
					<td><input type="text" name="bookId1" class="form1" value="<%= bookId1 %>"></td>
				<% }else{ %>
					<td><input type="text" name="bookId1" class="form1"></td>
				<% } %>
				<td><div align="right">備考</div></td>
				<% if (memo1 != null){ %>
					<td><input type="text" name="memo1" class="form1" value="<%= memo1 %>"></td>
				<% }else{ %>
					<td><input type="text" name="memo1" class="form1"></td>
				<% } %>
				<td><font color="red">
				<%
					String msg1 = (String) request.getAttribute("IDなし1");
					if(msg1 != null){
						out.println(msg1);
						request.removeAttribute("IDなし1");
					}
				%></font></td>
			</tr>
			<tr>
				<td><div align="right">図書ID</div></td>
				<% if (bookId2 != null){ %>
					<td><input type="text" name="bookId2" class="form1" value="<%= bookId2 %>"></td>
				<% }else{ %>
					<td><input type="text" name="bookId2" class="form1"></td>
				<% } %>
				<td><div align="right">備考</div></td>
				<% if (memo2 != null){ %>
					<td><input type="text" name="memo2" class="form1" value="<%= memo2 %>"></td>
				<% }else{ %>
					<td><input type="text" name="memo2" class="form1"></td>
				<% } %>
				<td><font color="red">
				<%
					String msg2 = (String) request.getAttribute("IDなし2");
					if(msg2 != null){
						out.println(msg2);
						request.removeAttribute("IDなし2");
					}
				%></font></td>
			</tr>
			<tr>
				<td><div align="right">図書ID</div></td>
				<% if (bookId3 != null){ %>
					<td><input type="text" name="bookId3" class="form1" value="<%= bookId3 %>"></td>
				<% }else{ %>
					<td><input type="text" name="bookId3" class="form1"></td>
				<% } %>
				<td><div align="right">備考</div></td>
				<% if (memo3 != null){ %>
					<td><input type="text" name="memo3" class="form1" value="<%= memo3 %>"></td>
				<% }else{ %>
					<td><input type="text" name="memo3" class="form1"></td>
				<% } %>
				<td><font color="red">
				<%
					String msg3 = (String) request.getAttribute("IDなし3");
					if(msg3 != null){
						out.println(msg3);
						request.removeAttribute("IDなし3");
					}
				%></font></td>
			</tr>
			<tr>
				<td><div align="right">図書ID</div></td>
				<% if (bookId4 != null){ %>
					<td><input type="text" name="bookId4" class="form1" value="<%= bookId4 %>"></td>
				<% }else{ %>
					<td><input type="text" name="bookId4" class="form1"></td>
				<% } %>
				<td><div align="right">備考</div></td>
				<% if (memo4 != null){ %>
					<td><input type="text" name="memo4" class="form1" value="<%= memo4 %>"></td>
				<% }else{ %>
					<td><input type="text" name="memo4" class="form1"></td>
				<% } %>
				<td><font color="red">
				<%
					String msg4 = (String) request.getAttribute("IDなし4");
					if(msg4 != null){
						out.println(msg4);
						request.removeAttribute("IDなし4");
					}
				%></font></td>
			</tr>
			<tr>
				<td><div align="right">図書ID</div></td>
				<% if (bookId5 != null){ %>
					<td><input type="text" name="bookId5" class="form1" value="<%= bookId5 %>"></td>
				<% }else{ %>
					<td><input type="text" name="bookId5" class="form1"></td>
				<% } %>
				<td><div align="right">備考</div></td>
				<% if (memo5 != null){ %>
					<td><input type="text" name="memo5" class="form1" value="<%= memo5 %>"></td>
				<% }else{ %>
					<td><input type="text" name="memo5" class="form1"></td>
				<% } %>
				<td><font color="red">
				<%
					String msg5 = (String) request.getAttribute("IDなし5");
					if(msg5 != null){
						out.println(msg5);
						request.removeAttribute("IDなし5");
					}
				%></font></td>
			</tr>
			<tr>
				<td><div align="right">図書ID</div></td>
				<% if (bookId6 != null){ %>
					<td><input type="text" name="bookId6" class="form1" value="<%= bookId6 %>"></td>
				<% }else{ %>
					<td><input type="text" name="bookId6" class="form1"></td>
				<% } %>
				<td><div align="right">備考</div></td>
				<% if (memo6 != null){ %>
					<td><input type="text" name="memo6" class="form1" value="<%= memo6 %>"></td>
				<% }else{ %>
					<td><input type="text" name="memo6" class="form1"></td>
				<% } %>
				<td><font color="red">
				<%
					String msg6 = (String) request.getAttribute("IDなし6");
					if(msg6 != null){
						out.println(msg6);
						request.removeAttribute("IDなし6");
					}
				%></font></td>
			</tr>
			<tr>
				<td><div align="right">図書ID</div></td>
				<% if (bookId7 != null){ %>
					<td><input type="text" name="bookId7" class="form1" value="<%= bookId7 %>"></td>
				<% }else{ %>
					<td><input type="text" name="bookId7" class="form1"></td>
				<% } %>
				<td><div align="right">備考</div></td>
				<% if (memo7 != null){ %>
					<td><input type="text" name="memo7" class="form1" value="<%= memo7 %>"></td>
				<% }else{ %>
					<td><input type="text" name="memo7" class="form1"></td>
				<% } %>
				<td><font color="red">
				<%
					String msg7 = (String) request.getAttribute("IDなし7");
					if(msg7 != null){
						out.println(msg7);
						request.removeAttribute("IDなし7");
					}
				%></font></td>
			</tr>
			<tr>
				<td><div align="right">図書ID</div></td>
				<% if (bookId8 != null){ %>
					<td><input type="text" name="bookId8" class="form1" value="<%= bookId8 %>"></td>
				<% }else{ %>
					<td><input type="text" name="bookId8" class="form1"></td>
				<% } %>
				<td><div align="right">備考</div></td>
				<% if (memo8 != null){ %>
					<td><input type="text" name="memo8" class="form1" value="<%= memo8 %>"></td>
				<% }else{ %>
					<td><input type="text" name="memo8" class="form1"></td>
				<% } %>
				<td><font color="red">
				<%
					String msg8 = (String) request.getAttribute("IDなし8");
					if(msg8 != null){
						out.println(msg8);
						request.removeAttribute("IDなし8");
					}
				%></font></td>
			</tr>
			<tr>
				<td><div align="right">図書ID</div></td>
				<% if (bookId9 != null){ %>
					<td><input type="text" name="bookId9" class="form1" value="<%= bookId9 %>"></td>
				<% }else{ %>
					<td><input type="text" name="bookId9" class="form1"></td>
				<% } %>
				<td><div align="right">備考</div></td>
				<% if (memo9 != null){ %>
					<td><input type="text" name="memo9" class="form1" value="<%= memo9 %>"></td>
				<% }else{ %>
					<td><input type="text" name="memo9" class="form1"></td>
				<% } %>
				<td><font color="red">
				<%
					String msg9 = (String) request.getAttribute("IDなし9");
					if(msg9 != null){
						out.println(msg9);
						request.removeAttribute("IDなし9");
					}
				%></font></td>
			</tr>
			<tr>
				<td><div align="right">図書ID</div></td>
				<% if (bookId10 != null){ %>
					<td><input type="text" name="bookId10" class="form1" value="<%= bookId10 %>"></td>
				<% }else{ %>
					<td><input type="text" name="bookId10" class="form1"></td>
				<% } %>
				<td><div align="right">備考</div></td>
				<% if (memo10 != null){ %>
					<td><input type="text" name="memo10" class="form1" value="<%= memo10 %>"></td>
				<% }else{ %>
					<td><input type="text" name="memo10" class="form1"></td>
				<% } %>
				<td><font color="red">
				<%
					String msg10 = (String) request.getAttribute("IDなし10");
					if(msg10 != null){
						out.println(msg10);
						request.removeAttribute("IDなし10");
					}
				%></font></td>
			</tr>
		</table><br>
		<input type="submit" value="登録">
		<input type="button" value="キャンセル" onclick="location.href='/library4/RentalCansel'"><br>
		</form>

	<% }  //❶ %>
<br>
<br>
<button class="btn btn3" type="button" onclick="location.href='/library4/index.jsp'">メインメニュー</button><br>
</div>
</body>
</html>