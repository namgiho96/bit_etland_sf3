<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${css}/employee/access.css" />
<div class="grid-item" id="side_menu">
	<h1><font style="font-size: 30px">회원 접속</font></h1>
</div>
<div class="grid-item" id="content">
<form id="form" name="form" >
	<div class="grid-container">
	    <div class="grid-item" id="item_1">ID :</div>
	    <div class="grid-item" id="item_2"><input type="text" id="customerID" name="customerID" value="hoho"></div>
	    <div class="grid-item" id="item_3">PASSWORD :</div>
	    <div class="grid-item" id="item_4"><input type="text" id=password name="password" value="1234"></div>
	    
	    <div class="grid-item" id="item_11"><input type="submit" id="confirm_btn" value='확 인'></div>
	    <div class="grid-item" id="item_12"><input type="reset" id="cancel_btn" value='취 소'> </div>
	</div>
</form>
</div>
<script>
$('#confirm_btn').click(function(){
	var empno = $('#custmerID').val();
	var name = $('#password').val();
	$('#form')
	.attr('method','POST')
	.attr('action','${ctx}/customer/signin')
	.submit();
});
</script>
