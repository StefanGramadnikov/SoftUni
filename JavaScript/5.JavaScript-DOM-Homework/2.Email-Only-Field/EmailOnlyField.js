function validateEmail() {
    var email = document.getElementById('validate').value;
    var re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    if(re.test(email)){
        document.getElementById("paste").innerHTML = email;
        document.getElementById('paste').style.background = "green";
    }
    else
        document.getElementById("paste").innerHTML = email;
        document.getElementById('paste').style.background = "red";


}
