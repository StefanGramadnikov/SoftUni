<form method="post">
    Enter years:
    <input type="text" name="years"/>
    <input type="submit" name="submit" value="Show cost"/>
</form>

<?php

$currentYear = intval(date('Y'));
$total = 0;

if(isset($_POST['submit'])){
    if(isset($_POST['years'])){
        $input = htmlentities($_POST['years']);
        if(is_numeric($input)){
            $years = htmlentities($_POST['years']);
        }
        else {
            echo 'Invalid input!';
        }
    }
}
if(isset($_POST['submit'])){
    echo '<table border="1px solid black"><th>Year</th><th>January</th><th>February</th><th>March</th><th>April</th><th>May</th><th>June</th><th>July</th>
<th>August</th><th>September</th><th>October</th><th>November</th><th>December</th><th>Total:</th>';

    for($i = 0; $i <= $years; $i++){
        $total = 0;
        echo "<tr><td>$currentYear</td>";
        for($m = 0; $m < 12; $m++){
            $randomNum = rand(0,999);
            $total += $randomNum;
            echo "<td>$randomNum</td>";
            if ($m == 11){
                echo "<td>$total</td></tr>";
                $currentYear--;
            }
        }
    }
}
