// return an integer that is the reverse ordering of numbers

function reverseInt(number) {
    //convert int to string first
    const reversed = number
        .toString()
        .split('')
        .reverse()
        .join('');

    //back to int and maintained the sign by using math.sign function
    return parseInt(reversed) * Math.sign(number);
}

module.exports = reverseInt;