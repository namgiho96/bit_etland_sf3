<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
	
<jsp:include page="../layouts/common.jsp"></jsp:include>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
    <form>
      <input type="text" id="login" class="fadeIn second" name="login" placeholder="login">
      <input type="text" id="password" class="fadeIn third" name="login" placeholder="password">
      <input type="submit" class="fadeIn fourth" id="confirm_btn" value="Log In">
    </form>
  </div>
</div>
</div>

<script>
$('#confirm_btn').click(function(){
	var empno = $('#custmerID').val();
	var name = $('#password').val();
	$('#form')
	.attr('method','POST')
	.attr('action','${ctx}/customer/customer_detail')
	.submit();
});
</script>
