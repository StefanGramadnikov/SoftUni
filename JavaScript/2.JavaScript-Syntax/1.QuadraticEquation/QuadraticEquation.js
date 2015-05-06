function equationSolver(a, b ,c){
    if ( (Math.pow(b, 2) - 4 * (a * c)) == 0){
        console.log("x = " + (-b / (2 * a)) );
    }
    else if ( (Math.pow(b, 2) - 4 * (a * c)) > 0 ){
        console.log("x1 = " + ( (-b + Math.sqrt( (Math.pow(b, 2) - 4 * (a * c)))) / (2 * a) ) );
        console.log("x2 = " + ( (-b - Math.sqrt( (Math.pow(b, 2) - 4 * (a * c)))) / (2 * a) ) );
    }
    else{
        console.log("no real roots");
    }
}
equationSolver(2,5,-3);
equationSolver(2,-4,2);
equationSolver(4,2,1);