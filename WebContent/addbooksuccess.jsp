<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="NewFile.css">
<title>Insert title here</title>
</head>
<body>
<div class="con">
		<div class="title">
		</div>
		<div>
			<div class="con_1 select">
				<h3><a href="index.html">&nbsp; &nbsp;首&nbsp; &nbsp;&nbsp; &nbsp;页</a></h3><br>
				<h3><a href="addlibrary.jsp">&nbsp; &nbsp;入库登记</a></h3><br>
				<h3><a href="ShowBookServlet">&nbsp; &nbsp;库存列表</a></h3><br>
				<h3><a href="ListBookByPageServlet">&nbsp; &nbsp;分页展示</a></h3>
			</div>
			<div class="text select">
				<h3>${book.getName() } 添加成功</h3>
			</div>
		</div>
	</div>
</body>
</html>