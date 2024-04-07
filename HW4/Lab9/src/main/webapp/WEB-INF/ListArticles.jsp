<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Articles</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

</head>


<body class="container bg-dark">
	<div class="p-1 mb-2 text-white">
		<h3>Articles</h3>
		<%-- 
	<p>
		<a href="AddArticle">New Article</a>
	<p>
	--%>
		<table style="color: orange;" class="table table-dark ">


			<nav aria-label="breadcrumb">
				<ol class="breadcrumb">
					<li class="breadcrumb-item active" aria-current="page">Articles</li>

					<li class="breadcrumb-item"><a href="AddArticle">AddArticle</a></li>
				</ol>
			</nav>

			<thead>
				<tr>
					<th>Article</th>

					<th>Category</th>
					<th>submitted</th>
					<th>Published</th>
					<th>Operations</th>
				</tr>
			</thead>
			<c:forEach items="${entries}" var="entry">

				<tbody>
					<tr>
						<td style="color: orange;"><a
							href="DisplayArticle?id=${entry.id}">${entry.title}</a> <br>
							${entry.excerpt}</td>
						<td style="color: orange;">${entry.category }</td>
						<td style="color: orange;">${entry.timeSubmitted}</td>

						<td>
							
							<style>
							.navbar-nav > .active > a {
							color: orange;
							}
							</style>
							<c:if test="${entry.getDatePublished() == null }">
							<ul class="navbar-nav">
							<li class = "nav-item active">
							<a class ="nav-link"href = "PublishArticle?id=${entry.id}"> Publish</a>
							
							</c:if> <c:if test="${entry.getDatePublished() != null }">
							<fmt:formatDate pattern = "MM-dd-yyyy HH:mm" value="${entry.getDatePublished()}" type="date" />
						
						
							</c:if>
							
						</td>




						<td><a href="EditArticle?id=${entry.id}">Edit</a></td>
					</tr>
			</c:forEach>
			</tbody>
			


		</table>
		<a href = "DisplayLogin">Sign out</a>

		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
			crossorigin="anonymous"></script>
	</div>
</body>

</html>