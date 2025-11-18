let feedback = "Great product! Fast delivery and amazing sound quality!";

// Count words
let wordCount = feedback.split(" ").length;

// Check negativity
let isNegative = feedback.toLowerCase().includes("bad") ||
                 feedback.toLowerCase().includes("poor");

console.log("Words:", wordCount);

if (isNegative) {
  console.log("Needs Improvement");
} else {
  console.log("Positive Feedback");
}
