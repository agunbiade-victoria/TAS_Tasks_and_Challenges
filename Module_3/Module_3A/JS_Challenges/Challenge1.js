// Calculate the sum of numbers within an array

function sumArray (arr) {
    let total = 0;

    for (i = 0; i < arr.length; i++) {
        total += arr[i];
    }
    return total;
}

console.log(sumArray([17,3,5]))

