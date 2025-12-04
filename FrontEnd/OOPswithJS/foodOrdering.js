const menu = {
  pizza: 200,
  burger: 100,
  pasta: 150
};

function calculateBill(orderItems) {
  try {
    const prices = orderItems.map(item => {
      if (!menu[item]) throw new Error(`Invalid item: ${item}`);
      return menu[item];
    });

    const total = prices.reduce((sum, p) => sum + p, 0);
    console.log("Total Bill:", total);
  } catch (err) {
    console.log("Error:", err.message);
  }
}

calculateBill(["pizza", "burger"]);
calculateBill(["pizza", "momos"]); // error
