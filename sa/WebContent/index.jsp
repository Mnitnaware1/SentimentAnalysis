<!DOCTYPE HTML>
<html>
<head><%@include file="header.jsp"%></head>
<body>
	<!--start-home-->
	<div class="top_bg" id="home">
		<div class="container">
			<div class="header_top">
				<div class="top_right">
					<ul>
						<li><a href="#">help</a></li>
						<li><a href="#">Contact</a></li>
						<li><a href="#">Delivery information</a></li>
					</ul>
				</div>
				<div class="top_left">
					<h6>
						<span></span> Call us : 032 2352 782
					</h6>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--header-->
	<div class="header_bg">
		<div class="container">
			<%@include file="topnav.jsp"%>
		</div>
	</div>
	<!--start-content-->

	<%
            String pagename = request.getParameter("pagename") == null ? "" : request.getParameter("pagename");
        %>
	<% if(pagename.equals("productlist")){ %>
	<%@include file="productlist.jsp"%>
	<% }%>
	<% if(pagename.equals("account")){ %>
	<%@include file="account.jsp"%>
	<% }%>
	<% if(pagename.equals("detailpage")){ %>
	<%@include file="detailpage.jsp"%>
	<% }%>
	<% if(pagename.length() == 0){ %>
	<%@include file="home.jsp"%>
	<% }%>
	<!--include page here-->

	<!--include page here-->


	<!--//latest-->

	<!--start-bottom-->
	<!--start-image-cursuals-->
	<div class="scroll-slider">
		<div class="container">
			<div class="nbs-flexisel-container">
				<div class="nbs-flexisel-inner">
					<ul class="flexiselDemo3 nbs-flexisel-ul"
						style="left: -253.6px; display: block;">
						<li onclick="location.href = '#';" class="nbs-flexisel-item"
							style="width: 253.6px;"><img src="images/c3.png" alt="" /></li>
						<li onclick="location.href = '#';" class="nbs-flexisel-item"
							style="width: 253.6px;"><img src="images/c4.png" alt="" /></li>
						<li onclick="location.href = '#';" class="nbs-flexisel-item"
							style="width: 253.6px;"><img src="images/c1.png" alt="" /></li>
						<li onclick="location.href = '#';" class="nbs-flexisel-item"
							style="width: 253.6px;"><img src="images/c2.png" alt="" /></li>
						<li onclick="location.href = '#';" class="nbs-flexisel-item"
							style="width: 253.6px;"><img src="images/c3.png" alt="" /></li>
						<li onclick="location.href = '#';" class="nbs-flexisel-item"
							style="width: 253.6px;"><img src="images/c4.png" alt="" /></li>
						<li onclick="location.href = '#';" class="nbs-flexisel-item"
							style="width: 253.6px;"><img src="images/c1.png" alt="" /></li>
						<li onclick="location.href = '#';" class="nbs-flexisel-item"
							style="width: 253.6px;"><img src="images/c2.png" alt="" /></li>
					</ul>
					<div class="nbs-flexisel-nav-left" style="top: 21.5px;"></div>
					<div class="nbs-flexisel-nav-right" style="top: 21.5px;"></div>
				</div>
			</div>
			<div class="clearfix"></div>
			<!--start-image-->
			<script type="text/javascript" src="js/jquery.flexisel.js"></script>
			<!--//end-->
			<script type="text/javascript">
                    $(window).load(function() {
                        $(".flexiselDemo3").flexisel({
                            visibleItems: 5,
                            animationSpeed: 1000,
                            autoPlay: true,
                            autoPlaySpeed: 3000,
                            pauseOnHover: true,
                            enableResponsiveBreakpoints: true,
                            responsiveBreakpoints: {
                                portrait: {
                                    changePoint: 480,
                                    visibleItems: 2
                                },
                                landscape: {
                                    changePoint: 640,
                                    visibleItems: 3
                                },
                                tablet: {
                                    changePoint: 768,
                                    visibleItems: 3
                                }
                            }
                        });
                    });
                </script>
			<!---->
		</div>
	</div>
	<!--//end-bottom-->
	<!--start-footer-->
	<div class="footer">
		<div class="container">
			<div class="footer-top">
				<div class="col-md-2 footer-left">
					<h3>About Us</h3>
				</div>
				<div class="col-md-2 footer-left">
					<h3>Your Account</h3>
				</div>
				<div class="col-md-2 footer-left">
					<h3>Shopping</h3>
				</div>
				<div class="col-md-2 footer-left ">
					<h3>Categories</h3>
				</div>
				<div class="col-md-2 footer-left lost">
					<h3>Life Style</h3>
				</div>
				<div class="clearfix"></div>
			</div>

		</div>
	</div>
	<ul class="socials">
		<li><a class="soc1" href="#"></a></li>
		<li><a class="soc2" href="#"></a></li>
		<li><a class="soc3" href="#"></a></li>
	</ul>
	<!--/start-copyright-->
	<div class="copy">
		<div class="container">
			<p>&copy;</p>
		</div>
	</div>
	<script type="text/javascript">
            $(document).ready(function() {
                $().UItoTop({easingType: 'easeOutQuart'});

            });
        </script>
	<a href="#home" id="toTop" class="scroll" style="display: block;">
		<span id="toTopHover" style="opacity: 1;"> </span>
	</a>
</body>
</html>