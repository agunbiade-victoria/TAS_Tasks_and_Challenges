// Print a table containing multiplication tables

function multiplicationTable(number) {
    for (let i = 1; i <= 20; i++) {
        console.log(`${number} * ${i} = ${number * i}`);
    }
}
multiplicationTable(9);