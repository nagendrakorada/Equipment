<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Add New Equipment</title>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
  <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
 
 <link rel="stylesheet" href="/resources/demos/style.css" />
  <link rel="stylesheet" href="/WebContent/WEB-INF/jsp/bootstrap.min.css" />
<style>
body {
	font-size: 20px;
	color: teal;
	font-family: Calibri;
}

td {
	font-size: 15px;
	color: black;
	width: 150px;
	height: 22px;http://localhost:3333/SpringJDBCTemplate/insert
	text-align: left;
}
 select {
        width:200px;
    }
   
    
.heading {	return null;
	font-size: 18px;
	color: white;
	font: bold;
	background-color: orange;
	border: thick;
}
select {
    width: 174px;
}
</style>

<style>
    .datepicker{
     
    }
    .fontsize
    {
    font-size: 108%; 
    }
    .radius
    {
    border-radius: 15px;
    background: #73AD21;
    }
  </style>
  
  </style>
 
 <script>
  $(function() {
    $( ".datepicker" ).datepicker({
    	 maxDate: new Date()
    }
    );
    $( ".datepicker1" ).datepicker({
		  minDate:0
	  }
			  );
    
  });
  </script>
  <script>
  
  /* $(function() {
	  $('.datepicker').change(function () {
	  var from = $('.datepicker').datepicker('getDate');
	 // var date_diff = Math.ceil((from.getTime() - Date.parse(today)) / 86400000);
	 var end = from.getFullYear()+"-"+from.getMonth()+1+"-"+from.getDate();
	  alert(from.getMonth()+1+"-"+from.getDate()+"-"+from.getFullYear());
	
	  var sd= $('#fromDate').val();
	  alert("sd"+sd);
	  $( ".datepicker1" ).datepicker({
		  minDate:from
	  }
			  );
	  })
    
  }); */
  </script>
   
</head>
<body style="background-color:powderblue;">
	<center>
		<br /> <br /> <br /> <b>NEW EQUIPMENT </b> <br />
		<br />
		<div>
			<form:form method="post" action="/insert"  modelAttribute="user">

				<table>
					<tr>
						<td class="fontsize">EQUIPMENT ID:</td>
						<td><form:input path="Equipment_Id" length="2" class="radius" /></td>
					</tr>
					<tr>
						<td class="fontsize">EQUIPMENT NAME:</td>
						<td><form:input path="Equipment_Name" class="radius"/></td>
					</tr>
					<tr>
						<td class="fontsize">EQUIPMENT TYPE:</td>
						<td><form:select path="Equipment_Type_Name" items="${map.typeList}" class="radius"/></td>
					</tr>
					<tr>
						<td class="fontsize">DESCRIPTION :</td>
						<td><form:input path="Description" class="radius"/></td>
					</tr>
					<tr>
						<td class="fontsize">S.NO :</td>
						<td><form:input path="S_NO" class="radius"/></td>
					</tr>
					<tr>
						<td class="fontsize">REG NO:</td>
						<td><form:input path="Reg_No" class="radius"/></td>
					</tr>
					<tr>
						<td class="fontsize">FACILITY NAME:</td>
						<td><form:select path="Facility_Name" items="${map.facilitylistt}" class="radius" /></td>
					</tr>
					 <tr>
						<td class="fontsize">START DATE :</td>
						<td><form:input path="Start_Date"  class="datepicker radius" /></td>
						
					</tr>
					<tr>
						<td class="fontsize">END DATE:</td>
						<td><form:input path="End_Date"  class="datepicker1 radius" /></td>
					</tr>
					<tr>
			
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" class="radius" /></td>
					</tr>
					<tr>

						<td colspan="2" style="padding-top: 50px;
						"><a href="getList">Click Here to See
								Equpiment List</a></td>
					</tr>

				</table>
			</form:form>
		</div>
	</center>
</body>
</html>