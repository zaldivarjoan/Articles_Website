<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Article</title>


<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
    crossorigin="anonymous">
</head>
<body class="container bg-dark">
<h3 style="color:orange;">Edit Articles</h3>
<form method="post" >

			<div>
			<label class="form-label" style="color:orange;">Category</label>
			</div>

		
						<c:forEach items="${entries}" var="entry">
	
			<div class="w-25"><select class="form-select form-select-sm mb-1" aria-label ="default select example" " name='category'>
					<option value="${entry.id}" selected>${entry.category}</option>
					<option value=Biz&It>BIZ&IT</option>
					<option value=Tech>Tech</option>
					<option value=Science>Science</option>
					<option value=Policy>Policy</option>
					<option value=Cars>Cars</option>
					<option value=Gaming&Culture>Gaming&Culture</option>
			</select></div>

		<div>
		
				<label style="color:orange;">Title</label> </div>
				<div>
		<input type="text" class="form-text w-25 " name="title"  value="${entry.title}">
		
			</div>

			
				<div style="color:orange;">Excerpt</div>
				<div><input type="text" class="form-text w-25 " name="excerpt"  value="${entry.excerpt}">
				</div>
			

			
				<div style="color:orange;">Content</div>
				<div class="w-25"><textarea name="content" rows="6" cols="30"
					>${entry.content }</textarea></div>
			

			
				<button type="submit" class="btn btn-outline-warning">Save</button>
				</c:forEach>
		</form>
		
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>