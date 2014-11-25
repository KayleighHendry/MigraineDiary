<!DOCTYPE html>
<html>
	<head>
		<title>Register - Migraine DiaryLogin</title>
		<link rel="stylesheet" type="text/css" href="style.css" />
	</head>
	
	<body>
		<div id="content">
			<h1 style="top: 10px">Migraine Diary</h1>
			<p style="margin-left: 50px; margin-top: 80px">* required field.</p>
			<form method="POST" action="Register">
				<table style="margin-left: 10%; width:80%">
					<tr>
						<th>Username: </th>
						<td><input type="text" name="username"> *</td>
					</tr>
					<tr>
						<th>Password: </th>
						<td><input type="password" name="password"> *</td>
					</tr>
					<tr>
						<th>First Name: </th>
						<td><input type="text" name="first_name"> *</td>
					</tr>
					<tr>
						<th>Last Name: </th>
						<td><input type="text" name="last_name"> *</td>
					</tr>
					<tr>
						<th>DOB: </th>
						<td><input type="date" name="dob"> *</td>
					</tr>
					<tr>
						<th>Gender: </th>
						<td><input type="radio" name="gender" value="female">Female
						<input type="radio" name="gender" value="male">Male &nbsp;&nbsp;&nbsp;&nbsp;*</td>
					</tr>
					<tr>
						<th>Employment: </th>
						<td><input type="text" name="employment"> *</td>
					</tr>
					<tr>
						<th>Everyday Medication: </th>
						<td><input type="text" name="everyday_meds"> *</td>
					</tr>
					<tr>
						<th>Known Triggers: </th>
						<td><input type="text" name="known_triggers"> *</td>
					</tr>
				</table>
				<br/>
				<input type="submit" value="Register">
			</form>
        	<div style="position:absolute; top:535px; overflow:hidden;">
            	<p class="text_body"><span class="copyright">GCKK</span></p>
        	</div>
		</div>
	</body>
</html>