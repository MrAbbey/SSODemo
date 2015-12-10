<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'register.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>
	<body>
		这是一个注册业务!
		<form action="RegServlet" method="post">

			<table cellpadding="0" cellspacing="0" border="0">
				<tr>
					<td>
						用户名：
					</td>
					<td>
						<input name="username" class="input_text3" size="18" value="" type="text" />
						<b>*</b>
					</td>
				</tr>

				<tr>
					<td>
						密码：
					</td>
					<td>

						<input name="password" type="password" />
						<b>*</b>

					</td>
				</tr>
				<tr>
					<td class="key">
						确认密码：
					</td>
					<td>
						<input name="password2" type="password" />
						<b>*</b>
					</td>
				</tr>

				<tr>
					<td class="key"></td>
					<td>
						<input name="submit1" size="18" type="submit" />
					</td>
				</tr>

			</table>
		</form>
	</body>
</html>
