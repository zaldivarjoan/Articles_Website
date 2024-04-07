<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create User</title>
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
    crossorigin="anonymous">
</head>
<body class = "container bg-dark">
<div class = "text-white">
<form  action = "DisplayLogin" method = "post">
<h3>Create Account</h3>
<p>Name:<input type = "text" name = "name"></p>
<p>Username:<input type ="text" name = "username"></p>
<p>Password:<input type = "password" name = "password"></p>

<div class="w-25"><select class="form-select form-select-sm mb-1" aria-label ="default select example" " name='role'>
					<option value=Author>Author</option>
					<option value=Editor>Editor</option>

			</select></div>

<button> Create </button>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</div>
</body>
</html>