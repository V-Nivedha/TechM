
let student = {
    name: "Nivi",
    age: 21,
    course: "Information Techhnology",
    displayInfo: function() {
        console.log(`Name: ${this.name}, Age: ${this.age}, Course: ${this.course}`);
    }
};


console.log("Initial Object:");
student.displayInfo();


student.address = {
    city: "Paris",
    zip: "10001"
};

student.updateAge = function(newAge) {
    this.age = newAge;
    console.log(`Updated Age: ${this.age}`);
};

student.getCity = function() {
    console.log(`City: ${this.address.city}`);
};

console.log("\nAfter Adding Nested Object and Functions:");
student.displayInfo();
student.updateAge(21);
student.getCity();
console.log(`Address: ${student.address.city}, ZIP: ${student.address.zip}`);


delete student.course;
delete student.updateAge;


console.log("\nAfter Removing a Property and a Function:");
console.log(student);
student.displayInfo(); 

student.getCity();
