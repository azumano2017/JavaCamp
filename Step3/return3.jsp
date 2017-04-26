<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Rental" %>
<%@ page import="model.User" %>
<%
	//User user = (User) session.getAttribute("貸し出しする会員");
	//String userName = user.getName();

	Rental[] rentalBooks = (Rental[]) session.getAttribute("会員の既に借りている図書");
	int bookLength = rentalBooks.length;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>図書返却</title>
<style>
body { background: white; color: black; margin: 30px; }
h1 {
	padding: 1em;
	border: 3px solid #ffd700;
	border-radius: 3em .7em 2em .7em/.7em 2em .7em 3em;
}
.yohaku { margin: 40px; }
</style>
</head>
<body>
<h1><span style="border-bottom:dotted 7px #ffd700;">図書返却</span></h1>
<div class="yohaku">
<%
	int rentals = 0;

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

%>
<table>
	<tr>
		<th>図書ID</th>
		<th>タイトル</th>
		<th>備考</th>
		<th>返却日</th>
	</tr>
	<% if (bookId1 != null && bookId1.length() != 0){%>
	<tr>
		<td><% out.print(return1.getBookId()); %></td>
		<td><% out.print(return1.getTitle()); %></td>
		<td><% out.print(return1.getMemo()); %></td>
		<td><% out.print(return1.getReturnPlan()); %></td>
	<tr>
	<% } %>
	<% if (bookId2 != null && bookId2.length() != 0){%>
	<tr>
		<td><% out.print(return2.getBookId()); %></td>
		<td><% out.print(return2.getTitle()); %></td>
		<td><% out.print(return2.getMemo()); %></td>
		<td><% out.print(return2.getReturnPlan()); %></td>
	<tr>
	<% } %>
	<% if (bookId3 != null && bookId3.length() != 0){%>
	<tr>
		<td><% out.print(return3.getBookId()); %></td>
		<td><% out.print(return3.getTitle()); %></td>
		<td><% out.print(return3.getMemo()); %></td>
		<td><% out.print(return3.getReturnPlan()); %></td>
	<tr>
	<% } %>
	<% if (bookId4 != null && bookId4.length() != 0){%>
	<tr>
		<td><% out.print(return4.getBookId()); %></td>
		<td><% out.print(return4.getTitle()); %></td>
		<td><% out.print(return4.getMemo()); %></td>
		<td><% out.print(return4.getReturnPlan()); %></td>
	<tr>
	<% } %>
	<% if (bookId5 != null && bookId5.length() != 0){%>
	<tr>
		<td><% out.print(return5.getBookId()); %></td>
		<td><% out.print(return5.getTitle()); %></td>
		<td><% out.print(return5.getMemo()); %></td>
		<td><% out.print(return5.getReturnPlan()); %></td>
	<tr>
	<% } %>
	<% if (bookId6 != null && bookId6.length() != 0){%>
	<tr>
		<td><% out.print(return6.getBookId()); %></td>
		<td><% out.print(return6.getTitle()); %></td>
		<td><% out.print(return6.getMemo()); %></td>
		<td><% out.print(return6.getReturnPlan()); %></td>
	<tr>
	<% } %>
	<% if (bookId7 != null && bookId7.length() != 0){%>
	<tr>
		<td><% out.print(return7.getBookId()); %></td>
		<td><% out.print(return7.getTitle()); %></td>
		<td><% out.print(return7.getMemo()); %></td>
		<td><% out.print(return7.getReturnPlan()); %></td>
	<tr>
	<% } %>
	<% if (bookId8 != null && bookId8.length() != 0){%>
	<tr>
		<td><% out.print(return8.getBookId()); %></td>
		<td><% out.print(return8.getTitle()); %></td>
		<td><% out.print(return8.getMemo()); %></td>
		<td><% out.print(return8.getReturnPlan()); %></td>
	<tr>
	<% } %>
	<% if (bookId9 != null && bookId9.length() != 0){%>
	<tr>
		<td><% out.print(return9.getBookId()); %></td>
		<td><% out.print(return9.getTitle()); %></td>
		<td><% out.print(return9.getMemo()); %></td>
		<td><% out.print(return9.getReturnPlan()); %></td>
	<tr>
	<% } %>
	<% if (bookId10 != null && bookId10.length() != 0){%>
	<tr>
		<td><% out.print(return10.getBookId()); %></td>
		<td><% out.print(return10.getTitle()); %></td>
		<td><% out.print(return10.getMemo()); %></td>
		<td><% out.print(return10.getReturnPlan()); %></td>
	<tr>
	<% } %>
</table>
<br><br>
この内容で返却登録しますか？<br>
<br>
<input type="button" value="登録" onclick="location.href='/library4/Return3'">
<input type="button" value="編集" onclick="location.href='/library4/returnCommand/return2.jsp'">
<input type="button" value="キャンセル" onclick="location.href='/library4/ReturnCancel'">
<br>
<br>
<br>
<button class="btn btn3" type="button" onclick="location.href='/library4/index.jsp'">メインメニュー</button><br>
<br><br>
</div>
</body>
</html>