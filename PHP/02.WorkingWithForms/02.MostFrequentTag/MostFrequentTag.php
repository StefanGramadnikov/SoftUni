
<form method="post">
    <input type="text" name="input" />
    <input type="submit" name="submit" value="Submit" />
</form>

<?php
if(isset($_POST['input']) && $_POST['input'] != "") {

    $userInput = htmlspecialchars($_POST['input']);
    $tags = explode(", ", $userInput);

    $mostFrequent = array_count_values($tags);
    $keys = array_keys($mostFrequent);

    arsort($mostFrequent);

    foreach ($mostFrequent as $key => $value) {
        echo "$key : $value\n <br>";
    }

    echo "The most frequent tag is: $keys[1] ";
}
elseif (empty($_POST['input']) && $_POST['submit'] != null){

    echo "Invalid Input";
}