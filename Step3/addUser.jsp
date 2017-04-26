<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
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
<h1><span style="border-bottom:dotted 7px #ffd700;">会員登録</span></h1>
<div class="yohaku">
<%
	User user = (User) session.getAttribute("addUser");

	//addUserがnullじゃなかった場合、フォームに入力済みの情報を表示
	if (user != null){

		String name = user.getName();
		String firigana = user.getFurigana();
		String zipCode = user.getZipCode();
		String address = user.getAddress();
		String tel = user.getTel();
		String mobilePhone = user.getMobilePhone();
		String email = user.getEmail();
		String dateOfBirth = user.getDateOfBirth();
		String gender = user.getGender();
		String pass = user.getPass();

		//dataOfBirthを year,month,days に分ける
		String year = dateOfBirth.substring(0, 4);
		String month = dateOfBirth.substring(5, 7);
		String days = dateOfBirth.substring(8, 10);

		System.out.println(tel);
		System.out.println(mobilePhone);
%>
<form action="/library4/AddUser" method="post">
	<table>
		<tr>
			<td><div align="right">氏名</div></td>
			<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
			 border-radius: 5px;">必須</div></td>
			<td><input type="text" name="name" class="form1" value="<%= name %>"></td>
			<td><font color="red">
			<%
				String msg1 = (String) request.getAttribute("氏名");
				if(msg1 != null){
					out.println(msg1);
					request.removeAttribute("氏名");
				}
			%></font></td>
		</tr>
		<tr>
			<td><div align="right">フリガナ</div></td>
			<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
			 border-radius: 5px;">必須</div></td>
			<td><input type="text" name="furigana" class="form1" value="<%= firigana %>"></td>
			<td><font color="red">
			<%
				String msg2 = (String) request.getAttribute("フリガナ");
				if(msg2 != null){
					out.println(msg2);
					request.removeAttribute("フリガナ");
				}
			%></font></td>
		</tr>
		<tr>
			<td><div align="right">郵便番号</div></td>
			<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
			 border-radius: 5px;">必須</div></td>
			<td><input type="text" name="zipCode" class="form1" value="<%= zipCode %>"></td>
			<td><font color="red">
			<%
				String msg3 = (String) request.getAttribute("郵便番号");
				if(msg3 != null){
					out.println(msg3);
					request.removeAttribute("郵便番号");
				}
			%></font></td>
		</tr>
		<tr>
			<td><div align="right">住所</div></td>
			<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
			 border-radius: 5px;">必須</div></td>
			<td><input type="text" name="address" class="form1" value="<%= address %>"></td>
			<td><font color="red">
			<%
				String msg4 = (String) request.getAttribute("住所");
				if(msg4 != null){
					out.println(msg4);
					request.removeAttribute("住所");
				}
			%></font></td>
		</tr>
		<tr>
			<td><div align="right">電話番号</div></td>
			<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 75px;
			 border-radius: 5px;">どちらか必須</div></td>
			<td><input type="text" name="tel" class="form1" value="<%= tel %>"></td>
			<td><font color="red">
			<%
				String msg5 = (String) request.getAttribute("電話番号");
				if(msg5 != null){
					out.println(msg5);
					request.removeAttribute("電話番号");
				}
			%></font></td>
		</tr>
		<tr>
			<td><div align="right">携帯番号</div></td>
			<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 75px;
			 border-radius: 5px;">どちらか必須</div></td>
			<td><input type="text" name="mobilePhone" class="form1" value="<%= mobilePhone %>"></td>
		</tr>
		<tr>
			<td><div align="right">メールアドレス</div></td>
			<td width="90"><font color="red"> </font></td>
			<td><input type="text" name="email" class="form1" value="<%= email %>"></td>
		</tr>
		<tr>
			<td><div align="right">生年月日</div></td>
			<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
			 border-radius: 5px;">必須</div></td>
			<td><select name="year">
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
			<select name="month" id="month">
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
			<select name="days">
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
			</select>日</td>
			<td><font color="red">
			<%
				String msg7 = (String) request.getAttribute("生年月日");
				if(msg7 != null){
					out.println(msg7);
					request.removeAttribute("生年月日");
				}
			%></font></td>
		</tr>
		<tr>
			<td style="border-style: none;"><div align="right">性別</div></td>
			<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
			 border-radius: 5px;">必須</div></td>
			<td><input type="radio" name="gender" value="男" >男 <input type="radio" name="gender" value="女">女</td>
			<td><font color="red">
			<%
				String msg8 = (String) request.getAttribute("性別");
				if(msg8 != null){
					out.println(msg8);
					request.removeAttribute("性別");
				}
			%></font></td>
		</tr>
		<tr>
			<td><div align="right">パスワード</div></td>
			<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
			 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
			 border-radius: 5px;">必須</div></td>
			<td><input type="text" name="pass" class="form1" value="<%= pass %>"></td>
			<td><font color="red">
			<%
				String msg9 = (String) request.getAttribute("パスワード");
				if(msg9 != null){
					out.println(msg9);
					request.removeAttribute("パスワード");
				}
			%></font></td>
		</tr>
	</table><br>
<input type="submit" value="登録">
<input type="button" value="キャンセル" onclick="location.href='/library4/AddUserCancel1'"><br>
</form>
<br>
<%
	//nullだったら初入力
	} else if  (user == null){ %>

<form action="/library4/AddUser" method="post">
<table>
	<tr>
		<td><div align="right">氏名 </div></td>
		<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
		 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
		 border-radius: 5px;">必須</div></td>
		<td><input type="text" name="name" class="form1"><td>
	</tr>
	<tr>
		<td><div align="right">フリガナ</div></td>
		<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
		 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
		 border-radius: 5px;">必須</div></td>
		<td><input type="text" name="furigana" class="form1"></td>
	</tr>
	<tr>
		<td><div align="right">郵便番号</div></td>
		<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
		 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
		 border-radius: 5px;">必須</div></td>
		<td><input type="text" name="zipCode" class="form1"></td>
	</tr>
	<tr>
		<td><div align="right">住所</div></td>
		<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
		 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
		 border-radius: 5px;">必須</div></td>
		<td><input type="text" name="address" class="form1"></td>
	</tr>
	<tr>
		<td><div align="right">電話番号</div></td>
		<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
		 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 75px;
		 border-radius: 5px;">どちらか必須</div></td>
		<td><input type="text" name="tel" class="form1"></td>
	</tr>
	<tr>
		<td><div align="right">携帯番号</div></td>
		<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
		 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 75px;
		 border-radius: 5px;">どちらか必須</div></td>
		<td><input type="text" name="mobilePhone" class="form1"></td>
	</tr>
	<tr>
		<td><div align="right">メールアドレス</div></td>
		<td width="90"><font color="red"> </font></td>
		<td><input type="text" name="email" class="form1"></td>
	</tr>
	<tr>
		<td><div align="right">生年月日</div></td>
		<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
		 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
		 border-radius: 5px;">必須</div></td>
		<td><select name="year">
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
		<select name="month" id="month">
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
		<select name="days">
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
		</select>日</td>
	</tr>
	<tr>
		<td style="border-style: none;"><div align="right">性別</div></td>
		<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
		 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
		 border-radius: 5px;">必須</div></td>
		<td><input type="radio" name="gender" value="男" >男 <input type="radio" name="gender" value="女">女</td>
	</tr>
	<tr>
		<td><div align="right">パスワード</div></td>
		<td width="90"><div align="center" style="font-size: 0.7em; border-style: solid ; border-width: 1px;
		 padding: 1px 1px 1px 1px; border-color: red; color: red; background-color: white; width: 30px;
		 border-radius: 5px;">必須</div></td>
		<td><input type="text" name="pass" class="form1"></td>
	</tr>
</table><br>
<input type="submit" value="登録">
<input type="button" value="キャンセル" onclick="location.href='/library4/addUserCancel1'"><br>
</form>
<br>
<% } %>
	<br>
<button class="btn btn3" type="button" onclick="location.href='/library4/index.jsp'">メインメニュー</button><br>
</div>
</body>
</html>