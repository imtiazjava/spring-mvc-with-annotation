<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<html>
<body>
<h2>WELCOME TO HOME PAGE</h2>
<hr/>
<form:form action="store" method="post">
 <table>
 		<tr>
 			<td>STUDENT ID:</td>
 			<td>
 				<form:input path="sid"/>
 			</td>
 		</tr>
 		
 		<tr>
 			<td>STUDENT NAME:</td>
 			<td>
 				<form:input path="sname"/>
 			</td>
 		</tr>
 		<tr>
 			<td>STUDENT MARKS:</td>
 			<td>
 				<form:input path="smarks"/>
 			</td>
 		</tr>
 		<tr>
 			<td></td>
 			<td>
 				<input type="submit" value="STORE"/>
 			</td>
 		</tr>
 		
 		
 </table>

</form:form>
    
</body>
</html>

