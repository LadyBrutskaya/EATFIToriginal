function validForm(){
	/*for(var i = 0; i < form.elements.length - 1; i++){
		var data = form.elements[i].value;
		if(data != "" || data != null || data != undefined){
			window.location = "http://google.com";
		} else {
			alert("Не заполнено поле " + " !");
			break;
		}
	}*/
}


function trimString(val){
	var trimResult = $.trim(val);
	if(trimResult.length != val){
		//to do в поле .... введены недопустимые символы
	}
}