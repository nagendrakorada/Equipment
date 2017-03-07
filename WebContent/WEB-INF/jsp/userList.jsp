<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Equipment Registration</title>
<style>
body {
	font-size: 20px;
	color: teal;
	font-family: Calibri;
}

td {
	font-size: 15px;
	color: black;
	width: 100px;
	height: 22px;
	text-align: center;
}
.heading {
	font-size: 18px;
	color: white;
	font: bold;
	background-color: orange;
	border: thick;
}
</style>
</head>
<body style="background-color:POWDERBLUE;">
	<center>
		<br /> <br /> <br /> <b>EQUIPMENT REGISTRATION </b><br /> <br />
			
		
          <form action="QR" method="get">
		<table border="1">
			<tr>
				<td class="heading">S_NO</td>
				<td class="heading">Equipment_Name</td>
				<td class="heading">Description </td>
				<td class="heading">Reg_No</td>
				
			</tr>
			 
			 	<!-- <input type="text" name="qrtext" />
		     <input type="submit" value="Generate QR Code" /><br> -->
			<c:forEach var="user" items="${userList}">
				<tr>
					<td>${user.s_NO}</td>
					<td>${user.equipment_Name}</td>
					<td>${user.description}</td>
					<td>${user.reg_No}</td>
					 <form action="/QR" method="Get">
					 <td> <INPUT TYPE="BUTTON" VALUE="Generate QR Code"  onclick="getSelectedRow"></td>
					<script language="javascript">
       /* function submitForm() {                
            document.forms[0].submit();
            alert("hi"); */
           
            //Functions to open database and to create, insert data into tables

            getSelectedRow = function(val)
               {
                   db.transaction(function(transaction) {
                         transaction.executeSql('SELECT * FROM Equipment_Master '+';');

                   });
               };
               selectedRowValues = function(transaction,results)
               {
                    for(var i = 0; i < results.rows.length; i++)
                    {
                        var row = results.rows.item(i);
                        alert(row['s_NO'+s_NO]);
                        alert(row['equipment_Name'+equipment_Name]);                 
                    }
               
        
            return true;
        }
        </script>
				</tr>
			</c:forEach>
			
			<tr><td colspan="7"><a href="register">Add New User</a></td></tr>
		</table>

	</center>
</body>
</html>