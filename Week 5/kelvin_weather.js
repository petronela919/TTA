//  the variable "kelvin" is a "const" type because it will only hold the value "293"
const kelvin = 293;

//  the variable "celsius" is a "var" type because it gets it's value by making other operation (kelvin - 273). Converting Kelvin to Celsius degrees
var celsius = kelvin - 273;

//  the variable "farenheit" is a "let" type because late in the program it's value will change
let fahrenheit = celsius * (9 / 5) + 32;

//  we assigned to "fahrenheit" a new value, representig the "fahrenheit" decimal number rounded down
fahrenheit = Math.floor(fahrenheit);

console.log("The temperature is " + fahrenheit + " degrees Fahrenheit.");

//  11) 0 Kelvin = -460 Fahrenheit