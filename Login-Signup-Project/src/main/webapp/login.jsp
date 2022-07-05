<%
	if(session.getAttribute("name") != null){
		response.sendRedirect("index.jsp");
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Login | Auth System</title>
	<link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" href="css/style.css">
	<script src="js/main.js" defer></script>
</head>
<body>

	<input type="hidden" id="login-status" value="<%= request.getAttribute("status") %>" />
	<div class="main">
		<section class="sign-in">
			<div class="container">
				<h2 class="form-title">Login</h2>
				<form method="post" action="login" class="register-form" id="login-form">
					<div class="form-group">
						<label for="username"><i class="zmdi zmdi-account material-icons-name"></i></label> 
						<input type="email" name="email" id="username" placeholder="Enter Email" required/>
					</div>
					<div class="form-group">
						<label for="password"><i class="zmdi zmdi-lock"></i></label> 
						<input type="password" name="password" id="password" placeholder="Enter Password" required/>
					</div>
					<p>	
						<a href="registration.jsp" class="signup-image-link">Don't have an account? Signup</a>
					</p>
					<div class="form-group form-button">
						<input type="submit" name="signin" id="signin" class="form-submit" value="Log in" />
					</div>
				</form>
			</div>
		</section>
	</div>
</body>
</html>