<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Details</title>
</head>
<body style="font-family: Arial, sans-serif;">
	<div
		style="width: 50%; margin: 0 auto; padding: 20px; border: 1px solid #ccc; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); text-align: center;">
		<h2 style="color: #4CAF50;">Ticket Details</h2>
		<div class="ticket-details" style="margin-top: 20px;">
			<p>
				<strong>From:</strong>
				<%=request.getAttribute("from")%></p>
			<p>
				<strong>To:</strong>
				<%=request.getAttribute("to")%></p>
			<p>
				<strong>Journey Type:</strong>
				<%=request.getAttribute("journeyType")%></p>
			<p>
				<strong>Fare:</strong> Rs <%=request.getAttribute("fare")%></p>
		</div>
	</div>
</body>
</html>