let year = 2024;
let month = "february";

let year1 = 2025;
let month1 = "March";
LeapYear(year1, month1);
LeapYear(year, month);
function LeapYear(year, month) {
  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
    if (month == "february") {
      console.log(
        "The year " +
          year +
          " is a leap year and the month is February with 29 days."
      );
    } else {
      console.log(
        "The year " + year + " is a leap year and the month is not February."
      );
    }
  } else {
    console.log("The given year " + year + " is not a leap year.");
  }
}
