function displayNumbers(start, end) {
  for (let i = start; i <= end; i++) {
    if (i % 7 === 0) {
      break;
    }
    console.log(i);
  }
}

displayNumbers(80, 110);
