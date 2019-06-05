/***
 *  获取当前的日期
 */ 
function nowDate(){
	var date =new Date();
	
	var y=date.getFullYear();
	var m=date.getMonth()+1;
	var d=date.getDate();
	
	var today=y+"-"+m+"-"+d;
	
	return today;
}
