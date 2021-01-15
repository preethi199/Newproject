<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.*,com.fitness.model.FitnessModel,com.fitness.service.FitnessService" %>
    
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BMI Calculator</title>
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #4CAF50;
  color: white;
}

</style>
</head>
<body bgcolor="lavender">
<center>
<h1>Your BMI is  ${bmi}</h1>
<table border='1'>
	<tr>
	    <th>Diet Plan</th>
		<th>WorkOut Plan</th>
		<th>Healthy Recipes</th>
	</tr>
	<%			
			List<FitnessModel> lp= (List<FitnessModel>)request.getAttribute("lp");
			Iterator<FitnessModel> it=lp.iterator();
			while(it.hasNext())
			{
				FitnessModel f=it.next();
				
				String diet=f.getDiet();
				String workout=f.getWorkout();
				String recipes=f.getRecipes();
		
	%>
	<tr>
	    <td><%=diet%></td>
		<td><%=workout%></td>
		<td><%=recipes%></td>
	</tr>
	<%} %>
	</table><br>
	
</center>
</body>
</html>