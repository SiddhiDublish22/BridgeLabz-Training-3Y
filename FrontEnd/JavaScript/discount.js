// Q6: Progressive Discount System

// Input total purchase amount
let totalPurchase = 7200;
let discount = 0;

// Determine discount
if (totalPurchase >= 10000) {
    discount = 25;
} else if (totalPurchase >= 5000) {
    discount = 15;
} else if (totalPurchase >= 2000) {
    discount = 5;
} else {
    discount = 0;
}

// Calculate final price
let finalPrice = totalPurchase * (1 - discount / 100);

// Round final price
finalPrice = Math.round(finalPrice);

// Display summary
console.log(`Original Total: ₹${totalPurchase}`);
console.log(`Discount: ${discount}%`);
console.log(`Final Price: ₹${finalPrice}`);
