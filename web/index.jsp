<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
  <jsp:include page="head.jsp"/>
</head>
<body>
<body id="page-top" class="index">
<div id="skipnav"><a href="#maincontent">Skip to main content</a></div>

<!-- Navigation -->
<nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header page-scroll">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
      </button>
      <a class="navbar-brand" href="#page-top">Amarjit Datta</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav navbar-right">
        <li class="hidden">
          <a href="#page-top"></a>
        </li>
        <li class="page-scroll">
          <a href="#home">Home</a>
        </li>
        <li class="page-scroll">
          <a href="#about">About Me</a>
        </li>
        <li class="page-scroll">
          <a href="#blog">Blog</a>
        </li>
        <li class="page-scroll">
          <a href="#login">Login</a>
        </li>
        <li class="page-scroll">
          <a href="#registration">Registration</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<!-- Header -->
<header>
  <div class="container" id="maincontent" tabindex="-1">
    <div class="row">
      <div class="col-lg-12">
        <img class="img-responsive" src="static/img/profile.png" alt="">
        <div class="intro-text">
          <h1 class="name">Welcome to my website!</h1>
          <hr class="star-light">
          <span class="skills">My name is Amarjit Datta. This is my website. In this website, I will try multiple interesting webdevelopment features.</span>
        </div>
      </div>
    </div>
  </div>
</header>

<!-- Portfolio Grid Section -->
<section id="home">
  <div class="container">
    <div class="row">
      <div class="col-lg-12 text-center">
        <h2>Home</h2>
        <hr class="star-primary">
      </div>
    </div>
    <div class="row">
      <div class="col-sm-4 portfolio-item">
        <a href="#portfolioModal1" class="portfolio-link" data-toggle="modal">
          <div class="caption">
            <div class="caption-content">
              <i class="fa fa-search-plus fa-3x"></i>
            </div>
          </div>
          <img src="static/img/portfolio/cabin.png" class="img-responsive" alt="Cabin">
        </a>
      </div>
      <div class="col-sm-4 portfolio-item">
        <a href="#portfolioModal2" class="portfolio-link" data-toggle="modal">
          <div class="caption">
            <div class="caption-content">
              <i class="fa fa-search-plus fa-3x"></i>
            </div>
          </div>
          <img src="static/img/portfolio/cake.png" class="img-responsive" alt="Slice of cake">
        </a>
      </div>
      <div class="col-sm-4 portfolio-item">
        <a href="#portfolioModal3" class="portfolio-link" data-toggle="modal">
          <div class="caption">
            <div class="caption-content">
              <i class="fa fa-search-plus fa-3x"></i>
            </div>
          </div>
          <img src="static/img/portfolio/circus.png" class="img-responsive" alt="Circus tent">
        </a>
      </div>
      <div class="col-sm-4 portfolio-item">
        <a href="#portfolioModal4" class="portfolio-link" data-toggle="modal">
          <div class="caption">
            <div class="caption-content">
              <i class="fa fa-search-plus fa-3x"></i>
            </div>
          </div>
          <img src="static/img/portfolio/game.png" class="img-responsive" alt="Game controller">
        </a>
      </div>
      <div class="col-sm-4 portfolio-item">
        <a href="#portfolioModal5" class="portfolio-link" data-toggle="modal">
          <div class="caption">
            <div class="caption-content">
              <i class="fa fa-search-plus fa-3x"></i>
            </div>
          </div>
          <img src="static/img/portfolio/safe.png" class="img-responsive" alt="Safe">
        </a>
      </div>
      <div class="col-sm-4 portfolio-item">
        <a href="#portfolioModal6" class="portfolio-link" data-toggle="modal">
          <div class="caption">
            <div class="caption-content">
              <i class="fa fa-search-plus fa-3x"></i>
            </div>
          </div>
          <img src="static/img/portfolio/submarine.png" class="img-responsive" alt="Submarine">
        </a>
      </div>
    </div>
  </div>
</section>

