
<%--
  Created by IntelliJ IDEA.
  User: 79160
  Date: 26.11.2021
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
</head>
<body>
<h1>List product</h1>
<br>
<table>
<%--    <c:forEach items="${products}" var="product">--%>
<%--            <li>  ${products}     </li>--%>
<%--            </c:forEach>--%>

    <c:forEach items="${products}" var="product">
          ${products}
    </c:forEach>

</table>
<br>

<a href="${"/add"}">Add Product</a>

</body>
</html>
