<form method="post">
    Starting index :
    <input type="text" name="start"/>
    End :
    <input type="text" name="end"/>
    <input type="submit" name="submit"/>
</form>

<?php

if(isset($_POST['submit'])){
    if(isset($_POST['start'])){
        if(is_numeric($_POST['start'])){
            $start = intval(htmlentities($_POST['start']));
        }
        else {
            echo 'Invalid input';
        }
    }
    if(isset($_POST['end'])){
        if(is_numeric($_POST['end'])){
            $end = intval(htmlentities($_POST['end']));
        }
        else {
            echo 'Invalid input';
        }
    }

    function isPrime($num) {
        if ($num < 2) return false;
        if ($num == 2) return true;
        if ($num % 2 == 0) return false;
        for ($i = 3; $i < sqrt($num); $i += 2) {
            if ($num % $i == 0) return false;
        }
        return true;
    }

    for($i = $start; $i <= $end; $i++){
        if (isPrime($i)) {
            echo "<B>$i</B>";
        }
        else {
            echo $i;
        }
        if ($i != $end) {
            echo ', ';
        }
    }
}
