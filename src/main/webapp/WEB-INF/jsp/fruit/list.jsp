<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<body>

	<h1>Fruit Market</h1>
	
	<c:forEach items="${fruitList}" var="fruit">
		<p>
			${fruit.name}: $${fruit.price}
		</p>
	</c:forEach>

</body>
</html>