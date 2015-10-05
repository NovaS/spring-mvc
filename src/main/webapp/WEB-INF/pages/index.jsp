<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html">
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href=<c:url value="/css/bootstrap.min.css"/> rel="stylesheet" />
	<title>Spring MVC</title>
</head>
<body>
	<div class="jumbotron">
		<div class="container">
			<strong>Message: ${message}</strong>
		</div>
	</div>
	<script src=<c:url value="/js/bootstrap.min.js"/>></script>
</body>
</html>