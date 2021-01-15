<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@taglib uri = "http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
input[type=text], select {
  width: 100%;
  padding: 8px 10px;
  border: 2px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 8px 10px;
  border-radius: 4px;
  
}
</style>
</head>
<body style="background-color:powderblue">
<center>
<h1>Welcome to BMI Calculation</h1>
	<table>
	<form:form method="post" action="/add" modelAttribute="userDetails">
	<tr>
			
			<td><form:label path="name">Name</form:label></td>
			<td><form:input type="text" path="name" id="name"/></td>
			<td><form:errors path="name"/></td>
		</tr>
		<tr>
			<td><form:label path="age">Age</form:label></td>
			<td><form:input type="text" path="age" id="age"/></td>
			<td><form:errors path="age"/></td>
			</tr>
		<tr>
			<td><form:label path="gender">Gender</form:label></td>
			<td><form:input type="text" path="gender" id="gender"/></td>
			<td><form:errors path="gender"/></td>
			</tr>
			<tr>
			<td><form:label path="weight">Weight</form:label></td>
			<td><form:input type="text" path="weight" id="weight"/></td>
			<td><form:errors path="weight"/></td>
			</tr>
			<tr>
			<td><form:label path="height">Height</form:label></td>
			<td><form:input type="text" path="height" id="height"/></td>
			<td><form:errors path="height"/></td>
			</tr>
			<tr>
			<td><form:label path="phoneNumber">Phone Number</form:label></td>
			<td><form:input type="text" path="phoneNumber" id="phoneNumber"/></td>
			<td><form:errors path="phoneNumber"/></td>
			</tr><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<center>		
		<tr>
			<td>
			
		   <input type="submit" value="Calculate BMI" name="submit"/>
			
			</td>
		</tr>
		</center>
	</form:form>
	</table>

</center>
	
</body>
</html>