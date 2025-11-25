"use strict";

(function q4() {
  console.log("\n--- Q4 Debugging Mystery ---");


  // Fixed:
  function showMessage() {
   
    let greeting = "Welcome";
    
    console.log("Q4: greeting ->", greeting);
  }

  showMessage();

  // Explanation (console):
  console.log("Q4: Explanation -> In strict mode, assignment to an undeclared variable throws a ReferenceError. Declaring with let/const/var ensures the variable is created in the appropriate scope.");
})();
