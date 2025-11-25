"use strict";

console.log("\n--- Q5 Hoisting Lab ---");

(function q5_fixed() {
  console.log("Q5 fixed version:");
  function announce() { console.log("Game started"); } // hoisted normally
  let status = "ready"; // initialize before using
  function startGame() { console.log("Status:", status); }
  var score = 50; // var is fine here, but initialized before use for clarity
  console.log("score =", score);
  announce();
  startGame();
})();


(function q5_arrow() {
  console.log("\nQ5 arrow-function version:");
 
  const announce = () => console.log("Game started (arrow)");
  const startGame = () => console.log("Status (arrow):", status);
  const score = 50;
  const status = "ready";
  console.log("score (const) =", score);
  announce();
  startGame();
})();


