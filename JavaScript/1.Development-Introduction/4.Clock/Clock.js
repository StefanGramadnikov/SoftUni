function clockFunction() {
    var now = new Date();
    var hour = now.getHours();
    var minutes = now.getMinutes();
    var seconds = now.getSeconds();
    document.getElementById('clock').innerHTML =
        "" + hour + ":" + minutes + ":" + seconds;
}

    setInterval('clockFunction()' , 1000);