<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>

</head>
<body> 
<form name="productsForm" action="${pageContext.request.contextPath }/products/queryProducts.action" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td>
商品名称：<input name="productsCustom.name" />
商品类型：
<select name="productstype">
	<c:forEach items="${productstype }" var="productstype">
		<option value="${productstype.key }">${productstype.value }</option>		
	</c:forEach>
</select>

</td>
<td><input type="button" value="查询" onclick="queryProducts()"/>
<input type="button" value="批量删除" onclick="deleteProducts()"/>
</td>
</tr>
</table>
商品列表：
<table width="100%" border=1>
<tr>
	<td>选择</td>
	<td>商品名称</td>
	<td>供应商id</td>
	<td>商品种类id</td>
	<td>商品价格</td>
	<td>描述</td>
	<td>操作</td>
</tr>
<c:forEach items="${productsList }" var="products">
<tr>	
	<td><input type="checkbox" name="productid" value="${products.productid}"/></td>
	<td>${products.productname }</td>
	<td>${products.supplierid }</td>
	<!--  
	<td><fmt:formatDate value="${Productss.categoryid}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	-->
	<td>${products.categoryid }</td>
	<td>${products.unitprice }</td>
	<td>${products.discontinued }</td>
	
	<td><a href="${pageContext.request.contextPath }/products/editProducts.action?id=${products.productid}">修改</a></td>

</tr>
</c:forEach>

</table>
</form>
</body>

</html>