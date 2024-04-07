<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Article</title>

<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
    crossorigin="anonymous">
</head>
<body>

<%-- 
	<p>
		<span><a href="ListArticles">Back to Articles</a></span>
	</p>
	--%>
	
	<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
      <li class="breadcrumb-item active" aria-current="page">DisplayArticle</li>
  
    <li class="breadcrumb-item"><a href="ListArticles">Article</a></li>
  </ol>
</nav>

<p class="fst-italic">
	<strong> ${entry.title} </strong>
	</p>
	<br>
	<br>

	<p class="fst-italic">${entry.excerpt}</p>
	<br>
	<br>
	<p>${entry.content}</p>
		
		
		
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>