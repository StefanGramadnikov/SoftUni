function sortLetters(string, boolean) {
    
    var sorted = string.split("").map(String);
    
    if (boolean === true){
        sorted = sorted.sort(alphabetical).join("");
    }
    else if (boolean === false) {
        sorted = sorted.sort(alphabetical).reverse().join("");
    }
    console.log(sorted);
    
    function alphabetical(a, b)
    {
        var A = a.toLowerCase();
        var B = b.toLowerCase();
        if (A < B){
            return -1;
        }else if (A > B){
            return  1;
        }else{
            return 0;
        }
    }
}
sortLetters('HelloWorld', false);