<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <jsp:include page="head.jsp"/>
</head>
<body>
  <div class="container">
    <div class="row">
      <div class="col-sm-12">
        <h1 class="welcome">Login Page</h1>
        <h2 class="welcome">Enter your login credentials</h2>
      </div>
    </div>
    <div class="row">
      <div class="col-sm-12">
        <form name="loginForm" method="post" action="/loginRequest.do">
          <div class="form-group">
            <label for="email">Email</label>
            <input type="email" name="email" id="email" class="form-control"/>
          </div>

          <div class="form-group">
            <label for="password">Password</label>
            <input type="password" name="password" id="password" class="form-control"/>
          </div>

          <button type="submit" class="btn btn-default">Submit</button>
        </form>
      </div>
    </div>
  </div>




  <%--Bootstrap related JS--%>
  <jsp:include page="bodyFooter.jsp"/>
</body>
</html>
