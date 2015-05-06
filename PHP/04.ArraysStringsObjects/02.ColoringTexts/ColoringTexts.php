<form method="post">
    <textarea name="text" id="" cols="30" rows="10"></textarea>
    <input type="submit" name="submit"/>
</form>

<?php

if(isset($_POST['submit'])){
    if(isset($_POST['text'])){
        $input =  htmlentities($_POST['text']);
    }
    $splited = str_split($input);
    $splited = implode(" ", $splited);
    $splited = explode(" ", $splited);

    for($i = 0; $i < count($splited); $i++){
        $asciiValue = ord($splited[$i]);
        if($asciiValue % 2 == 0){
            echo "<span style='color: red'>$splited[$i] <span>";
        }
        else {
            echo "<span style='color: blue'>$splited[$i] <span>";
        }
    }
}
