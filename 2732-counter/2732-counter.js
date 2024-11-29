/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    // Define and return a function (closure) that captures `n`
    return function() {
        // Return the current value of `n` and then increment it by 1 for the next call
        return n++;
    };
};
/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */