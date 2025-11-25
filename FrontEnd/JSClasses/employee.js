"use strict";

class Employee {
  constructor(id, name, department, salary) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  getAnnualSalary() {
    return this.salary * 12;
  }

  applyBonus(percent) {
    this.salary += (this.salary * percent) / 100;
  }
}

const employees = [
  new Employee(1, "A", "IT", 30000),
  new Employee(2, "B", "HR", 25000),
  new Employee(3, "C", "Sales", 28000),
  new Employee(4, "D", "IT", 35000),
  new Employee(5, "E", "Finance", 40000)
];

employees.forEach(emp => {
  console.log(emp.name, emp.getAnnualSalary());
});

const totalPayout = employees.reduce(
  (sum, emp) => sum + emp.getAnnualSalary(),
  0
);

console.log("Total Annual Payout =", totalPayout);
