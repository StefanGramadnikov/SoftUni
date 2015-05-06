Array.prototype.removeItem = function(value) {
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] == value && (typeof arr[i] == typeof value)){
            var index = arr.indexOf(arr[i]);
            if (index > -1) {
                arr.splice(index, 1);
                i--;
            }
        }
    }
    console.log(arr);
};
var arr = ['hi', 'bye', 'hello' ];
arr.removeItem('bye');