<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<title>Management</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			<div>
				<a class="navbar-brand"> Management</a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/listPatients" class="nav-link">Patients</a></li>
				<li class="nav-link">Meds</li>
			</ul>
		</nav>
	</header>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<form action="update" method="post">
					<h2>Edit Patient</h2>
					<fieldset class="form-group">
					<label>Patient Id</label>
					 <input type="text" name="idPatient" value="${param.idPatient}" readonly/>
					 </fieldset>
					<fieldset class="form-group">
						<label>Patient Name</label> 
						<input type="text"	class="form-control"  name="namePatient" >
					</fieldset>

					<fieldset class="form-group">
						<label>Patient Email</label> <input type="text"
							value="<c:out value='${Patient.emailPatient}' />"
							class="form-control" name="emailPatient">
					</fieldset>

					<fieldset class="form-group">
						<label>Patient Address</label> <input type="text"
							value="<c:out value='${Patient.countryPatient}' />"
							class="form-control" name="countryPatient">
					</fieldset>

					<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>