<!DOCTYPE html>
<html lang="en">
<head>
  <title>Enchanted Book</title>
  
 <link rel="stylesheet" type="text/css" href= "bookStyle.css"/>
 
</head>
</body>
 <h1>The Enchanted Library - Book Information</h1>
    <div class="transparent-box">

   <?php
   
   //this to declare the filename 
    $filename = "/afs/umbc.edu/users/n/a/nafisae1/pub/text-files/bookRegistry.txt";
	
	// this checks if the file exists
    if (file_exists($filename)) {
		// this reads the contents of the file 
        $contents = file_get_contents($filename);
		
	// this checks if the file is empty
        if (!empty($contents)) {
			//then it display the file content 
            echo "<pre>$contents</pre>";
        } else {
			// This messages shows if teh file is empty 
            echo " <p> No books have been added to the registry yet.</p>";
        }
    }
    ?>
</div>
    <a href="enchantedBook.html">Go back to the form</a>
</body>
</html>