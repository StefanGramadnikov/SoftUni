<form method="post">
    Categories:
    <input type="text" name="categories"/>
    Tags:
    <input type="text" name="tags"/>
    Months:
    <input type="text" name="months"/>

    <input type="submit" name="submit" value="Generate"/>
</form>

<?php

if(isset($_POST['submit'])){
    if(isset($_POST['categories'])){
        $categories = htmlentities($_POST['categories']);
        $categories = explode(", ", $categories);
        builder("Categories", $categories);
    }
    if(isset($_POST['tags'])){
        $tags = htmlentities($_POST['tags']);
        $tags = explode(", ", $tags);
        builder("Tags", $tags);
    }
    if(isset($_POST['months'])){
        $months = htmlentities($_POST['months']);
        $months = explode(", ", $months);
        builder("Months",$months );
    }
}


function builder($name, $arr) {
    echo "<div style='margin: 5px; width: 150px; border: 1px solid transparent; border-radius: 15px; background: rgba(183,222,237,1)'>";
    echo "<div id='name'><h2 style='border-bottom: 1px solid black'>$name</h2></div>";
    echo "<ul>";
    foreach ($arr as &$value){
        echo "<li style='border-bottom: 1px solid black; width: 100px'> $value </li>";
    }
    echo "</ul></div>";

}