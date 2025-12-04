const products = [
  { id: 1, name: "Phone", category: "Electronics", price: 20000, stock: 5 },
  { id: 2, name: "Shoes", category: "Fashion", price: 2000, stock: 2 },
  { id: 3, name: "Laptop", category: "Electronics", price: 50000, stock: 10 },
  { id: 4, name: "Watch", category: "Fashion", price: 1500, stock: 1 }
];

// 1. Low stock
function getLowStockProducts() {
  return products.filter(p => p.stock < 3);
}

// 2. Sort by price
function sortProductsByPrice() {
  return [...products].sort((a, b) => a.price - b.price);
}

// 3. Total Inventory Value
function calculateTotalInventoryValue() {
  return products.reduce((sum, p) => sum + (p.price * p.stock), 0);
}

// 4. Group by Category
function groupByCategory() {
  return products.reduce((group, p) => {
    if (!group[p.category]) group[p.category] = [];
    group[p.category].push(p);
    return group;
  }, {});
}

console.log(getLowStockProducts());
console.log(sortProductsByPrice());
console.log(calculateTotalInventoryValue());
console.log(groupByCategory());
