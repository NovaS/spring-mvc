<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html">
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<spring:url value="/static/css/bootstrap.min.css" var="css" />
	<link href="${css}" rel="stylesheet" />
	<title>Spring MVC</title>
</head>
<body>
	<div class="jumbotron">
		<div class="container">
			<strong>Message: ${message}</strong>
		</div>
	</div>
	<spring:url value="/static/js/bootstrap.min.js" var="js" />
	<script src="${js}"></script>
</body>
</html>