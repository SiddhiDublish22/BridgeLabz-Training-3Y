function applyOperation(numbers, operation) {
    let result = [];
    for (let num of numbers) {
        result.push(operation(num));
    }
    return result;
}

// Double
const doubled = applyOperation([1, 2, 3, 4], num => num * 2);
console.log("Doubled:", doubled);

// Square
const squared = applyOperation([1, 2, 3, 4], num => num * num);
console.log("Squared:", squared);
