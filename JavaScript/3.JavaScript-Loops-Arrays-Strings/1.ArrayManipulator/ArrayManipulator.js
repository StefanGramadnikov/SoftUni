function manipulate(arr){
    function mostFrequent(numbers) {
        var valueName = numbers[0], valueCount = 1, tmpCount = 1;
        for (var i = 1; i < numbers.length; i++) {
            var prev = numbers[i - 1];
            var curr = numbers[i];

            if (curr == prev) {
                tmpCount++;
            }

            if (curr != prev || i == numbers.length - 1) {
                if (tmpCount > valueCount) {
                    valueName = prev;
                    valueCount = tmpCount;
                }

                tmpCount = 1;
            }
        }
        return valueName;
    }
    function sortNumber(a,b) {
        return b - a;
    }
    var numbers = [];
    for (var i = 0; i < arr.length - 1; i++) {
        if(typeof arr[i] == "number"){
            numbers.push(arr[i]);
            numbers.sort(sortNumber);
        }
    }
    console.log("Min number: " + numbers[numbers.length-1]);
    console.log("Max number: " + numbers[0]);
    console.log("Most frequent number: " + mostFrequent(numbers));
    console.log(numbers);
}
manipulate(["Pesho", 2, "Gosho", 12, 2, "true", 9, undefined, 0, "Penka", { bunniesCount : 10}, [10, 20, 30, 40]])