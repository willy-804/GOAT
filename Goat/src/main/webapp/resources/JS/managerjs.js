/**
 * 
 */

$(document).ready(function(){
	
	// 검색버튼을 클릭하면
	$(".searchbtn").on("click",function(){
		
		alert("aaa");
		
		// pageNum에 1을 초기화
		$("input[name='pageNum']").val("1");
		
		// form태그를 submit
		$("#searchForm").submit();
	})
	
})