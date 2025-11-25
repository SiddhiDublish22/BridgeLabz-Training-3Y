"use strict";


const employees = [
  { name: "Amit", salary: "45000", years: "5" },
  { name: "Sara", salary: "38000", years: "2" },
  { name: "Kiran", salary: "52000", years: "7" }
];

(function q2() {
  console.log("\n--- Q2 Employee Bonus Calculator ---");
  for (let i = 0; i < employees.length; i++) {
    try {
      const emp = employees[i];
      if (!emp || typeof emp !== "object") throw new Error("Employee record missing");

      // Validate required properties
      if (!("name" in emp)) throw new Error("Missing property: name");
      if (!("salary" in emp)) throw new Error("Missing property: salary");
      if (!("years" in emp)) throw new Error("Missing property: years");

      // Convert and validate numbers
      const salary = Number(emp.salary);
      const years = Number(emp.years);
      if (Number.isNaN(salary)) throw new TypeError(`Salary conversion failed for ${emp.name}`);
      if (Number.isNaN(years)) throw new TypeError(`Years conversion failed for ${emp.name}`);

      const bonus = years > 3 ? salary * 0.1 : salary * 0.05;

      console.log(`Employee: ${emp.name} | Salary: ${salary} | Years: ${years} | Bonus: ${bonus.toFixed(2)}`);
    } catch (err) {
      console.error(`Q2: Error processing employee at index ${i}: ${err.name} - ${err.message}`);
    }
  }
})();
