"use strict";


const apiData = ["25", "true", "false", "NaN", " ", "100px", "3.14", null, undefined];

(function q1() {
 
  function toNumberStrict(value) {
    // Guard for null/undefined
    if (value === null || value === undefined) return NaN;
    // Strings that are only whitespace are invalid
    if (typeof value === "string" && value.trim() === "") return NaN;
    
    if (typeof value === "string" && !/^\s*[+-]?(\d+(\.\d+)?|\.\d+)\s*$/.test(value)) return NaN;
    return Number(value);
  }

  const validNumbers = [];
  const invalidNumbers = [];
  const report = [];

  for (let i = 0; i < apiData.length; i++) {
    const raw = apiData[i];
    const asNumber = toNumberStrict(raw);
    const asBoolean = Boolean(raw); // JS coercion
    const asString = String(raw);

    report.push({ index: i, raw, asNumber, asBoolean, asString });

    if (!Number.isNaN(asNumber)) {
      validNumbers.push(asNumber);
    } else {
      invalidNumbers.push({ index: i, raw });
      console.log(`Q1: Invalid number at index ${i}:`, raw);
    }
  }

  console.log("\n--- Q1 Report ---");
  report.forEach(r => {
    console.log(`Index ${r.index} | raw:`, r.raw, `| Number:`, r.asNumber, `| Boolean:`, r.asBoolean, `| String: '${r.asString}'`);
  });
  console.log("Valid numeric data:", validNumbers);
  console.log("Invalid numeric entries:", invalidNumbers);
})();
