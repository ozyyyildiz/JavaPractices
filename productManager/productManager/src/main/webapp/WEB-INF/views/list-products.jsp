<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
	<title>Product Manager</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Product List</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<input type="button" value="Add Product" onclick="window.location.href='showFormForAdd'; return false " class="add-button" />
			
			<table>
				<tr>
					<th>Name</th>
					<th>Price</th>
					<th>Stock</th>
					<th>Category</th>
					<th>Action</th>
				</tr>
				<c:forEach var="tempProduct" items="${products}">
					<c:url var="updateLink" value="/product/showFormForUpdate">
						<c:param name="productId" value="${ tempProduct.id }" />
					</c:url>
					<c:url var="deleteLink" value="/product/delete">
						<c:param name="productId" value="${ tempProduct.id }" />
					</c:url>
					<tr>
						<td>${ tempProduct.name }</td>
						<td>${ tempProduct.price }</td>
						<td>${ tempProduct.stock }</td>
						<td>${ tempProduct.category.name }</td>
						<td><a href="${ updateLink }" >Update</a> | <a href="${ deleteLink }" onclick="if(!(confirm('Are you sure to delete?'))) return false" >Delete</a></td>
					</tr>
				
				</c:forEach>
			
			
			</table>
		</div>
	</div>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>