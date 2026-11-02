// hoisting is a mechanism in js where js read code declaration before it execution.
let a;
console.log(a);

// setTimeout(() => {
//     console.log(a);
// }, 2000);
a = 10;