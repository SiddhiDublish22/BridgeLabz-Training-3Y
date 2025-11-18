// Global variable
let bonus = 5000;

function calculateSalary(isPermanent) {
  // Local variable
  let salary = 40000;

  // Add bonus only if isPermanent is true
  if (isPermanent) {
    salary += bonus;
  }

  console.log(`Total Salary: ${salary}`);
}

// Test Cases
console.log("---- When Permanent ----");
calculateSalary(true);

console.log("---- When Not Permanent ----");
calculateSalary(false);

// Demonstrating scope
console.log("Global Bonus Still:", bonus);
