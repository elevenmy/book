<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<div class="text select" style="line-height: 23px">
				<form method="get" action="AddBookServlet">
					书名：<input type="text" name="name" value=""><br><br>
					类别：<input type="radio" name="" value="">科学
					<input type="radio" name="" value="">教育
					<input type="radio" name="" value="">文学
					<input type="radio" name="" value="">生活<br><br>
					作者：<input type="text" name="author" value=""><br><br>
					折扣：<input type="radio" name="count" value="1">全价
					<input type="radio" name="count" value="0.9">9折
					<input type="radio" name="count" value="0.8">8折
					<input type="radio" name="count" value="0.7">7折
					<input type="radio" name="count" value="0.6">6折<br><br>
					价格：<input type="text" name="price" value=""><br><br>
					数量：<input type="text" name="num" value=""><br><br>
					简介：<textarea name="play" id="" cols="30" rows="3"></textarea><br><br>
					<input class="zhuce" type="submit" value="登记">
					<input class="quxiao" type="button" value="取消" onclick="javascript:history.back(-1)">
				</form>
			</div>
		</div>
	</div>
</body>
</html>