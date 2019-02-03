// Print out the n-th entry in the fibonacci series.

function memoize(fn) {
  const cache = {};
  return function (...args) {
    //check if this arg called
    if (cache[args]) {
      return cache[args];
    }
    const result = fn.apply(this, args);
    cache[args] = result;

    return result;
  };
}

//if only use slowFib time complexity will be exponential runtime :(
function slowFib(n) {
  if (n < 2) {
    return n;
  }
  return fib(n - 1) + fib(n - 2);
}

const fib = memoize(slowFib);

module.exports = fib;

// iterative, linear runtime   
// function fib(n) {
//   const result = [0, 1];

//   for (let i = 2; i <= n; i++) {
//     const a = result[i - 1];//get 1
//     const b = result[i - 2];//get 0

//     result.push(a + b);
//   }

//   return result[n];
// }