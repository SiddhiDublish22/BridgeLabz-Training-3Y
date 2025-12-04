function serverA() {
  return new Promise((resolve, reject) => {
    const delay = 2000;
    setTimeout(() => {
      if (Math.random() < 0.15) return reject(new Error("Server A failed"));
      resolve("Server A deployed (2s)");
    }, delay);
  });
}

function serverB() {
  return new Promise((resolve, reject) => {
    const delay = 3000;
    setTimeout(() => {
      if (Math.random() < 0.15) return reject(new Error("Server B failed"));
      resolve("Server B deployed (3s)");
    }, delay);
  });
}

// Promise.all -> wait for both
Promise.all([serverA(), serverB()])
  .then((results) => {
    console.log("Deployment completed for all servers");
    console.log(results);
  })
  .catch((err) => {
    console.error("One or more servers failed during full deployment:", err.message);
  });

// Promise.race -> first to respond or fail
Promise.race([serverA(), serverB()])
  .then((firstResult) => {
    console.log("Fastest response:", firstResult);
  })
  .catch((err) => {
    console.error("Fastest response resulted in failure:", err.message);
  });
