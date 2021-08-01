<%@ include file="/WEB-INF/template/include.jsp"%>

<%@ include file="/WEB-INF/template/header.jsp"%>
<br>
<html>
<head>
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">

<style>
html, body {
	min-height: 100%;
}

body, div, form, input, select, textarea, p {
	padding: 0;
	margin: 0;
	outline: none;
	font-family: Roboto, Arial, sans-serif;
	font-size: 14px;
	color: #666;
	line-height: 22px;
}

h1 {
	margin: 15px 0;
	font-weight: 400;
}

.testbox {
	display: flex;
	justify-content: center;
	align-items: center;
	height: inherit;
	padding: 3px;
}

form {
	width: 100%;
	padding: 20px;
	background: #fff;
	box-shadow: 0 2px 5px #ccc;
}

input, select, textarea {
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input:hover, select:hover, textarea:hover {
	outline: none;
	box-shadow: 0 0 5px 0 #095484;
}

input {
	width: calc(100% - 10px);
	padding: 5px;
}

select {
	width: 100%;
	padding: 7px 0;
	background: transparent;
}

textarea {
	width: calc(100% - 2px);
	paddung: 5px;
}

.item {
	position: relative;
	margin: 10px 0;
}

.item:hover p, .item:hover i {
	color: #095484;
}

input:hover, select:hover, textarea:hover {
	box-shadow: 0 0 5px 0 #095484;
}

.status:hover input {
	box-shadow: none;
}

.status label:hover input {
	box-shadow: 0 0 5px 0 #095484;
}

.status-item input, .status-item span {
	width: auto;
	vertical-align: middle;
}

.status-item input {
	margin: 0;
}

.status-item span {
	margin: 0 20px 0 5px;
}

input[type="date"]::-webkit-inner-spin-button {
	display: none;
}

input[type="time"]::-webkit-inner-spin-button {
	margin: 2px 22px 0 0;
}

.item i, input[type="date"]::-webkit-calendar-picker-indicator {
	position: absolute;
	font-size: 20px;
	color: #a9a9a9;
}

.item i {
	right: 1%;
	top: 30px;
	z-index: 1;
}

[type="date"]::-webkit-calendar-picker-indicator {
	right: 0;
	z-index: 2;
	opacity: 0;
	cursor: pointer;
}

.btn-block {
	margin-top: 20px;
	text-align: center;
}

button {
	width: auto;
	padding: 10px;
	border: none;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	background-color: #095484;
	font-size: 16px;
	color: #fff;
	cursor: pointer;
}

button:hover {
	background-color: #0666a3;
}

@media ( min-width : 568px) {
	.name-item {
		display: flex;
		flex-wrap: wrap;
		justify-content: space-between;
	}
	.name-item input {
		width: calc(50% - 20px);
	}
}
</style>
</head>
<body>
	<div class="testbox">
	
			<h1>Patient_details Form</h1>
			<br>
			<div class="item">
				<p>Name:</p>
				
			</div>
			<br>
			<div class="item status">
				<p>Status:</p>
				
			</div>
			<br>
			<div class="item">
				<p>Patient Issue:</p>
			
			</div>
			<br>
			<div class="item">
				<p>Date of Birth:</p>
				
			</div>
			<br>
			<div class="item">
				<label>Age: </label>
				
			</div>
		
	</div>
</body>
	</html>
	
<%@ include file="/WEB-INF/template/footer.jsp"%>