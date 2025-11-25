"use strict";

class Product {
  constructor(id, name, price, category) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.category = category;
  }

  applyDiscount(percent) {
    this.price = this.price - (this.price * percent) / 100;
  }

  getDetails() {
    return `ID: ${this.id} | ${this.name} | ₹${this.price} | ${this.category}`;
  }
}

const products = [
  new Product(1, "Laptop", 55000, "Electronics"),
  new Product(2, "Mouse", 500, "Accessories"),
  new Product(3, "Shoes", 1500, "Fashion"),
  new Product(4, "Bag", 800, "Fashion")
];

const expensiveProducts = products.filter(p => p.price > 1000);

expensiveProducts.forEach(p => console.log(p.getDetails()));
