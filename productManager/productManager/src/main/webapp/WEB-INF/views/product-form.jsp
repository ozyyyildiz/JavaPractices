<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
	<title>Save Product</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Product Manager</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Save Customer</h3>
		
		<form:form action="save" modelAttribute="product" method="POST">
			<form:hidden path="id"/>
			<table>
				<tbody>
					<tr>
						<td><label>Name: </label></td>
						<td><form:input path="name"/></td>
					</tr>
					<tr>
						<td><label>Price: </label></td>
						<td><form:input path="price"/></td>
					</tr>
					<tr>
						<td><label>Stock: </label></td>
						<td><form:input path="stock"/></td>
					</tr>
					<tr>
						<td><label>Category: </label></td>
						<td>
							<form:select path="category">
								<c:forEach var="tempCategory" items="${ categories }">
									<option value="${ tempCategory.name }">${ tempCategory.name }</option>
								</c:forEach>
							</form:select>
						</td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		</form:form>
		<div style="clear; both;"></div>
		<p>
			<a href="${ pageContext.request.contextPath }/product/list">Back to List</a>
		</p>
	</div>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>