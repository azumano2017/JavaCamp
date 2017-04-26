<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="library4.DatabaseBookCatalog" %>
<%@ page import="library4.BookWriter" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="model.User" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<% User user = (User) session.getAttribute("addUser"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>図書館システム</title>
<style type="text/css">
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
<h1><span style="border-bottom:dotted 7px #ffd700;">会員登録</span></h1>
<div class="yohaku">
<table  class="table1">
	<tr>
		<td style="background:darkgray" width="150">氏名</td>
		<td width="400"><% out.print(user.getName()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">フリガナ</td>
		<td width="400"><% out.print(user.getFurigana()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">郵便番号</td>
		<td width="400"><% out.print(user.getZipCode()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">住所</td>
		<td width="400"><% out.print(user.getAddress()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">電話番号</td>
		<td width="400"><% out.print(user.getTel()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">携帯番号</td>
		<td width="400"><% out.print(user.getMobilePhone()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">メールアドレス</td>
		<td width="400"><% out.print(user.getEmail()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">生年月日</td>
		<td width="400"><% out.print(user.getDateOfBirth()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">性別</td>
		<td width="400"><% out.print(user.getGender()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">パスワード</td>
		<td width="400"><% out.print(user.getPass()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">登録日</td>
		<td width="400"><% out.print(user.getDataCreatedDate()); %></td>
	</tr>
</table>
<br>
この内容で登録しますか？<br><br>
<input type="button" value="登録" onclick="location.href='/library4/addUserCommand/addUser3.jsp'">
<input type="button" value="編集" onclick="location.href='/library4/addBookCommand/addUser1.jsp'">
<input type="button" value="キャンセル" onclick="location.href='/library4/AddUserCancel1'">
<br>
<br>
<br>
<button class="btn btn3" type="button" onclick="location.href='/library4/index.jsp'">メインメニュー</button><br>
</div>
</body>
</html>