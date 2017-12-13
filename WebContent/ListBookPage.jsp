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
				<center>
				<table>
					<tr>
						<td>书号</td>
						<td>书名</td>
						<td>作者</td>
						<td>折扣</td>
						<td>价格</td>
						<td>数量</td>
						<td>管理</td>
						<td>详情</td>
					</tr>
					<c:if test="${not empty pb.list }">
						<c:forEach items="${pb.list }" var="book">
							<tr>
								<td>${book.getNo() }</td>
								<td>${book.getName() }</td>
								<td>${book.getAuthor() }</td>
								<td>${book.getCount() }</td>
								<td>${book.getPrice() }</td>
								<td>${book.getNum() }</td>
								<td><a href="DeleteBookServlet?no=${book.getNo() }">删除</a></td>
								<td><a href="PlayBook?no=${book.getNo() }">介绍</a></td>
							</tr>
						</c:forEach>
					</c:if>
				</table>
					<a href="ListBookByPageServlet?currentNum=1">首页</a>&nbsp;&nbsp;
					
					<c:if test="${pb.currentNum == 1 }">
						上一页&nbsp;&nbsp;
					</c:if>
					<c:if test="${pb.currentNum != 1 }">
						<a href="ListBookByPageServlet?currentNum=${pb.currentNum-1 }">上一页</a>&nbsp;&nbsp;
					</c:if>
					
					<c:if test="${pb.currentNum == pb.totalPage }">
						下一页&nbsp;&nbsp;
					</c:if>
					<c:if test="${pb.currentNum != pb.totalPage }">
						<a href="ListBookByPageServlet?currentNum=${pb.currentNum+1 }">下一页</a>&nbsp;&nbsp;
					</c:if>
					
					<a href="ListBookByPageServlet?currentNum=${pb.totalPage }">尾页</a><br/><br/>
				</center>
			</div>
		</div>
	</div>
</body>
</html>