<html>
<body>
<h2>Hello World!</h2>
</body>
	<h1>Login...</h1>
	<h2><%=request.getAttribute("message")!=null?request.getAttribute("message"):"" %></h2>
	<a href="admin">Admin</a> &nbsp;&nbsp;&nbsp;&nbsp;<a href="user">User</a>
	<form action="login" method="post">
		UserID : <input type="text" name="userID"/><br/>
		Password : <input type="text" name="password"/><br/>
		<input type="submit" value="Login"/><br/>
	</form>
</html>
