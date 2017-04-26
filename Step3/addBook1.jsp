<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>図書館システム</title>
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
<h1><span style="border-bottom:dotted 7px #ffd700;">図書登録</span></h1>
<div class="yohaku">
<%
	//addBookがnullじゃなかったら、一度入力してある情報をフォームに表示しておく
	Book book = (Book) session.getAttribute("addBook");
	if (book != null){

		String title = book.getTitle();
		String author = book.getAuthor();
		String translator = book.getTranslator();
		String publisher = book.getPublisher();
		String publicationDate = book.getPublicationDate();
		String code = book.getCode();
		String memo = book.getMemo();
		String keyword = book.getKeyword();
		String dataCreator = book.getDataCreator();
		String dataCreatedDate = book.getDataCreatedDate();

		//publicationDateを year,month,days に分ける
		String year = publicationDate.substring(0, 4);
		String month = publicationDate.substring(5, 7);
		String days = publicationDate.substring(8, 10);
%>
		<form action="/library4/AddBook" method="post">
		<table border="0">
			<tr>
				<td><div align="right">タイトル</div></td>
				<td width="40"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
				 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
				 border-radius: 5px;">必須</div></td>
				<td style="border-style: none;"><input type="text" name="title" value="<%= title %>">
				<font color="red">
				<%
					String msg1 = (String) request.getAttribute("タイトル");
					if(msg1 != null){
						out.println(msg1);
						request.removeAttribute("タイトル");
					}
				%></font></td>
			</tr>
			<tr>
				<td><div align="right">著者</div></td>
				<td width="40"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
				 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
				 border-radius: 5px;">必須</div></td>
				<td style="border-style: none;"><input type="text" name="author" value="<%= author %>">
				<font color="red">
				<%
					String msg2 = (String) request.getAttribute("著者");
					if(msg2 != null){
						out.println(msg2);
						request.removeAttribute("著者");
					}
				%></font></td>
			</tr>
			<tr>
				<td><div align="right">訳者</div></td>
				<td> </td>
				<td style="border-style: none;"><input type="text" name="translator" value="<%= translator %>"></td>
			</tr>
			<tr>
				<td><div align="right">出版社</div></td>
				<td width="40"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
				 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
				 border-radius: 5px;">必須</div></td>
				<td style="border-style: none;"><input type="text" name="publisher" value="<%= publisher %>">
				<font color="red">
				<%
					String msg3 = (String) request.getAttribute("出版社");
					if(msg3 != null){
						out.println(msg3);
						request.removeAttribute("出版社");
					}
				%>
				</font></td>
			</tr>
			<tr>
				<td><div align="right">出版日</div></td>
				<td width="40"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
				 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
				 border-radius: 5px;">必須</div></td>
				<td style="border-style: none;"><select name="pdyear" >
					<option value="<%= year %>"><%= year %></option>
					<option value="1970">1970</option>
					<option value="1971">1971</option>
					<option value="1972">1972</option>
					<option value="1973">1973</option>
					<option value="1974">1974</option>
					<option value="1975">1975</option>
					<option value="1976">1976</option>
					<option value="1977">1977</option>
					<option value="1978">1978</option>
					<option value="1979">1979</option>
					<option value="1980">1980</option>
					<option value="1981">1981</option>
					<option value="1982">1982</option>
					<option value="1983">1983</option>
					<option value="1984">1984</option>
					<option value="1985">1985</option>
					<option value="1986">1986</option>
					<option value="1987">1987</option>
					<option value="1988">1988</option>
					<option value="1989">1989</option>
					<option value="1990">1990</option>
					<option value="1991">1991</option>
					<option value="1992">1992</option>
					<option value="1993">1993</option>
					<option value="1994">1994</option>
					<option value="1995">1995</option>
					<option value="1996">1996</option>
					<option value="1997">1997</option>
					<option value="1998">1998</option>
					<option value="1999">1999</option>
					<option value="2000">2000</option>
					<option value="2001">2001</option>
					<option value="2002">2002</option>
					<option value="2003">2003</option>
					<option value="2004">2004</option>
					<option value="2005">2005</option>
					<option value="2006">2006</option>
					<option value="2007">2007</option>
					<option value="2008">2008</option>
					<option value="2009">2009</option>
					<option value="2010">2010</option>
					<option value="2011">2011</option>
					<option value="2012">2012</option>
					<option value="2013">2013</option>
					<option value="2014">2014</option>
					<option value="2015">2015</option>
					<option value="2016">2016</option>
					<option value="2017">2017</option>
					</select>年
				<select name="pdmonth" id="pdmonth">
					<option value="<%= month %>"><%= month %></option>
					<option value="01">01</option>
					<option value="02">02</option>
					<option value="03">03</option>
					<option value="04">04</option>
					<option value="05">05</option>
					<option value="06">06</option>
					<option value="07">07</option>
					<option value="08">08</option>
					<option value="09">09</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					</select>月
				<select name="pddays">
					<option value="<%= days %>"><%= days %></option>
					<option value="01">01</option>
					<option value="02">02</option>
					<option value="03">03</option>
					<option value="04">04</option>
					<option value="05">05</option>
					<option value="06">07</option>
					<option value="08">08</option>
					<option value="09">09</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
					<option value="25">25</option>
					<option value="26">26</option>
					<option value="27">27</option>
					<option value="28">28</option>
					<option value="29">29</option>
					<option value="30">30</option>
					<option value="31">31</option>
					</select>日<font color="red">
					<%
						String msg4 = (String) request.getAttribute("出版年月日");
						if(msg4 != null){
							out.println(msg4);
							request.removeAttribute("出版年月日");
						}
					%></font></td>

			</tr>
			<tr>
				<td><div align="right">ISBN/ISSN</div></td>
				<td> </td>
				<td style="border-style: none;"><input type="text" name="code" value="<%= code %>"></td>
			<tr>
				<td><div align="right">備考</div></td>
				<td> </td>
				<td style="border-style: none;"><input type="text" name="memo" value="<%= memo %>"></td>
			</tr>
			<tr>
				<td><div align="right">キーワード</div></td>
				<td> </td>
				<td style="border-style: none;"><input type="text" name="keyword" value="<%= keyword %>"></td>
			</tr>
			<tr>
				<td><div align="right">登録者</div></td>
				<td width="40"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
				 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
				 border-radius: 5px;">必須</div></td>
				<td style="border-style: none;"><input type="text" name="dataCreator" value="<%= dataCreator %>">
				<font color="red">
				<%
					String msg5 = (String) request.getAttribute("登録者");
					if(msg5 != null){
						out.println(msg5);
						request.removeAttribute("登録者");
					}
				%>
				</font></td>
		</table><br>
		<input type="submit" value="登録">
		<input type="button" value="キャンセル" onclick="location.href='/library4/AddBookCancel'"><br>
		<br>
	</form>
	<br>

<%
	//nullだったら初入力、フォームにはなにも表示しない
	} else { %>
	<form action="/library4/AddBook" method="post">
	<table>
		<tr>
			<td><div align="right">タイトル</div></td>
			<td width="40"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
			 border-radius: 5px;">必須</div></td>
			<td><input type="text" name="title"> <font color="red">
			<%
				String msg1 = (String) request.getAttribute("タイトル");
					if(msg1 != null){
					out.println(msg1);
					request.removeAttribute("タイトル");
				}
			%></font></td>
		</tr>
		<tr>
			<td><div align="right">著者</div></td>
			<td width="40"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
			 border-radius: 5px;">必須</div></td>
			<td><input type="text" name="author"> <font color="red">
			<%
				String msg2 = (String) request.getAttribute("著者");
				if(msg2 != null){
					out.println(msg2);
					request.removeAttribute("著者");
				}
			%></font></td>
		</tr>
		<tr>
			<td><div align="right">訳者</div></td>
			<td></td>
			<td><input type="text" name="translator"></td>
		</tr>
		<tr>
			<td><div align="right">出版社</div></td>
			<td width="40"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
			 border-radius: 5px;">必須</div></td>
			<td><input type="text" name="publisher"> <font color="red">
			<%
				String msg3 = (String) request.getAttribute("出版社");
				if(msg3 != null){
					out.println(msg3);
					request.removeAttribute("出版社");
				}
			%></font></td>
		</tr>
		<tr>
			<td><div align="right">出版日</div></td>
			<td width="40"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
			 border-radius: 5px;">必須</div></td>
			<td><select name="pdyear">
				<option value="1970">1970</option>
				<option value="1971">1971</option>
				<option value="1972">1972</option>
				<option value="1973">1973</option>
				<option value="1974">1974</option>
				<option value="1975">1975</option>
				<option value="1976">1976</option>
				<option value="1977">1977</option>
				<option value="1978">1978</option>
				<option value="1979">1979</option>
				<option value="1980">1980</option>
				<option value="1981">1981</option>
				<option value="1982">1982</option>
				<option value="1983">1983</option>
				<option value="1984">1984</option>
				<option value="1985">1985</option>
				<option value="1986">1986</option>
				<option value="1987">1987</option>
				<option value="1988">1988</option>
				<option value="1989">1989</option>
				<option value="1990">1990</option>
				<option value="1991">1991</option>
				<option value="1992">1992</option>
				<option value="1993">1993</option>
				<option value="1994">1994</option>
				<option value="1995">1995</option>
				<option value="1996">1996</option>
				<option value="1997">1997</option>
				<option value="1998">1998</option>
				<option value="1999">1999</option>
				<option value="2000" selected>2000</option>
				<option value="2001">2001</option>
				<option value="2002">2002</option>
				<option value="2003">2003</option>
				<option value="2004">2004</option>
				<option value="2005">2005</option>
				<option value="2006">2006</option>
				<option value="2007">2007</option>
				<option value="2008">2008</option>
				<option value="2009">2009</option>
				<option value="2010">2010</option>
				<option value="2011">2011</option>
				<option value="2012">2012</option>
				<option value="2013">2013</option>
				<option value="2014">2014</option>
				<option value="2015">2015</option>
				<option value="2016">2016</option>
				<option value="2017">2017</option>
				<option value="2017">2018</option>
				<option value="2017">2019</option>
				<option value="2017">2020</option>
				<option value="2017">2021</option>
				<option value="2017">2022</option>
				<option value="2017">2023</option>
				<option value="2017">2024</option>
				<option value="2017">2025</option>
				<option value="2017">2026</option>
				<option value="2017">2027</option>
				<option value="2017">2028</option>
				<option value="2017">2029</option>
				<option value="2017">2030</option>
				</select>年
			<select name="pdmonth" id="pdmonth">
				<option value="01">01</option>
				<option value="02">02</option>
				<option value="03">03</option>
				<option value="04">04</option>
				<option value="05">05</option>
				<option value="06">06</option>
				<option value="07">07</option>
				<option value="08">08</option>
				<option value="09">09</option>
				<option value="10">10</option>
				<option value="11">11</option>
				<option value="12">12</option>
				</select>月
			<select name="pddays">
				<option value="01">01</option>
				<option value="02">02</option>
				<option value="03">03</option>
				<option value="04">04</option>
				<option value="05">05</option>
				<option value="06">07</option>
				<option value="08">08</option>
				<option value="09">09</option>
				<option value="10">10</option>
				<option value="11">11</option>
				<option value="12">12</option>
				<option value="13">13</option>
				<option value="14">14</option>
				<option value="15">15</option>
				<option value="16">16</option>
				<option value="17">17</option>
				<option value="18">18</option>
				<option value="19">19</option>
				<option value="20">20</option>
				<option value="21">21</option>
				<option value="22">22</option>
				<option value="23">23</option>
				<option value="24">24</option>
				<option value="25">25</option>
				<option value="26">26</option>
				<option value="27">27</option>
				<option value="28">28</option>
				<option value="29">29</option>
				<option value="30">30</option>
				<option value="31">31</option>
			</select>日 <font color="red">
			<%
				String msg4 = (String) request.getAttribute("出版年月日");
				if(msg4 != null){
					out.println(msg4);
					request.removeAttribute("出版年月日");
				}
			%></font></td>
		</tr>
		<tr>
			<td><div align="right">ISBN/ISSN</div></td>
			<td> </td>
			<td><input type="text" name="code"></td>
		</tr>
		<tr>
			<td><div align="right">備考</div></td>
			<td> </td>
			<td><input type="text" name="memo"></td>
		</tr>
		<tr>
			<td><div align="right">キーワード</div></td>
			<td> </td>
			<td><input type="text" name="keyword"></td>
		</tr>
		<tr>
			<td><div align="right">登録者</div></td>
			<td width="40"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
			 border-radius: 5px;">必須</div></td>
			<td><input type="text" name="dataCreator"> <font color="red">
			<%
				String msg5 = (String) request.getAttribute("登録者");
				if(msg5 != null){
					out.println(msg5);
					request.removeAttribute("登録者");
				}
			%></font></td>
		</tr>
	</table><br>
		<input type="submit" value="登録">
		<input type="button" value="キャンセル" onclick="location.href='/library4/AddBookCancel'"><br>
		<br>
	</form>
	<br>
<% } %>
<button class="btn btn3" type="button" onclick="location.href='/library4/index.jsp'">メインメニュー</button><br>
</div>
</body>
</html>