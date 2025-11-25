"use strict";

class Cart {
  constructor() {
    this.items = [];
  }

  addItem(name, price, qty) {
    this.items.push({ name, price, qty });
  }

  getTotal() {
    return this.items.reduce((t, i) => t + i.price * i.qty, 0);
  }

  applyCoupon(code) {
    const regex = /^(SAVE|DISC)(\d{1,2})$/;
    const match = code.match(regex);

    if (!match) {
      console.log("Invalid Coupon");
      return this.getTotal();
    }

    const discountPercent = Number(match[2]);
    const total = this.getTotal();
    const finalTotal = total - (total * discountPercent) / 100;

    console.log(`Coupon Applied: ${discountPercent}% Off`);
    return finalTotal;
  }
}

const cart = new Cart();
cart.addItem("Shoes", 2000, 1);
cart.addItem("Bag", 500, 2);

console.log("Total =", cart.getTotal());
console.log("Final Total =", cart.applyCoupon("SAVE20"));
