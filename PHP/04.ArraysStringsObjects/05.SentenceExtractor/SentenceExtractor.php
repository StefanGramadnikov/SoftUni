<form method="post">
    <textarea name="input" id="" cols="30" rows="10"></textarea>
    <input type="text" name="word"/>
    <input type="submit" name="submit"/>
</form>

<?php


if(isset($_POST['submit'])){
    if(isset($_POST['input'])){
        $input = htmlentities($_POST['input']);;
        $sentences = preg_split("/(?<=[.?!])\s*/",$input, -1, PREG_SPLIT_NO_EMPTY);
        $sentences = array_map('trim', $sentences);
        var_dump($sentences);
    }
    if(isset($_POST['word'])){
        $banned = htmlentities($_POST['word']);

    }

    foreach ($sentences as $sentence) {
        if (preg_match("/\b$word\b.*[.?!]+$/", $sentence)) {
            echo "<p>$sentence</p>";
        }
    }
}

