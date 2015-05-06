function myFunction(r) {
    return (Math.PI * Math.pow(r, 2));
}
var radius = prompt("Radius");
document.write("r = " + radius + " area = " + myFunction(radius));