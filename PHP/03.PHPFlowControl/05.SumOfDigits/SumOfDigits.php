<form method="post">
    Input String:
    <input type="text" name="input"/>
    <input type="submit" name="submit"/>
</form>

<?php


if(isset($_POST['submit'])){
    if(isset($_POST['input'])){
        $input = htmlentities($_POST['input']);
        $input = explode(",", $input);
    }

    echo '<table border="1px solid black">';

    for($i = 0; $i < count($input); $i++){
        $currentInput = $input[$i];
        $sum = 0;

        if(is_numeric($currentInput)){
            echo "<tr><td>$currentInput</td>";
            $currentInput = str_split($currentInput);
            for($m = 0; $m <= count($currentInput); $m++){
                $sum += $currentInput[$m];
            }
            echo "<td>$sum</td></tr>";
        }
        else {
            echo "<tr><td>$currentInput</td><td>I cannot sum that</td></tr>";
        }
    }
}
