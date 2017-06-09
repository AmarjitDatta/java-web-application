<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
  <jsp:include page="head.jsp"/>
</head>
<body>
  <div class="container">
    <div class="row welcome">
      <div class="col-sm-12">
        <h1 class="welcome">Welcome to my website</h1>
      </div>
    </div>
    <div class="row login">
      <div class="col-sm-12">
        <p>If you are already registered, please <a href="login" class="req-login">Login</a></p>
      </div>
    </div>
    <div class="row register">
      <div class="col-sm-12">
        <p>If you haven't registered yet, please click <a href="register" class="req-registration">Register</a></p>
      </div>
    </div>
  </div>
  <jsp:include page="bodyFooter.jsp"/>
</body>
</html>
