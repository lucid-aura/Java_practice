<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p id="demo"> </p>

<script type="text/javascript">
let jsonData = [
	{
		"title":"탈무드",
		"data":"2011.05.12",
		"price":5400
	},
	{
		"title":"세계 경제의 흐름",
		"data":"2017.03.27",
		"price":6200
	},
	{
		"title":"머신러닝과 딥러닝",
		"data":"2019.04.25",
		"price":32000
	},
];

document.getElementById("demo").innerHTML = jsonData[0]["data"];
</script>
</body>
</html>