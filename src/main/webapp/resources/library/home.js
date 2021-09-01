$(function() {
	$("#login").click(function() {
		$.ajax({
		type:"Post",
		url : "login",
		data : {
			id:$('#id').val(),
			pw:$('#pw').val()
		},
		success : function(result) {
			if(result.loginCheck == 'T') {
				alert("Login Success");	
			} 
			else if(result.loginCheck == 'idError') {
				alert("Don't exist ID'");
			}
			else {
				alert("Login Fail");
			}
			location.href = 'home';
		},
		error : function() {
			alert("Login Error");
		}
		})
	});
	
	$("#join").click(function() {
		var formData = new FormData(document.getElementById('joinform'));
		$.ajax({
		type:"Post",
		url : "join",
		data : {
			formData
		},
		success : function(result) {
			if(result.joinCheck == "T") {
				alert("Join Success");			
			} 
			else {
				alert("Join Fail");
			}
			location.href = 'loginf';
		},
		error : function() {
			alert("Join Error");
		}
		})
	});
})

