

function fetchBugs(callback) {
  setTimeout(() => callback(["UI glitch", "API timeout", "Login failure"]), 1000);
}

// Promise-based version
function getBugs() {
  const shouldFail = Math.random() < 0.25; // 25% chance to fail
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (shouldFail) return reject(new Error("Failed to fetch bugs from server"));
      resolve(["UI glitch", "API timeout", "Login failure"]);
    }, 1000);
  });
}

// Usage:
getBugs()
  .then((bugs) => {
    // Display in a neat table
    console.table(bugs.map((b, i) => ({ id: i + 1, bug: b })));
  })
  .catch((err) => {
    console.error("Error loading bugs:", err.message);
  });


