var name ="manish";
alert(name);

let x = function () {
    console.log("i reached here");
}

let y = function (callback) {
    console.log("doing something here ");
    callback();
}

y(x);

let add = function (a,b) {
    return a+b;
}

let multiply = function (a,b) {
    return a*b;
}

let doNothing=function (a,b) {

    console.log(`here is your two numbers ${a}  ${b}` );
}

let doSomeMath = function (a,b,callback) {
    if (typeof callback ==="function")
    {
        return callback(a,b);
    }
    console.log("third argument is not function");

}

console.log(doSomeMath(5,2,add));
console.log(doSomeMath(5,2,multiply));
console.log(doSomeMath(5,2,doNothing));
// dynamic function functions are first class citizen in java script;
console.log(doSomeMath(4,5,function(a,b){ return a*b+5;}));
console.log(doSomeMath(4,5,4));

var myArray=[{quantity:5,vegitable:'cabbage'},
    {quantity:1,vegitable:'apple'},
    {quantity:10,vegitable:'bannana'}];

myArray.sort(function (a,b){

    if (a.quantity >b.quantity)
    {

        return 1;
    }
    return -1;
});

console.log(myArray);