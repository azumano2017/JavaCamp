<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="library4.DatabaseBookCatalog" %>
<%@ page import="model.Book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>図書館システム</title>
<style type="text/css">
body { background: whitesmoke; color: black; margin-left: 5em; margin-right: 5em; font-size: 1.0em; }
h2 { text-align: right; font-size: 1.2em; }
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
<%
	//セッションスコープから登録したいデータを取得
	Book bk = (Book) session.getAttribute("addBook");

	DatabaseBookCatalog catalog = DatabaseBookCatalog.getInstance();

	//nullじゃなかったらデータベースに保持する
	if(bk != null){

		Book addbook = catalog.addBook(bk);
		//セッションスコープを削除
		session.removeAttribute("addBook");
%>
登録が完了しました。
<br><br><br>

<% }else{ %>
登録に失敗しました。

<% } %>
<br>
<br>
<br>
<button class="btn btn3" type="button" onclick="location.href='/library4/addBookCommand/addBook1.jsp'">登録に戻る</button>
　<button class="btn btn3" type="button" onclick="location.href='/library4/index.jsp'">メインメニュー</button><br>
</body>
</html>