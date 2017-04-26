<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="library4.DatabaseUsers" %>
<%@ page import="model.User" %>
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
<%
	//セッションスコープから登録したいデータを取得
	User user = (User) session.getAttribute("addUser");

	DatabaseUsers databaseusers = new DatabaseUsers();
	System.out.println(user.getName());

	//nullじゃなかったらデータベースに保持して、セッションスコープを削除
	if(user != null){

		User addUser = databaseusers.addUser(user);
		session.removeAttribute("addUser");
%>
登録が完了しました。
<br><br><br>

<% }else{ %>
登録に失敗しました。

<% } %>
<br>
<br>
<br>
<button class="btn btn3" type="button" onclick="location.href='/library4/addUserCommand/addUser1.jsp'">登録に戻る</button>
　<button class="btn btn3" type="button" onclick="location.href='/library4/index.jsp'">メインメニュー</button><br>
</div>
</body>
</html>