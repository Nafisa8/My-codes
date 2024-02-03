<html>
<head>
<title>Background Colors change based on the day of the week</title>
</head>

<?php

$today = date("D");  

print "$today";
/*
if ($today=="Wed")
	$color="blue";
	
else if ($today=="Thu")
	$color="green";
	*/
	
$bgcolor = array( "Wed" => "orange", "Thu" => "purple");
?> 

<style type ="text/css">

body{
	background-color: <?php /*echo "$color"*/ echo "$bgcolor[$today]";?>;
}
</style>

<body>
<h1>Welcome to my home page</h1>
</body>
</html>
