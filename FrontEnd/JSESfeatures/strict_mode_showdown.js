"use strict";


(function q8() {
  console.log("\n--- Q8 Strict Mode Showdown ---");

  function demoCorrect(a, b) {
    "use strict"; // explicitly inside function (optional here)
    let total = 10;
   
    return a + b + total;
  }

  console.log("Q8: demoCorrect(5,10) ->", demoCorrect(5, 10));

  // Explanation printed:
  console.log("Q8: Explanation -> Strict mode forbids duplicate formal parameters, prevents accidental globals (assigning to undeclared names), and restricts delete on variables. Use declared variables (let/const/var) and distinct parameter names.");
})();
