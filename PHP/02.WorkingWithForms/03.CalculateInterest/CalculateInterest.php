<div>
<form method="post">
    <label for="amount">Enter amount:</label>
    <input type="number" name="amount" required/>
    <input type="radio" value="usd" name="currency" required/>
    <label for="currency">USD</label>
    <input type="radio" value="eur" name="currency" required/>
    <label for="currency">EUR</label>
    <input type="radio" value="bgn" name="currency" required/>
    <label for="currency">BGN</label>
    <label for="interest">Compound Interest Amount</label>
    <input type="number" name="interest" required/>
    <select name="time">
        <option value="6">6 Months</option>
        <option value="12">1 Year</option>
        <option value="24">2 Years</option>
        <option value="60">5 Years</option>
    </select>
    <input type="submit" name="submit" value="Calculate"/>
</form>
</div>

<?php

    $currencySymbol = '';

    if(isset($_POST['amount'])){
        $amount = $_POST['amount'];
    }
    if(isset($_POST['currency'])){
        $currency = $_POST['currency'];
    }
    if(isset($_POST['interest'])){
        $interest = htmlspecialchars(floatval($_POST['interest']));
        $interest = $interest / 12 / 100;
    }
    if(isset($_POST['time'])){
        $interval = htmlspecialchars(intval($_POST['time']));
    }
    switch($currency) {
        case 'usd':
            $currencySymbol = '$';
            break;
        case 'eur':
            $currencySymbol = '&euro;';
            break;
        case 'bgn':
            $currencySymbol = 'Lv';
            break;
        default: '';
    }

    for ($i = 0; $i < $interval; $i++) {
        $amount += $amount * $interest;
    }

    $amount = round($amount, 2);

    if($currencySymbol != '') {
        echo "$currencySymbol $amount";
    }