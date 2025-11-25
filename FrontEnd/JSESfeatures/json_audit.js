"use strict";


const rawData = [
  '{"user":"Alex","age":25}',
  '{"id":2}',
  '{invalid}',
  '{"user":"Mina","age":"22"}'
];

(function q9() {
  console.log("\n--- Q9 JSON Audit ---");

  const clean = [];
  const errors = [];

  for (let i = 0; i < rawData.length; i++) {
    const line = rawData[i];
    try {
      const parsed = JSON.parse(line);

      // Check required keys
      if (!("user" in parsed)) throw new Error("Missing key: user");
      if (!("age" in parsed)) throw new Error("Missing key: age");

      // Convert age to number
      const ageNum = Number(parsed.age);
      if (Number.isNaN(ageNum)) throw new TypeError("Age is not a number");

      parsed.age = ageNum;
      clean.push(parsed);
      console.log(`Q9: Parsed line ${i}:`, parsed);
    } catch (err) {
      errors.push({ line: i, raw: line, error: err.name + ": " + err.message });
      console.error(`Q9: Error parsing line ${i}: ${err.name} - ${err.message}`);
    }
  }

  // Bonus: filter under-18
  const adults = clean.filter(u => u.age >= 18);
  const minors = clean.filter(u => u.age < 18);

  console.log("\nQ9 Summary:");
  console.log("Clean entries:", clean);
  console.log("Errors:", errors);
  console.log("Adults (>=18):", adults);
  console.log("Minors (<18):", minors);
})();
