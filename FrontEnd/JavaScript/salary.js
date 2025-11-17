// Q8: Employee Salary Projection

let currentSalary = 50000; // Starting salary
let incrementRate = 10;    // Annual increment in %

console.log("Yearly Salary Projection:");

for (let year = 1; year <= 5; year++) {
    // Apply increment
    currentSalary += currentSalary * (incrementRate / 100);
    console.log(`Year ${year}: ₹${Math.round(currentSalary)}`);
}
