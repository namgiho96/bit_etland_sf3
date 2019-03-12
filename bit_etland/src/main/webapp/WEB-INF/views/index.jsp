<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
 <!--
 	@Author : 남기호 (namgiho96@gmail.com)
 	@Date : 2019. 3. 12. 오후 4:48:21
	@File Name : *.jsp
	@Desc:
  -->
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<%-- 	<link rel="stylesheet" href="${css}/reset.css "/>  --%>
<%-- 	<link rel="stylesheet" href="${css}/index.css"/>
	<link rel="stylesheet" href="${css}/home/intro.css"/> --%>
  	<link rel="stylesheet" href="${css}/customer/animate.min.css "/>
	<link rel="stylesheet" href="${css}/customer/bootstrap-theme.css "/>
	<link rel="stylesheet" href="${css}/customer/bootstrap-theme.min.css "/>
	<link rel="stylesheet" href="${css}/customer/bootstrap.css"/>
	<link rel="stylesheet" href="${css}/customer/font-awesome.css "/>
	<link rel="stylesheet" href="${css}/customer/font-awesome.min.css "/> 
	<link rel="stylesheet" href="${css}/customer/prettyPhoto.css "/> 
	<link rel="stylesheet" href="${css}/customer/responsive.css "/> 
	<link rel="stylesheet" href="${css}/customer/style.css "/>  
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> 
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<script src="${js}/app.js"></script>
</head>
<body>
	<div class="grid-container">
<div id="top">
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
</div>
			
<div  id="main">
<div class="slider">
    <div class="container">
      <div id="about-slider">
        <div id="carousel-slider" class="carousel slide" data-ride="carousel">
          <!-- Indicators -->
          <ol class="carousel-indicators visible-xs">
            <li data-target="#carousel-slider" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-slider" data-slide-to="1"></li>
            <li data-target="#carousel-slider" data-slide-to="2"></li>
          </ol>

          <div class="carousel-inner">
            <div class="item active">
              <img src="${img}/slider_one.jpg" class="img-responsive" alt="">
            </div>
            <div class="item">
              <img src="${img}/slider_one.jpg" class="img-responsive" alt="">
            </div>
            <div class="item">
              <img src="${img}/slider_one.jpg" class="img-responsive" alt="">
            </div>
          </div>

	          <a class="left carousel-control hidden-xs" href="#carousel-slider" data-slide="prev">
							<i class="fa fa-angle-left"></i>
			  </a>

	          <a class=" right carousel-control hidden-xs" href="#carousel-slider" data-slide="next">
							<i class="fa fa-angle-right"></i>
			  </a>
        </div>
      </div>
    </div>
  </div>
</div>
  
<div id="bottom">
 <section id="feature">
    <div class="container">
      <div class="center wow fadeInDown animated"style="visibility: visible; animation-name: fadeInDown;">
        <h2>ONES</h2>
        <p class="lead">가상화폐에 혁신을 보여드리겠습니다<br></p>
      </div>
      </div>
  </section>						    		
<div class="midnight-blue" id="footer">
    <div class="container">
      <div class="row">
        <div class="col-sm-6">
          © ONES
          <div class="credits">
          </div>
        </div>
      </div>
    </div>
	   </div> 	
	</div> 
</div>
</body>

<script>
app.context.init('${ctx}')
</script>
</html>