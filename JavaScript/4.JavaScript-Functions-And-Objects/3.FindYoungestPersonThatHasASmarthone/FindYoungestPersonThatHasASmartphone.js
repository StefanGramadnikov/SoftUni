var people = [
    { firstname : 'Bay', lastname: 'Ivan', age: 81, hasSmartphone: true },
    { firstname : 'George', lastname: 'Kolev', age: 32, hasSmartphone: false },
    { firstname : 'Vasil', lastname: 'Kovachev', age: 40, hasSmartphone: true },
    { firstname : 'Baba', lastname: 'Ginka', age: 40, hasSmartphone: false }];

function findYoungestPerson(array) {
    var youngest = 0, hasPhoneArr = [];
    for (var i = 0; i < array.length; i++) {
        if(array[i].hasSmartphone === true) {
            hasPhoneArr.push(array[i]);
        }
    }
    youngest = hasPhoneArr[0];
    for (var i = 0; i < hasPhoneArr.length; i++) {
        if (hasPhoneArr[i].age < youngest.age){
            youngest = hasPhoneArr[i];
        }

    }
    console.log("The youngest person is " + youngest.firstname + " " + youngest.lastname);
}
findYoungestPerson(people);