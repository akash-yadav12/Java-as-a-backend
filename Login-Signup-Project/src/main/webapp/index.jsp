<%
	if(session.getAttribute("name") == null){
		response.sendRedirect("login.jsp");
	}
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Dashboard | Auth System</title>
<link rel="stylesheet" href="css/style.css">
</head>
<style>
body{
overflow: hidden;}
	.dashboard {
	width: 100vw;
	height:100vh;
	display:grid;
	place-content: center;}
	.dashboard p{
		text-align: center;
	}
	.dashboard p a{
		text-decoration: none;
		color:#fff;
		font-size: 18px;
		font-weight: 700;
		text-transform: uppercase;
		background: #333;
		border-radius: 4px;
		padding: 0.5rem 1rem;
	}
</style>
<body>
	<div class="dashboard">
		<h1>Welcome, <%= session.getAttribute("name") %></h1>
		<p><a href="logout">Logout</a></p>
	</div>
</body>
</html>
