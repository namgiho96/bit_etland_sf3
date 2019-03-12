<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    


<jsp:include page="../layouts/common.jsp"></jsp:include>
<nav class="navbar navbar-fixed-top" role="banner">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
          <a class="navbar-brand" href="index.html">ONES.</a>
        </div>
        <div class="collapse navbar-collapse navbar-right">
          <ul class="nav navbar-nav">
            <li class="active"><a href="index.html">Home</a></li>
            <li><a href="about-us.html">사원등록</a></li>
            <li><a href="services.html">접속승인</a></li>
            <li><a href="portfolio.html">관리자</a></li>
            <li><a id="cust_login">로그인</a></li>
            <li><a href="contact-us.html">회원가입</a></li>
          </ul>
        </div>
      </div>
    </nav>

<script>
$('#cust_login').click(function(){
	location.assign('${ctx}/move/customer/signin')
});
</script>

