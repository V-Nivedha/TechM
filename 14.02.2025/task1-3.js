console.log("finding cube using let ");
let number1 = 5;
let cube = number1 ** 3;
console.log("The cube of " + number1 + " is: " + cube);

console.log("\n checking positive or negative usinmg var ");

var number2 = -3;
if (number2 > 0) {
  console.log(number2 + " is positive.");
} else if (number2 < 0) {
  console.log(number2 + " is negative.");
} else {
  console.log(number2 + " is zero.");
}
console.log("checking a number is prime or not  using const");

const number3 = 11;
let isPrime = true;

for (let i = 2; i <= Math.sqrt(number3); i++) {
  if (number3 % i === 0) {
    isPrime = false;
    break;
  }
}

if (isPrime && number3 > 1) {
  console.log(number3 + " is a prime number.");
} else {
  console.log(number3 + " is not a prime number.");
}
