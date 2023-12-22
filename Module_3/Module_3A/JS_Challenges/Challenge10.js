// Remove negative numbers from array

function filterNegatives(array) {
    return array.filter(function(num) {
        return num > 0
    })
}
console.log(filterNegatives([47, 1, -5, 90, -82, 1, -1123]))