"use strict";


(function q10() {
  console.log("\n--- Q10 Nested Hoisting and Closures ---");

  console.log("Original example run:");

  function outer() {
    console.log("outer -> count (before var):", count); // var count is hoisted inside outer; value is undefined here
    var count = 5;
    function inner() {
      console.log("inner -> count (before var):", count); // inner has its own var count hoisted -> undefined
      var count = 10;
      console.log("inner -> count (after var):", count); // 10
    }
    inner();
    console.log("outer -> count (after inner):", count); // 5
  }

  outer();

 

  console.log("\nArrow inner function variant:");

  function outerArrowInner() {
    console.log("outerArrowInner -> count (before var):", countVar); // var hoisted to undefined
    var countVar = 5;

 
    const innerArrow = () => {
    
      console.log("innerArrow -> countVar (before local var):", innerCount); // innerCount hoisted -> undefined
      var innerCount = 10;
      console.log("innerArrow -> innerCount (after var):", innerCount); // 10
    };

    innerArrow();
    console.log("outerArrowInner -> countVar (after inner):", countVar); // 5
  }

  outerArrowInner();

})();
