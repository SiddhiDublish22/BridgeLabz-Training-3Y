// Q4: Academic Performance Evaluator

// Marks of 5 subjects
let marks = [88, 76, 92, 65, 70];

// Calculate total and average
let totalMarks = marks.reduce((sum, mark) => sum + mark, 0);
let average = totalMarks / marks.length;

// Check for any failing subject
let hasFailing = marks.some(mark => mark < 35);

let status;
if (hasFailing) {
    status = "Detained";
} else if (average >= 85) {
    status = "Promoted with Distinction";
} else if (average >= 50) {
    status = "Promoted";
} else {
    status = "Detained";
}

console.log(`Average Marks: ${average.toFixed(2)}%`);
console.log(`Status: ${status}`);
