var promiseToCleanRoom = new Promise(function (resolve, reject)
{
    isClean =false;
    if(isClean)
    {
        //resolve.apply('room is clean');
        resolve("room is clean");

    }else
        {
            //reject.apply('room is not cleaned');
            reject("room is dirty");
        }
});

promiseToCleanRoom.then(function (fromResolve)
{
   console.log('Room is cleaned ' + fromResolve) ;
}).catch(function (fromReject)
{
    console.log('room is not cleaned ' + fromReject);
});


let cleanRoom = function()
{
    return new Promise(function (resolve,reject) {

        console.log('room is clean');
        resolve(" clean  room ");
    });
};

let removeGarbage=function (message) {
   return new Promise(function (resolve,reject)
   {
        console.log('removing the garbage');
        resolve( message + ` Removing the garbage  ` );
   });
};

let winTheIceCream = function (message) {

    return new Promise(function (resolve,reject) {

        resolve(message+  ` won the ice-cream `);
    });
};

cleanRoom().then(function(result)
{
   return removeGarbage(result);
}).then(function (result)
{
    return winTheIceCream(result);
}).then(function (result) {

    console.log(result +  ` Wow!!!, won the ice cream `);
    alert( result + ` Wow!!!, won the ice cream `);
});

Promise.race([cleanRoom(),removeGarbage(),winTheIceCream()]).then(function () {
    alert("Some one has finished");
    console.log('Some one has finished');

});
Promise.all([cleanRoom(),removeGarbage(),winTheIceCream()]).then(function () {
    alert("all done in || ");
    console.log("all done in parallel");
});

