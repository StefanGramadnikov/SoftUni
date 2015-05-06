<form method="post">
    <textarea name="text" id="" cols="30" rows="10"></textarea>
    <input type="submit" name="submit" value="Count words"/>
</form>

<?php

if(isset($_POST['submit'])){
    if(isset($_POST['text'])){
        $input = strtolower(htmlentities($_POST['text']));
        $words = array_count_values(str_word_count($input, 1));
        arsort($words);
    }
}
echo "<table border='1px solid black' >";
foreach($words as $key => $value){
    echo "<tr><td>$key</td><td>$value</td></tr>";
}
echo "</table>";