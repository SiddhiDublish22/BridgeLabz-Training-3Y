"use strict";


const transactions = [
  { id: 1, amount: 2000 },
  { id: 2, amount: -500 },
  { id: 3 },
  null
];

(function q3() {
  console.log("\n--- Q3 Transaction Validator ---");

  // Custom errors
  class TransactionError extends Error {}
  class NegativeAmountError extends TransactionError {}
  class MissingFieldError extends TransactionError {}
  class NullEntryError extends TransactionError {}

  const valid = [];
  const invalid = [];

  for (let i = 0; i < transactions.length; i++) {
    try {
      const t = transactions[i];
      if (t === null) throw new NullEntryError("Transaction entry is null");
      if (typeof t !== "object") throw new TransactionError("Invalid transaction type");
      if (!("id" in t)) throw new MissingFieldError("Missing id");
      if (!("amount" in t)) throw new MissingFieldError("Missing amount");
      if (typeof t.amount !== "number") throw new TypeError("Amount must be a number");
      if (t.amount < 0) throw new NegativeAmountError("Negative amount is not allowed");

      // Passed all checks
      valid.push(t);
      console.log(`Valid transaction: id=${t.id}, amount=${t.amount}`);
    } catch (err) {
      invalid.push({ index: i, name: err.name, message: err.message });
      console.error(`Q3: Invalid transaction at index ${i}: ${err.name} - ${err.message}`);
    }
    
  }

  console.log("\nQ3 Summary:");
  console.log("Successful transactions:", valid.length, valid);
  console.log("Failed transactions:", invalid.length, invalid);
})();
