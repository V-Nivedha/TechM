function factors(a) {
  for (let i = 1; i <= a; i++) {
    if (a % i == 0) {
      console.log(i);
    }
  }
}
factors(15);
