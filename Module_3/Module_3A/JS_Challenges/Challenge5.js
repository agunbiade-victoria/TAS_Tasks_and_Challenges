// Sort an array of numbers in descending order

function sortNumArray(numArray) {
    function compare(a, b) {
        return b - a
    }
    const sorted = numArray.sort(compare)
    return sorted
}

console.log(sortNumArray([30, 400, 1003, 201, 8]))