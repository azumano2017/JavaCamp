<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="library4.DatabaseBookCatalog" %>
<%@ page import="library4.BookWriter" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="model.Book" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<% Book book = (Book) session.getAttribute("addBook"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>図書館システム</title>
<style type="text/css">
body { background: whitesmoke; color: black; margin-left: 5em; margin-right: 5em; font-size: 1.0em; }
p { line-height: 0.5em; font-size: 1.0em; color: red; }
h2 { text-align: right; }
table.table1 { border-collapse: collapse; }
table.table1 td { border: solid 1px; padding: 0.3em; }
p { color: red; }
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
<h1><img src="/library4/gif/title.gif" alt="図書館システム"></h1>
<table  class="table1">
	<tr>
		<td style="background:darkgray" width="150">タイトル</td>
		<td width="400"><% out.print(book.getTitle()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">著者</td>
		<td width="400"><% out.print(book.getAuthor()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">訳者</td>
		<td width="400"><% out.print(book.getTranslator()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">出版社</td>
		<td width="400"><% out.print(book.getPublisher()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">出版年月日</td>
		<td width="400"><% out.print(book.getPublicationDate()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">ISBN/ISSN</td>
		<td width="400"><% out.print(book.getCode()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">備考</td>
		<td width="400"><% out.print(book.getMemo()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">キーワード</td>
		<td width="400"><% out.print(book.getKeyword()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">登録者</td>
		<td width="400"><% out.print(book.getDataCreator()); %></td>
	</tr>
	<tr>
		<td style="background:darkgray" width="150">登録日</td>
		<td width="400"><% out.print(book.getDataCreatedDate()); %></td>
	</tr>
</table>
<br>
この内容で登録しますか？<br><br>
<input type="button" value="登録" onclick="location.href='/library4/addBookCommand/addBook3.jsp'">
<input type="button" value="編集" onclick="location.href='/library4/addBookCommand/addBook1.jsp'">
<input type="button" value="キャンセル" onclick="location.href='/library4/AddBookCancel'">
<br>
<br>
<br>
<button class="btn btn3" type="button" onclick="location.href='/library4/index.jsp'">メインメニュー</button><br>
</body>
</html>