<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script>
	const search = (value)=>{
		$.get("serch",{value},function(rt){
		$("#hey").html(rt)
		})	
	}
	
		$(document).ready(function(){
			$.get("countries",{},function(rt){
				$("#country").html(rt)
				})
		})
		
		const getState = (cid) =>{
		$.get("states",{cid},function(rt){
			$("#state").html(rt)
		})
		}
		
		const getCities =(sid) =>{
		$.get("cities",{sid},function(rt){
		$("#city").html(rt)
		})	
		}
</script>
</head>
<body>
	<input type="text" placeholder="search here" id="serach" onkeyup="search(value)">
	<select id ="country" onchange="getState(value)">
	</select>
	<select id ="state" onchange="getCities(value)">
	<option>--select State--</option>
	</select>
	<select id ="city">
	<option>--select City--</option>
	</select>
	<div id="hey"></div>
	
</body>
</html>