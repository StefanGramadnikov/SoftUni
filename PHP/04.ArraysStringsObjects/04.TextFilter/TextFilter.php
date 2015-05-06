<form method="post">
    <textarea name="input" id="" cols="30" rows="10"></textarea>
    <input type="text" name="banList"/>
    <input type="submit" name="submit"/>
</form>

<?php

if(isset($_POST['submit'])){
    if(isset($_POST['input'])){
    $input = htmlentities($_POST['input']);;
    }
    if(isset($_POST['banList'])){
        $banned = $_POST['banList'];
        $banned = explode(", ", $banned);
    }


    for($i = 0; $i < count($banned); $i++){
        $digitsCount = strlen($banned[$i]);
        $replacement = str_repeat("*", $digitsCount);
        $input = str_replace($banned[$i], $replacement, $input);
        echo $digitsCount . "<br>" . $replacement . "<br>";
    }

    echo $input;
}

