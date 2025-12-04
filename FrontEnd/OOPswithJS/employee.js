class Employee {
  constructor(name, department) {
    this.name = name;
    this.department = department;
  }
  work() {
    return `${this.name} works in ${this.department}`;
  }
}

class Manager extends Employee {
  work() {
    return `${this.name} manages the ${this.department}`;
  }
}

const e = new Employee("Aman", "IT");
const m = new Manager("Riya", "Sales");

console.log(e.work());
console.log(m.work());
