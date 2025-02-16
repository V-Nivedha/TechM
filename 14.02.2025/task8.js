
let monday = 55;
let tuesday = 45;
let wednesday = 60;
let thursday = 48;
let friday = 52;
let saturday = 50;
let sunday = 47;

let totalPrice = monday + tuesday + wednesday + thursday + friday + saturday + sunday;


let averagePrice = totalPrice / 7;

console.log("\t\tto check the Profit of the tomato for 1 week")
if (averagePrice > 50) {
    console.log("\nTomato has given good profit!");
} else {
    console.log("\nNo profit from tomato.");
}
