<form method="post">
    <input type="text" name="input"/>
    <input type="radio" value="1" name="radio" />
    Check Palindrome
    <input type="radio" value="2" name="radio"/>
    Reverse String
    <input type="radio" value="3" name="radio"/>
    Split
    <input type="radio" value="4" name="radio"/>
    Hash String
    <input type="radio" value="5" name="radio"/>
    Shuffle String
    <input type="submit" name="submit"/>
</form>

<?php

if(isset($_POST['submit'])){
    if(isset($_POST['input'])){
        $input = htmlentities($_POST['input']);
    }

    if(isset($_POST['radio'])){
        $choice = $_POST['radio'];
    }
}


switch ($choice){
    case 1:
        $reverse = strrev($input);
        if($reverse == $input){
            echo "The word is a palindrome!";
        }
        else {
            echo "The word is not a palindrome!";
        }
        break;
    case 2:
        $reverse = strrev($input);
        echo $reverse;
        break;
    case 3:
        $splited = str_split($input);
        $splited = implode(' ', $splited);
        echo $splited;
        break;
    case 4:
        $hashString = crypt($input);
        echo $hashString;
        break;
    case 5:
        $shuffled = str_shuffle($input);
        echo $shuffled;
        break;
}