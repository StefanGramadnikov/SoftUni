
<form method="post">
    <input type="text" name="input" />
    <input type="submit" name="submit" value="Submit" />
</form>

<?php
if(isset($_POST['input']) && $_POST['input'] != ""){
    $userInput = htmlspecialchars($_POST['input']);
    $tags = explode(", ", $userInput);
    for ($i = 0; $i < count($tags); $i++){
        echo $i . " : " . $tags[$i] . '<br>';
    }
}
elseif (empty($_POST['input']) && $_POST['submit'] != null){
    echo "Invalid Input";
}