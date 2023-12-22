// Create a length converter function

function converter(ft) {
    const results = {
    meters: ft * 0.3048,
    cm: ft * 30.48,
    inch: ft * 12,
    yard: ft * 0.333,
};

return results;
}

console.log(converter(8));

