<!DOCTYPE html>
<html lang="en">
<head>
  <title>Enchanted Book</title>
  
 <link rel="stylesheet" type="text/css" href= "bookStyle.css"/>
 
</head>
<body>

 <h1>The Enchanted Library - Add Employee</h1>
 <div class="transparent-box">

<?php

// Get employee ID from form
$employeeID = $_POST['employeeID'];

// Check if employee ID matches the format
if (preg_match('/^[A-Za-z]{4}[0-9]{4}$/', $employeeID)) {
	//if matches then this displays 
    echo "<p>Employee ID is correct<p>";
} else {
	// if not then this displays 
    echo "<p>Employee ID is incorrect. Please re-enter employee ID.<p>";
	echo "<a href='enchantedEmployee.html'>Go back to the form</a>";
}

?>
</div>
</body>
</html>