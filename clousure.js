// closure is a function that has access to its outer function scope even after the outer function has completed its execution.

function outer() {

    var count=0;
    function inner(){
        count++;
        console.log(count);
    }
    return inner;
    
}
const inner=outer();
inner();
inner();