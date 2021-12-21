<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
	<title>List Categories</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Category Manager</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<input type="button" value="Add Category" onclick="window.location.href='showFormForAdd'; return false;" class="add-button" />
			
			<table>
				<tr>
					<th>Name</th>
					<th>Action</th>
				</tr>
				<c:forEach var="tempCategory" items="${ categories }">
					<c:url var="updateLink" value="/category/showFormForUpdate">
						<c:param name="categoryId" value="${ tempCategory.id }" />
					</c:url>
					<c:url var="deleteLink" value="/category/delete">
						<c:param name="categoryId" value="${ tempCategory.id }" />
					</c:url>
					<tr>
						<td>${ tempCategory.name }</td>
						<td><a href="${ updateLink }">Update</a> | <a href="${ deleteLink }" onclick="if(!(confirm('Are you sure to delete?'))) return false">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		
		</div>
	</div>



	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>