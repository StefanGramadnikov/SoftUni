function calcExpression() {
    var x = document.getElementById("myText").value;
    try {
        var result = eval(x);
    } catch (Exception) {
        document.getElementById("demo").innerHTML = 'Invalid Entry!';

    }
    if(Number(result)){
        document.getElementById("demo").innerHTML = result;
    }
}