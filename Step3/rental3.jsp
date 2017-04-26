<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Rental" %>
<%@ page import="model.User" %>
<%
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
.btn3:hover{
	margin: 5px 0 0 0;
	box-shadow:none;
}
</style>
</head>
<body>
<h1><span style="border-bottom:dotted 7px #ffd700;">図書貸し出し</span></h1>
<div class="yohaku">
<%
	int rentals = 0;

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
%>
<table>
	<tr>
		<th>図書ID</th>
		<th>タイトル</th>
		<th>備考</th>
	</tr>
	<% if (bookId1 != null && bookId1.length() != 0){%>
	<tr>
		<td><% out.print(rental1.getBookId()); %></td>
		<td><% out.print(rental1.getTitle()); %></td>
		<td><% out.print(rental1.getMemo()); %></td>
	<tr>
	<% } %>
	<% if (bookId2 != null && bookId2.length() != 0){%>
	<tr>
		<td><% out.print(rental2.getBookId()); %></td>
		<td><% out.print(rental2.getTitle()); %></td>
		<td><% out.print(rental2.getMemo()); %></td>
	<tr>
	<% } %>
	<% if (bookId3 != null && bookId3.length() != 0){%>
	<tr>
		<td><% out.print(rental3.getBookId()); %></td>
		<td><% out.print(rental3.getTitle()); %></td>
		<td><% out.print(rental3.getMemo()); %></td>
	<tr>
	<% } %>
	<% if (bookId4 != null && bookId4.length() != 0){%>
	<tr>
		<td><% out.print(rental4.getBookId()); %></td>
		<td><% out.print(rental4.getTitle()); %></td>
		<td><% out.print(rental4.getMemo()); %></td>
	<tr>
	<% } %>
	<% if (bookId5 != null && bookId5.length() != 0){%>
	<tr>
		<td><% out.print(rental5.getBookId()); %></td>
		<td><% out.print(rental5.getTitle()); %></td>
		<td><% out.print(rental5.getMemo()); %></td>
	<tr>
	<% } %>
	<% if (bookId6 != null && bookId6.length() != 0){%>
	<tr>
		<td><% out.print(rental6.getBookId()); %></td>
		<td><% out.print(rental6.getTitle()); %></td>
		<td><% out.print(rental6.getMemo()); %></td>
	<tr>
	<% } %>
	<% if (bookId7 != null && bookId7.length() != 0){%>
	<tr>
		<td><% out.print(rental7.getBookId()); %></td>
		<td><% out.print(rental7.getTitle()); %></td>
		<td><% out.print(rental7.getMemo()); %></td>
	<tr>
	<% } %>
	<% if (bookId8 != null && bookId8.length() != 0){%>
	<tr>
		<td><% out.print(rental8.getBookId()); %></td>
		<td><% out.print(rental8.getTitle()); %></td>
		<td><% out.print(rental8.getMemo()); %></td>
	<tr>
	<% } %>
	<% if (bookId9 != null && bookId9.length() != 0){%>
	<tr>
		<td><% out.print(rental9.getBookId()); %></td>
		<td><% out.print(rental9.getTitle()); %></td>
		<td><% out.print(rental9.getMemo()); %></td>
	<tr>
	<% } %>
	<% if (bookId10 != null && bookId10.length() != 0){%>
	<tr>
		<td><% out.print(rental10.getBookId()); %></td>
		<td><% out.print(rental10.getTitle()); %></td>
		<td><% out.print(rental10.getMemo()); %></td>
	<tr>
	<% } %>
</table>
<br><br>
この内容で登録しますか？<br>
<br>
<input type="button" value="登録" onclick="location.href='/library4/Rental3'">
<input type="button" value="編集" onclick="location.href='/library4/rentalCommand/rental2.jsp'">
<input type="button" value="キャンセル" onclick="location.href='/library4/RentalCancel'">
<br>
<br>
<br>
<button class="btn btn3" type="button" onclick="location.href='/library4/index.jsp'">メインメニュー</button><br>
<br><br>
</div>
</body>
</html>