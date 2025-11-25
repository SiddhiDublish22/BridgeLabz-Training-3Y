"use strict";


(function q7() {
  console.log("\n--- Q7 Smart Calculator ---");

  class InvalidOperationError extends Error {}
  class MathDomainError extends Error {}

  function calculate(operation, a, b) {
    switch (operation) {
      case "add":
        return a + b;
      case "subtract":
        return a - b;
      case "divide":
        if (b === 0) throw new MathDomainError("Divide by zero");
        return a / b;
      case "power":
        return Math.pow(a, b);
      case "root":
        
        if (b % 2 === 0 && a < 0) throw new MathDomainError("Even root of negative number");
        return Math.pow(a, 1 / b);
      default:
        throw new InvalidOperationError(`Invalid operation: ${operation}`);
    }
  }

  const operations = ["add", "divide", "power", "root", "subtract", "unknown"];
  const num1 = 25, num2 = 0;

  operations.forEach(op => {
    try {
      const result = calculate(op, num1, num2);
      console.log(`Operation: ${op} | Inputs: (${num1}, ${num2}) | Result: ${result}`);
    } catch (err) {
      console.error(`Q7: Operation ${op} failed -> ${err.name}: ${err.message}`);
    }
  });
})();
