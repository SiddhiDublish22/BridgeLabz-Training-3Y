
function submitOrder(orderData) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const success = Math.random() >= 0.5; // 50% chance success
      if (success) resolve("Order submitted successfully");
      else reject(new Error("Network / server error"));
    }, 800);
  });
}

async function processOrder(orderData) {
  const maxAttempts = 3;
  for (let attempt = 1; attempt <= maxAttempts; attempt++) {
    try {
      const result = await submitOrder(orderData);
      console.log(`Attempt ${attempt}: Success -> ${result}`);
      return result; // done
    } catch (err) {
      console.warn(`Attempt ${attempt}: Failed -> ${err.message}`);
      if (attempt === maxAttempts) {
        throw new Error("Order could not be processed");
      }
      // optional: small delay between attempts
      await new Promise((r) => setTimeout(r, 500));
    }
  }
}


(async () => {
  try {
    await processOrder({ itemId: 123, qty: 1 });
    console.log("Order processing complete.");
  } catch (err) {
    console.error(err.message);
  }
})();
