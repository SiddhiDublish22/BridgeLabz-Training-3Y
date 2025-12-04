function greetUser(name, callback) {
    console.log(`Hello ${name}`);
    callback(); // Execute callback
}

function showEndMessage() {
    console.log("Welcome to the course!");
}

// Demonstration
greetUser("Siddhi", showEndMessage);
