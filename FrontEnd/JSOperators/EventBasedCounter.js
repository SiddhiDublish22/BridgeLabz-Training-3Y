let count = 0;

function increment() {
  count++;
  console.log("Count:", count);

  function showNested() {
    console.log("Inside nested function →", count);
  }
  showNested();
}

function decrement() {
  count--;
  console.log("Count:", count);

  function showNested() {
    console.log("Inside nested function →", count);
  }
  showNested();
}

// Simulated clicks
increment();
increment();
decrement();
