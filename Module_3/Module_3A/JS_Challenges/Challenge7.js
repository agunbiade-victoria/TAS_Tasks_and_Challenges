// Sort an array of strings in alphabetical order

function sortStringArray(stringArray) {
    let newArray = []
    const sorted = stringArray.sort();
    for (let i = 0; i < stringArray.length; i++) {
        newArray.push(stringArray[i].toLowerCase())
    }
    return newArray.sort()
}

console.log(sortStringArray(['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun']))