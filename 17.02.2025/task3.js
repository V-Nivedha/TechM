function SumEvenOrOdd(num) {
    let sum = 0;
    while (num > 0) {
        sum += num % 10; 
         num = parseInt(num/10); 
    }
    
    console.log(`Sum of digits: ${sum}`);
    if(sum%2==0){
        console.log("the sum of given number is even")
    }
    else{
        console.log("the sum of  given  number is odd")
    }
}


SumEvenOrOdd(1234); 