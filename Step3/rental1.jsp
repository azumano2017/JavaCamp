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
p {
	font-color: #1a1a1a;
	padding: 1em;
	border: 3px solid #ffd700;
	border-radius: 3em .7em 2em .7em/.7em 2em .7em 3em;
}
</style>
</head>
<body>
<h1><span style="border-bottom:dotted 7px #ffd700;">図書貸し出し</span></h1>
<div class="yohaku">
会員のIDを入力してください。<br>
<font color=red><%
	String errorMsg2 = (String) request.getAttribute("処理失敗");
	if(errorMsg2 != null){
		out.println("*** " + errorMsg2 + " ***");
		request.removeAttribute("処理失敗");
	}
%></font>
<font color=red><%
	String msg = (String) request.getAttribute("IDなし");
	if(msg != null){
		out.println(msg);
		request.removeAttribute("IDなし");
	}
%></font>
<form action="/library4/Rental" method="post">
<input type="text" name="userId">
<input type="submit" value="実行"><br><br>
</form>
<br><br>
<button class="btn btn3" type="button" onclick="location.href='/library4/index.jsp'">メインメニュー</button><br>
</div>
</body>
</html>