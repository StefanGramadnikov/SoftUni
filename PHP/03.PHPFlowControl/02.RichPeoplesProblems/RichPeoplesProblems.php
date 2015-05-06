<form method="post">
    Enter cars:
    <input type="text" name="cars"/>
    <input type="submit" name="submit" value="Show result"/>
</form>

<?php

$colors = ['black', 'green', 'yellow'];
$numbers = [1,2,3,4,5];

if(isset($_POST['submit'])){
    if(isset($_POST['cars'])){
        $cars = htmlentities($_POST['cars']);
        $cars = explode(", ", $cars);
    }
}
    echo '<table border="1px solid black"><th>Car</th><th>Colour</th><th>Count</th>';
for($i = 0; $i < count($cars); $i++){
    $currentCar = $cars[$i];
    $randomColour = array_rand($colors);
    $currentColour = $colors[$randomColour];
    $randomNumber = array_rand($numbers);
    $currentNumber = $numbers[$randomNumber];
    echo "<tr><td>$currentCar</td><td>$currentColour</td><td>$currentNumber</td></tr>";
}
echo '</table>';