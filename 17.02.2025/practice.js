
function myFunction()
{
console.log("Inside Function!")
}

myFunction()

function sum(x, y) { 
    return x + y; 
}
console.log(sum(6, 9));

var sum = function (x, y) {
    return x + y;
};
console.log(sum(4, 5));

let sum1 = (a, b) => a + b;
console.log(sum1(1, 2)) 


var sum = function (x, y) {
    return x + y;
};
console.log(sum(4, 5));

 person1 = {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue"};
console.log(person1)

const person5 = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
  eyeColor: "blue"
};
console.log(person5)
// Create an Object
const person2 = {};

// Add Properties
person2.firstName = "John";
person2.lastName = "Doe";
person2.age = 50;
person2.eyeColor = "blue";
//console.log(person)


let age = person2.age;
console.log(person2.firstName + " is " + person2.age + " years //old.");


let age1 = person2["age"];
console.log(person2["firstName"] + " is " + person2["age1"] + " years old.");


let x = "firstName";
let y = "age";
console.log(person2[x] + " is " + person2[y] + " years old.");


person2.nationality = "English";
console.log(person2);

delete person2.age;
console.log(person2);


myObj = {
  name:"John",
  age:30,
  myCars: {
    car1:"Ford",
    car2:"BMW",
    car3:"Fiat"
  }
}

var car = myObj.myCars.car3;
console.log(car)

console.log(myObj.myCars["car2"]);

console.log(myObj["myCars"]["car2"]);

let p1 = "myCars";
let p2 = "car2";
console.log(myObj[p1][p2]);
const person7 = {
  firstName: "John",
  lastName: "Doe",
  id: 5566,
  fullName: function() {
    return this.firstName + " " + this.lastName;
  }
};

name = person7.fullName();
console.log("Full name: "+person7.fullName())
console.log("fullName function definition: "+person7.fullName);