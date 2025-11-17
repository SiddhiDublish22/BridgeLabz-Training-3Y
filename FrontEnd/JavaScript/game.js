// Q7: Smart Guessing Game

// Generate secret number
let secretNumber = Math.floor(Math.random() * 50) + 1;

// Test user guess
let userGuess = 27;

if (userGuess === secretNumber) {
    console.log("Correct guess!");
} else if (Math.abs(userGuess - secretNumber) <= 3) {
    console.log("Very close!");
} else if (userGuess > secretNumber) {
    console.log("Too high");
} else {
    console.log("Too low");
}

// For testing, show the secret number
console.log(`Secret Number was: ${secretNumber}`);
