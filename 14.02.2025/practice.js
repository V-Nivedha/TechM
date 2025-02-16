//if statement
const num = 5;
if (num > 0) {
	console.log("The number is positive.");
};

console.log("\n ~~~~~~~if else example~~~~~~~")
//if else stmnt
let num1 = -10;
if (num1 > 0)
	console.log("The number is positive.");
else
	console.log("The number is negative");
	
    console.log("\n ~~~~~~nested if example~~~~~~~~")
//nestedif
let weather = "sunny";
let temperature = 25;

if (weather == "sunny") {
    if (temperature > 30) {
        console.log("It's a hot day!");
    } else if (temperature > 20) {
        console.log("It's a warm day.");
    } else {
        console.log("It's a bit cool today.");
    }
} else if (weather === "rainy") {
    console.log("Don't forget your umbrella!");
} else {
    console.log("Check the weather forecast!");
};

console.log("\n ~~~~~if else if example~~~~~~~")
//if-else-if
const temp = 25;
if (temp > 30) {
    console.log("It's hot.");
} else if (temp >= 20) {
    console.log("It's warm.");
} else {
    console.log("It's cold.");
}
console.log("\n ~~~~~~~~switch example~~~~~~~~~~")

//switch-case
let num2 = 5;

switch (num2) {
	case 0:
		console.log("Number is zero.");
		break;
	case 1:
		console.log("Nuber is one.");
		break;
	case 2:
		console.log("Number is two.");
		break;
	default:
		console.log("Number is greater than 2.");
};

console.log("\n ~~~~~~~Ternary operator example~~~~~~~~~~")
//ternary operator
let num3 = 10;

let result = num3 >= 0 ? "positive" : "Negative";

console.log(`The number is.` ,result);
console.log("\n for example")

//for loop
for (let i = 21; i <= 40; i++) {
  if (i % 2 == 0) {
    console.log(i);
  }
};
console.log("\n ~~~~~~~~~~while example~~~~~~~~~~~~")

//while
let i1 = 11;
while (i1 <= 15) {
    console.log(i1);
    i1++;
}
console.log("\n ~~~~~~~~Do while example~~~~~~~~~")

//do while
let i2 = 36;
do {
    if(i2%4==0)
    console.log(i2);
    i2++;
} while (i2 <= 35);

console.log("\n ~~~~~~~return example~~~~~~~")
//return
function add(a, b) {
    return a + b;
}
const res = add(55, 63);
console.log(res);

console.log("\n ~~~~~~~~~break and continue example~~~~~~~~")

//break and continue
for (let i = 1; i <= 5; i++) {
    if (i === 3) break;
    console.log(i);
}

for (let i = 1; i <= 5; i++) {
    if (i === 3) continue;
    console.log(i);
}