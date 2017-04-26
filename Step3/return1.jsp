<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<br>
<span style="border-bottom:dotted 3px #ffd700;">会員のIDを入力してください</span><br>
<br>
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
<form action="/library4/Return" method="post">
<input type="text" name="userId">
<input type="submit" value="実行"><br><br>
</form>
<br><br>
<button class="btn btn3" type="button" onclick="location.href='/library4/index.jsp'">メインメニュー</button><br>
</div>
</body>
</html>