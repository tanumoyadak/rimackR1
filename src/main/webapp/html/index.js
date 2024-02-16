const sign_in_btn = document.querySelector("#sign-in-btn");
const sign_up_btn = document.querySelector("#sign-up-btn");
const container = document.querySelector(".container");

sign_up_btn.addEventListener("click", () => {
  container.classList.add("sign-up-mode");
});

sign_in_btn.addEventListener("click", () => {
  container.classList.remove("sign-up-mode");
});

	$("#signin").submit(function () { 
		alert("Hello! I am an ale");
		$("#loginusername").attr("placeholder", "Search for a title or");
		alert("ok!");/*
		$.post("data.txt", { name: "GFG" }, function (data, status) { 
			document.getElementById("loginpassword").placeholder = data; 
			document.getElementById("loginusername").placeholder = "Tanumoy"; 
		}); 
		*/
	}); 
  