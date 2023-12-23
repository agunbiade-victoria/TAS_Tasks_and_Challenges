// If...Else...If Statement
const side1 = 15
const side2 = 12
const side3 = 9
if(side1 === side2 && side2 === side3){
    console.log('Equilateral triangle')
} else if (side1 === side2 || side1 === side3 || side2 === side3){
    console.log('Isosceles triangle')
} else {
    console.log('Scalene triangle')
}