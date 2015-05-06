<?php

$number = 0;
$sum = 0;

echo '<table border="1px solid black"><th>Number</th><th>Square</th>';

do{
    if($number % 2 == 0){
        $squareRoot = round(sqrt($number),2);
        echo "<tr><td>$number</td><td>$squareRoot</td>";
        $sum += round(sqrt($number),2);
    }
    $number++;
}while($number <= 100);
echo "<tr><td style='font-weight: bold'>Total:</td><td>$sum</td>";
echo '</table>';