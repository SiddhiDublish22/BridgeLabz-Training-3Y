"use strict";

(function q6() {
  console.log("\n--- Q6 Pyramid Pattern Generator ---");

  
  function generatePyramid(limit = 5) {
    console.log(`Q6: Generating pyramid with limit = ${limit}`);
    for (let row = 1; row <= limit; row++) {
      // Build row using an inner loop
      let line = "";
      for (let col = 1; col <= row; col++) {
        line += "* ";
      }
      console.log(line.trim());
    }
  }

  // Run with default and with a smaller value
  generatePyramid();     // default 5
  generatePyramid(4);    // explicit


  console.log("\nQ6 observation (var vs let in closures):");
  const funcsLet = [];
  for (let i = 0; i < 3; i++) {
    funcsLet.push(() => console.log("let capture i:", i)); // each gets its own binding
  }
  funcsLet.forEach(f => f()); // outputs 0,1,2

  const funcsVar = [];
  for (var j = 0; j < 3; j++) {
    funcsVar.push(() => console.log("var capture j:", j)); // var is function-scoped => shared binding
  }
  funcsVar.forEach(f => f()); // outputs 3,3,3

  console.log("Q6 note: Using 'use strict' will throw if you forget to declare loop variables (e.g., `for (i=0...)` would break).");
})();
