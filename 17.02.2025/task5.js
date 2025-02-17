// Create the student object
let student = {
    id: 101,
    name: "Nivedha",
    department: "IT",
    college: "Panimalar Institute of Technology",
    email: "nivedha@example.com",
    

    displayDetails: function() {
        console.log(`ID: ${this.id}`);
        console.log(`Name: ${this.name}`);
        console.log(`Department: ${this.department}`);
        console.log(`College: ${this.college}`);
        console.log(`Email: ${this.email}`);
    },

  
    displayBasicDetails: function() {
        console.log(`ID: ${this.id}`);
        console.log(`Name: ${this.name}`);
        console.log(`Email: ${this.email}`);
    }
};


console.log("Displaying Full Details:");
student.displayDetails();

console.log("\nDisplaying Basic Details:");
student.displayBasicDetails();

student.address = {
    doorNo: "91",
    street: "rr Road",
    area: "Chennai",
    pincode: "600124"
};

student.displayDetailsWithAddress = function() {
    console.log(`ID: ${this.id}`);
    console.log(`Name: ${this.name}`);
    console.log(`Department: ${this.department}`);
    console.log(`College: ${this.college}`);
    console.log(`Address: ${this.address.doorNo}, ${this.address.street}, ${this.address.area} - ${this.address.pincode}`);
};

// Invoke the function to display details with address
console.log("\nDisplaying Details with Address:");
student.displayDetailsWithAddress();


delete student.email;
delete student.displayBasicDetails;

console.log("\nDisplaying Details After Deletion:");
student.displayDetailsWithAddress(); 
