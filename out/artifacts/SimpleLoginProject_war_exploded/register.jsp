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
      <h1 class="welcome">Registration page</h1>
      <h2 class="welcome">Enter your registration detail</h2>
    </div>
  </div>

  <div class="row">
    <div class="col-sm-12">
      <form name="registrationForm" method="post" action="/regRequest.do">
        <div class="form-group">
          <label for="email">Email</label>
          <input type="email" name="email" id="email" class="form-control"/>
        </div>

        <div class="form-group">
          <label for="lastName">Last Name</label>
          <input type="text" name="lastName" id="lastName" class="form-control"/>
        </div>

        <div class="form-group">
          <label for="firstName">First Name</label>
          <input type="text" name="firstName" id="firstName" class="form-control"/>
        </div>

        <div class="form-group">
          <label for="address1">Address 1</label>
          <input type="text" name="address1" id="address1" class="form-control"/>
        </div>

        <div class="form-group">
          <label for="address2">Address 1 (Optional)</label>
          <input type="text" name="address2" id="address2" class="form-control"/>
        </div>

        <div class="form-group">
          <label for="city">City</label>
          <input type="text" name="city" id="city" class="form-control"/>
        </div>

        <div class="form-group">
          <label for="state">State</label>
          <input type="text" name="state" id="state" class="form-control"/>
        </div>

        <div class="form-group">
          <label for="zip">Zip Code</label>
          <input type="text" name="zip" id="zip" class="form-control"/>
        </div>

        <div class="form-group">
          <label for="phone">Phone Number</label>
          <input type="text" name="phone" id="phone" class="form-control"/>
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

<%--Bootstrap js files--%>
<jsp:include page="bodyFooter.jsp"/>
</body>
</html>
