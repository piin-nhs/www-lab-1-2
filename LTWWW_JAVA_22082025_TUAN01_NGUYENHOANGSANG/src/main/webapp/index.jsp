<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello, Nguyen Hoang Sang" %></h1>
<br/>
<a href="bai2-servlet">Bai 2</a> <br/>
<a href="bai3-servlet">Bai 3</a> <br/>
<a href="bai4-servlet">Bai 4</a>
<p>Bai 5</p>
<form method="post" action="bai5Servlet" >
  <div class="form-group" style="margin-bottom: 15px;" >
    <label>Name <span  style="color: red">*</span></label><br>
    <input type="text" name="firstName" style="width:200px; height:30px; margin-right: 15px;" placeholder="First">
    <input type="text" name="lastName" style="width:200px; height:30px;" placeholder="Last">
  </div>
  <div class="form-group" style="margin-bottom: 15px;">
    <label>Username <span  style="color: red">*</span></label><br>
    <input type="text" name="username" style="width:200px; height:30px;">
  </div>
  <div class="form-group" style="margin-bottom: 15px;">
    <label>E-mail <span  style="color: red">*</span></label><br>
    <input type="email" name="email" style="width:200px; height:30px;">
  </div>
  <div class="form-group" style="margin-bottom: 15px;">
    <label>Password <span  style="color: red">*</span></label><br>
    <input type="password" name="password" style="width:200px; height:30px;">
  </div>
  <div class="form-group" style="margin-bottom: 15px;">
    <label>Facebook</label><br>
    <input type="url" name="facebook" style="width:200px; height:30px;" placeholder="Enter your Facebook profile URL">
  </div>
  <div class="form-group" style="margin-bottom: 15px;">
    <label>Short Bio</label><br>
    <textarea name="shortBio" rows="4" style="width:600px; height:50px;" placeholder="Share a little information about yourself."></textarea>
  </div>
  <input type="submit" value="Submit" style="width:80px; height:40px;">
</form>
</body>
</html>