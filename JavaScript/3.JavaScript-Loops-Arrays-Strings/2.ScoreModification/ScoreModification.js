function filterArray (arr) {
    function sorting (a,b) {
        return a - b;
    }
    var filtered = [];
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] > 400 || arr[i] < 0){
            arr.splice(i ,1);
            i--;
        }
    }
    arr.sort(sorting);
    console.log(arr);
    for (var i = 0; i < arr.length; i++) {
        filtered.push(parseFloat((arr[i] * 0.8).toFixed(1)));
    }
    console.log(filtered);
}

console.log(filterArray([200, 120, 23, 67, 350, 411, 420, 170, 212, 401, 615, -1]));