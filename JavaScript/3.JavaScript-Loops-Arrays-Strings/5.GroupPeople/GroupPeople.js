function Person(firstName, lastName, age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;

}
Array.prototype.groupByProperties = function(properties){
    var arr = this;
    var groups = [];
    for(var i = 0, len = arr.length; i<len; i+=1){
        var obj = arr[i];
        if(groups.length == 0){
            groups.push([obj]);
        }
        else{
            var equalGroup = false;
            for(var a = 0, glen = groups.length; a<glen;a+=1){
                var group = groups[a];
                var equal = true;
                var firstElement = group[0];
                properties.forEach(function(property){

                    if(firstElement[property] !== obj[property]){
                        equal = false;
                    }

                });
                if(equal){
                    equalGroup = group;
                }
            }
            if(equalGroup){
                equalGroup.push(obj);
            }
            else {
                groups.push([obj]);
            }
        }
    }
    return groups;
};
var people = [
    new Person("Scott", "Guthrie", 38),
    new Person("Scott", "Johns", 36),
    new Person("Scott", "Hanselman", 39),
    new Person("Jesse", "Liberty", 57),
    new Person("Jon", "Skeet", 38)
];
console.log(groupBy)
