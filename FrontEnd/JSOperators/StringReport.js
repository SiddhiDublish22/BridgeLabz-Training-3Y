let product = "   wireless headphones PRO   ";

// Trim
let cleaned = product.trim().toLowerCase();

// Capitalize first letter of each word
cleaned = cleaned
  .split(" ")
  .map(word => word.charAt(0).toUpperCase() + word.slice(1))
  .join(" ");

// Replace "Pro" → "Pro Edition"
cleaned = cleaned.replace("Pro", "Pro Edition");

console.log("Cleaned Title:", cleaned);
console.log("Length:", cleaned.length);
