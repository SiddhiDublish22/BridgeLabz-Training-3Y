// Q1: Personalized Login Greeting

// Declare user name
let userName = "Siddhi";

// Get current hour
let currentHour = new Date().getHours();

// Determine greeting based on time
let greeting;
if (currentHour < 12) {
    greeting = `Good Morning ${userName}!`;
} else if (currentHour >= 12 && currentHour <= 17) {
    greeting = `Good Afternoon ${userName}!`;
} else {
    greeting = `Good Evening ${userName}!`;
}

// Display greeting
console.log(greeting);
