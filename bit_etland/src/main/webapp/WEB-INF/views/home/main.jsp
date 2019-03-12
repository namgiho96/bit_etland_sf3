<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">

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




 <section id="feature">
    <div class="container">
      <div class="center wow fadeInDown animated"style="visibility: visible; animation-name: fadeInDown;">
        <h2>ONES</h2>
        <p class="lead">가상화폐에 혁신을 보여드리겠습니다<br></p>
      </div>
      </div>
  </section>

      
<script src="${js}oop.js">

</script>

<script>
$('#emp_register').click(function(){
	location.assign('employee.do?cmd=move&page=register');
});

$('#emp_access').click(function(){
	location.assign('employee.do?cmd=move&page=access');
});

$('#cust_join').click(function(){
	location.assign('customer.do?cmd=move&page=signup')
});
$('#cust_login').click(function(){
	location.assign('${ctx}/move/customer/signin')
});

$('#oop_access').click(function(){
	/* encap.main(); */
	/* inherit.main(); */
	test.main();
});

$('algo_access').click(function(){
	
});

</script>








