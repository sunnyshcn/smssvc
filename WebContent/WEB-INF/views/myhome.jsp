<%@ page language="java" trimDirectiveWhitespaces="true" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="layout" content="main" />
	<title>Homepage</title>
</head>
<body>
welcome! @ <c:out value='${timestr}'/>
</body>
</html>