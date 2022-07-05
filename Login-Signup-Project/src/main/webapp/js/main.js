const registerStatus = document.querySelector("#register-status")
const loginStatus = document.querySelector("#login-status")

if(registerStatus?.value == "success"){
	alert("Successfully registered!!")
}
else if(registerStatus?.value  == "failed"){
	alert("Registration Failed")
}


if (loginStatus?.value == "failed"){
	alert("Login Failed, incorrect email or password!!")
}

// Registration input fields
const regName = document.querySelector("#register-form #name")
const regNameSpan = document.querySelector("#register-form .name-error")
const regEmail = document.querySelector("#register-form #email")
const regEmailSpan = document.querySelector("#register-form .email-error")
const regPassword = document.querySelector("#register-form #password")
const regPasswordSpan = document.querySelector("#register-form .password-error")
const regCPassword = document.querySelector("#register-form #confirm-password")
const regCPasswordSpan = document.querySelector("#register-form .cpassword-error")

regCPassword.addEventListener("input",(e) => {
	if(e.target.value !== regPassword.value){
		regCPassword.style.borderColor = "red"
		regCPasswordSpan.innerHTML = "Passwords does not match"	
	}else{
		regCPassword.style.borderColor = "green"
		regCPasswordSpan.innerHTML = "Passwords Matched"
		regCPasswordSpan.style.color = "green"
	}
})

regPassword.addEventListener("input",(e) => {
	if(regCPassword.value !== ""){
		if(e.target.value !== regCPassword.value){
			regPassword.style.borderColor = "red"
			regPasswordSpan.innerHTML = "Passwords does not match"	
			regCPasswordSpan.innerHTML = "Passwords does not match"	
			regCPasswordSpan.style.color = "red"
		}else{
			regPassword.style.borderColor = "green"
			regPasswordSpan.innerHTML = "Passwords Matched"
			regPasswordSpan.style.color = "green"
			regCPasswordSpan.innerHTML = "Passwords Matched"	
			regCPasswordSpan.style.color = "green"
		}
	}
})

// Server side validation

if (registerStatus?.value == "invalidName"){
	regName.style.borderColor = "red"
	regNameSpan.innerHTML = "Invalid Name"
}
if (registerStatus?.value == "invalidEmail"){
	regEmail.style.borderColor = "red"
	regEmailSpan.innerHTML = "Invalid Email"
}
if (registerStatus?.value == "invalidPassword"){
	regPassword.style.borderColor = "red"
	regPasswordSpan.innerHTML = "Invalid Password"
}
if (registerStatus?.value == "invalidSizePassword"){
	regPassword.style.borderColor = "red"
	regPasswordSpan.innerHTML = "Password must be atleast 8 characters long"
}
if (registerStatus?.value == "invalidCPassword"){
	regCPassword.style.borderColor = "red"
	regCPasswordSpan.innerHTML = "Invalid Confirm Password"
}
if (registerStatus?.value == "passwordMismatch"){
	regPassword.style.borderColor = "red"
	regCPassword.style.borderColor = "red"
	regPasswordSpan.innerHTML = "Confirm Password and Password did not match"
	regCPasswordSpan.innerHTML = "Confirm Password and Password did not match"	
}
