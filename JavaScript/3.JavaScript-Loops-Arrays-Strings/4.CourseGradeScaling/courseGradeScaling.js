function scaleCourses (input){
    for (var i = 0; i < input.length; i++) {
        ((input[i].score)) += (input[i].score) * 0.1;
        if (input[i].score < 100){
            delete input[i];
        }
        else {
            input[i]['hasPassed'] = 'true';
        }
    }
    function sortByKey(array, key) {
        return array.sort(function(a, b) {
            var x = a[key]; var y = b[key];
            return ((x < y) ? -1 : ((x > y) ? 1 : 0));
        });
    }
    input = sortByKey(input, 'name');
    console.log(input);
}
scaleCourses([
        {
            'name' : 'Пешо',
            'score' : 91
        },
        {
            'name' : 'Лилия',
            'score' : 290
        },
        {
            'name' : 'Алекс',
            'score' : 343
        },
        {
            'name' : 'Габриела',
            'score' : 400
        },
        {
            'name' : 'Жичка',
            'score' : 70
        }
    ]
);