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
	<title>Sign Up | Auth System</title>
	<link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" href="css/style.css">
	<script src="js/main.js" defer></script>
</head>
<body>

	<input type="hidden" id="register-status" value="<%= request.getAttribute("status") %>" />
	<div class="main">

		<section class="signup">
		<div class="container">
			<h2 class="form-title">Sign up</h2>
				<form method="post" action="Register" class="register-form"
					id="register-form">
					<div class="form-group">
						<label for="name">
							<i class="zmdi zmdi-account material-icons-name"></i>
						</label>
					 	<input type="text" name="name" id="name" placeholder="Your Name" required/>
					 	<span class="name-error"></span>
					</div>
					<div class="form-group">
						<label for="email">
							<i class="zmdi zmdi-email"></i>
						</label> 
						<input type="email" name="email" id="email" placeholder="Your Email" required/>
						<span class="email-error"></span>
					</div>
					<div class="form-group">
						<label for="password">
							<i class="zmdi zmdi-lock"></i>
						</label> 
						<input type="password" name="password" id="password" placeholder="Password" required/>
						<span class="password-error"></span>
					</div>
					<div class="form-group">
						<label for="confirm-password"><i class="zmdi zmdi-lock-outline"></i></label>
						<input type="password" name="confirm-password" id="confirm-password" placeholder="Confirm Password" required/>
						<span class="cpassword-error"></span>
					</div>
					<p>
						<a href="login.jsp" class="signup-image-link">Already a member? Login</a>
					</p>
					<div class="form-group form-button">
						<input type="submit" name="signup" id="signup" class="form-submit" value="Register" />
					</div>
				</form>
			</div>
		</section>
	</div>
</body>
</html>