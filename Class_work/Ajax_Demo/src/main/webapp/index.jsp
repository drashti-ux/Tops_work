<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script>
	function clickme(){
		var data = document.getElementById("name").value
		$.get("ser",{data},function(rt){
		alert(rt)
	})
	}
</script>
</head>
<body>
	<input type="text" name="name" id ="name">
	<button onclick="clickme()">click me</button>
</body>
</html>