//return a new string with reversed order of characters

//Solution 1
function reverseString(str) {
    //use reduce helper from es5.
    //reduce syntax => arr.reduce(callback[, initialValue])
    return str.split('').reduce((reversed, char) => char + reversed, '');
}

reverseString('adqet');

// //Solution 2
// function reverseStringAlt1(str) {
//     //use for loop
//     let reversed = '';
//     for (let character of str) {
//         reversed = character + reversed;
//     }
//     return reversed;
// }

// //Solution 3
// function reverseStringAlt2(str) {
//     //convert string to array
//     //use join to turn it to string
//     return str.split('').reverse().join('');
// }

module.exports = reverseString;
