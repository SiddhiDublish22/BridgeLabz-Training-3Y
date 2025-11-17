// Q3: Monthly Expense Tracker

// Expenses for 5 categories
let expenses = {
    food: 5000,
    travel: 2000,
    rent: 8000,
    bills: 3000,
    leisure: 1500
};

// Calculate total
let totalExpense = expenses.food + expenses.travel + expenses.rent + expenses.bills + expenses.leisure;

// Calculate average
let averageExpense = totalExpense / 5;

// Add 10% tax
let totalWithTax = totalExpense * 1.1;

// Round values
totalExpense = totalExpense.toFixed(2);
averageExpense = averageExpense.toFixed(2);
totalWithTax = totalWithTax.toFixed(2);

// Display results
console.log(`Total Expense: ₹${totalExpense}`);
console.log(`Average Expense: ₹${averageExpense}`);
console.log(`Total After Tax: ₹${totalWithTax}`);
