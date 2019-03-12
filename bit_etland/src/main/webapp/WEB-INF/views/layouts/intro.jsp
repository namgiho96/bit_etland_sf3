<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

 <!--
 	@Author : 남기호 (namgiho96@gmail.com)
 	@Date : 2019. 3. 12. 오전 9:53:16
	@File Name : intro.jsp
	@Desc: 인트로 템플릿 페이지 .로그인 ,회원가입 화면
  -->
<!DOCTYPE html>
<html>
<jsp:include page="common.jsp"></jsp:include>
	<body>
		<div id="wrapper" class="grid-container container-fluid">
			<div class="grid-item" id="header">
				<tiles:insertAttribute name="top" />
			</div>
		          
		      
		      <div>
		      	 <tiles:insertAttribute name="content" />
		      </div>
		       
		     
		    <div class="grid-item" id="footer">
	  			<tiles:insertAttribute name="bottom" />
	    	</div>   	
	    </div> 
	</body>
</html>

