const chooseOperation = () => {
   
    const add = function(a,b){
      return a+b;
    }
    const subtract = function(a,b){
       return a-b;
     }
     const multiply = function(a,b){
        return a*b;
     }
    const divide =function(a,b) {
        b !== 0 ? `Quotient: ${Math.floor(a / b)}, Remainder: ${a % b}` : "Cannot divide by zero";
    } 

    let num1 = 15
    let num2 = 20

    let result='';
    let operation = "multiply";
    switch (operation) {
        case "add":
            result = add(num1, num2);
            break;
        case "subtract":
            result = subtract(num1, num2);
            break;
        case "multiply":
            result = multiply(num1, num2);
            break;
        case "divide":
            result = divide(num1, num2);
            break;
        default:
            result = "Invalid operation!";
    }

    console.log(result);
};

// Call the function
chooseOperation();
