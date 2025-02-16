const first = 7;   
const second = 20; 
const third = second + 40;

console.log(`Multiples of ${first} from ${second} to ${third}:`);

let num = second;
while (num <= third) {
    if (num % first === 0) {
        process.stdout.write(num + " ");
    }
    num++;
}
