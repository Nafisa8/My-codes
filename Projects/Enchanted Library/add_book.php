<!DOCTYPE html>
<html lang="en">
<head>
  <title>Enchanted Book</title>
  
 <link rel="stylesheet" type="text/css" href= "bookStyle.css"/>
 
</head>

 <h1>The Enchanted Library - Add Book </h1>
 <div class="transparent-box">
 <?php
//this is to get the book info from the POST req
$bookName = $_POST['bookName'];
$author = $_POST['author'];
$genre = $_POST['genre'];
$publicationYear = $_POST['publicationYear'];

// checks if any of the field are empty 
if (empty($bookName) || empty($author) || empty($genre) || empty($publicationYear)) {
	//if any empty field below text shows
    echo "<p>Please fill out all fields before submitting.</p>";
	echo "<a href='enchantedBook.html'>Go back to the form</a>";
	
    // or else it will open the book registery file in append mode
} else {

$file = fopen('/afs/umbc.edu/users/n/a/nafisae1/pub/text-files/bookRegistry.txt', 'a+');

//then write the book information to the file 
fwrite($file,"Book Name: $bookName\nAuthor: $author\nGenre: $genre\nPublication Year: $publicationYear\n\n");

//then finally close the file 
fclose($file);

//And this displays a success messgae and a link to add another book
echo "<p>Book successfully added to the registry!</p>";
echo "<a href='enchantedBook.html'>Add Another Book</a>";
}
?>
</div>
</body>
</html>
