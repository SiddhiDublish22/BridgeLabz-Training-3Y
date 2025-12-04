function randomDelay(min = 1000, max = 2000) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

function maybeFail(probability = 0.2) {
  return Math.random() < probability;
}

function boilWater() {
  return new Promise((resolve, reject) => {
    const delay = randomDelay();
    console.log("Boiling water... (takes ~1-2s)");
    setTimeout(() => {
      if (maybeFail()) return reject(new Error("Boiler malfunction!"));
      console.log("Water boiled.");
      resolve("Boiled Water");
    }, delay);
  });
}

function brewCoffee(boiledWater) {
  return new Promise((resolve, reject) => {
    const delay = randomDelay();
    console.log("Brewing coffee... (takes ~1-2s)");
    setTimeout(() => {
      if (maybeFail()) return reject(new Error("Coffee grounds missing!"));
      console.log("Coffee brewed.");
      resolve("Brewed Coffee");
    }, delay);
  });
}

function pourIntoCup(coffee) {
  return new Promise((resolve, reject) => {
    const delay = randomDelay();
    console.log("Pouring into cup... (takes ~1-2s)");
    setTimeout(() => {
      if (maybeFail(0.1)) return reject(new Error("Cup dropped!"));
      console.log("Coffee poured into cup.");
      resolve("Cup of Coffee");
    }, delay);
  });
}

// Use Promise chaining as required
boilWater()
  .then(brewCoffee)
  .then(pourIntoCup)
  .then(() => {
    console.log("Coffee ready for the team!");
  })
  .catch((err) => {
    console.error("Coffee process failed:", err.message);
  });
