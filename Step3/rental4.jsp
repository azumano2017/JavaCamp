<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
貸し出し処理が完了しました。
<%
	//セッションスコープに保存した情報を削除
	session.removeAttribute("図書1");
	session.removeAttribute("図書2");
	session.removeAttribute("図書3");
	session.removeAttribute("図書4");
	session.removeAttribute("図書5");
	session.removeAttribute("図書6");
	session.removeAttribute("図書7");
	session.removeAttribute("図書8");
	session.removeAttribute("図書9");
	session.removeAttribute("図書10");
%>
<br>
<br>
<br>
<button class="btn btn3" type="button" onclick="location.href='/library4/index.jsp'">メインメニュー</button><br>
<br><br>
</div>
</body>
</html>