<form method="post">
    <label for="tags">Enter HTML tags: </label>
    <input type="text" name="input" />
    <input type="submit" name="submit" value="Submit" />
</form>

<?php

session_start();

if(isset($_POST['input']) && isset($_SESSION['counter'])){
    $string = $_POST['input'];
    if($string != strip_tags($string)) {
        $_SESSION['counter'] += 1;
        echo "Valid HTML!";
        echo "Score: " . $_SESSION['counter'];
    }
    else {
        echo "Invalid HTML!";
        echo "Score: " . $_SESSION['counter'];
    }
}
else {
    $_SESSION['counter'] = 1;
}