<!-- About Section -->
<section class="success" id="about">
  <div class="container">
    <div class="row">
      <div class="col-lg-12 text-center">
        <h2>About</h2>
        <hr class="star-light">
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-lg-offset-2">
        <p>Freelancer is a free bootstrap theme created by Start Bootstrap. The download includes the complete source files including HTML, CSS, and JavaScript as well as optional LESS stylesheets for easy customization.</p>
      </div>
      <div class="col-lg-4">
        <p>Whether you're a student looking to showcase your work, a professional looking to attract clients, or a graphic artist looking to share your projects, this template is the perfect starting point!</p>
      </div>
      <div class="col-lg-8 col-lg-offset-2 text-center">
        <a href="#" class="btn btn-lg btn-outline">
          <i class="fa fa-download"></i> Download Theme
        </a>
      </div>
    </div>
  </div>
</section>

<!-- Blog Section -->
<section class="success" id="blog">
  <div class="container">
    <div class="row">
      <div class="col-lg-12 text-center">
        <h2>About</h2>
        <hr class="star-light">
      </div>
    </div>
    <div class="row">
      <div class="col-lg-4 col-lg-offset-2">
        <p>Freelancer is a free bootstrap theme created by Start Bootstrap. The download includes the complete source files including HTML, CSS, and JavaScript as well as optional LESS stylesheets for easy customization.</p>
      </div>
      <div class="col-lg-4">
        <p>Whether you're a student looking to showcase your work, a professional looking to attract clients, or a graphic artist looking to share your projects, this template is the perfect starting point!</p>
      </div>
      <div class="col-lg-8 col-lg-offset-2 text-center">
        <a href="#" class="btn btn-lg btn-outline">
          <i class="fa fa-download"></i> Download Theme
        </a>
      </div>
    </div>
  </div>
</section>

<!-- Login Section -->
<section class="login" id="login">
  <div class="container">
    <div class="row">
      <div class="col-lg-12 text-center">
        <h2>Log in</h2>
        <hr class="star-primary">
      </div>
    </div>
    <div class="row">
      <div class="col-lg-8 col-lg-offset-2">
        <form name="loginForm" method="post" action="/loginRequest.do" novalidate>
          <div class="row control-group">
            <div class="form-group col-xs-12 floating-label-form-group controls">
              <label for="email">Email Address</label>
              <input type="text" name="email" class="form-control" placeholder="Email Address" id="email" required data-validation-required-message="Please enter your email address.">
              <p class="help-block text-danger"></p>
            </div>
          </div>
          <div class="row control-group">
            <div class="form-group col-xs-12 floating-label-form-group controls">
              <label for="password">Password</label>
              <input type="password" name="password" id="password" class="form-control" required data-validation-required-message="Please enter your password.">
              <p class="help-block text-danger"></p>
            </div>
          </div>
          <br>
          <div id="success"></div>
          <div class="row">
            <div class="form-group col-xs-12">
              <button type="submit" class="btn btn-success btn-lg">Send</button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</section>

<!-- Footer -->
<footer class="text-center">
  <div class="footer-above">
    <div class="container">
      <div class="row">
        <div class="footer-col col-md-4">
          <h3>Location</h3>
          <p>Wisegiber Road
            <br>Knoxville, TN 37909</p>
        </div>
        <div class="footer-col col-md-4">
          <h3>Around the Web</h3>
          <ul class="list-inline">
            <li>
              <a href="#" class="btn-social btn-outline"><span class="sr-only">Facebook</span><i class="fa fa-fw fa-facebook"></i></a>
            </li>
            <li>
              <a href="#" class="btn-social btn-outline"><span class="sr-only">Google Plus</span><i class="fa fa-fw fa-google-plus"></i></a>
            </li>
            <li>
              <a href="#" class="btn-social btn-outline"><span class="sr-only">Twitter</span><i class="fa fa-fw fa-twitter"></i></a>
            </li>
            <li>
              <a href="#" class="btn-social btn-outline"><span class="sr-only">Linked In</span><i class="fa fa-fw fa-linkedin"></i></a>
            </li>
            <li>
              <a href="#" class="btn-social btn-outline"><span class="sr-only">Dribble</span><i class="fa fa-fw fa-dribbble"></i></a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <div class="footer-below">
    <div class="container">
      <div class="row">
        <div class="col-lg-12">
          Copyright &copy; Your Website 2017
        </div>
      </div>
    </div>
  </div>
</footer>

<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
<div class="scroll-top page-scroll hidden-sm hidden-xs hidden-lg hidden-md">
  <a class="btn btn-primary" href="#page-top">
    <i class="fa fa-chevron-up"></i>
  </a>
</div>

<jsp:include page="bodyFooter.jsp"/>
</body>
</html>
