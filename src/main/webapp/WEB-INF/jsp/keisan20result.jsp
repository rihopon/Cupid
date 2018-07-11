<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RESULT</title>
</head>
<body>
<h1>今回の結果は・・・</h1>
<h1>20問中<%= request.getAttribute("num") %>問正解です。</h1>
<a href="/FirstServlet">メニューへ</a>
</body>
</html>