function menu_over(e){
	  e.setAttribute("class","nav-item active"); //<li= class
  }
  function menu_out(e){
	  e.setAttribute("class","nav-item");
  }


$(document).ready(function(){
 		$('#loginForm').submit(function(event){
 			//submit이 자동으로 되는 기능을 막기
 			event.preventDefault();
 		
 			
 			var id = $('#id').val(); //document.getElementById("id").value;	
 			var pwd = $('#pwd').val();
 
 		//서버로 post 전송
 		$.post("http://httpbin.org/post",
 				{ "id" : id, "pwd" : pwd},
 				function(data){
 					var myModal = $('#myModal');
 					myModal.modal();
 					myModal.find('.modal-body').text(data.form.id+'님 로그인 되었습니다.');
 				
 				});
 	});
 		
 	});
$(document).ready(function(){
		$('#signForm').submit(function(event){
			//submit이 자동으로 되는 기능을 막기
			event.preventDefault();
		
			//id, pwd를 가져오기
			 
			var name = $('#name').val(); 
		

		//서버로 post 전송
		$.post("http://httpbin.org/post",
				{ "name" : name},
				function(data){
					var myModal = $('#signModal');
					myModal.modal();
					myModal.find('.modal-body').text(data.form.name+'님 회원 가입!!!되었습니다.');
				
				});
	});
		
	});
 	