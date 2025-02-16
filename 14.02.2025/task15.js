function displayNumbers(start, end) {
  for (let i = start; i <= end; i++) {
    if (i % 5 === 0) {
      continue;
    }
    console.log(i);
  }
}

displayNumbers(50, 100);
