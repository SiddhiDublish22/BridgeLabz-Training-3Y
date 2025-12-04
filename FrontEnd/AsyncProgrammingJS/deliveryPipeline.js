
function randDelay(min = 1000, max = 2000) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

function stepFactory(stepName, failProbability = 0.2) {
  return () =>
    new Promise((resolve, reject) => {
      const delay = randDelay();
      setTimeout(() => {
        if (Math.random() < failProbability) {
          reject(new Error(`${stepName} failed`));
        } else {
          resolve(`${stepName} succeeded`);
        }
      }, delay);
    });
}

const takeOrder = stepFactory("Order taken", 0.05);
const prepare = stepFactory("Food prepared", 0.15);
const pack = stepFactory("Package ready", 0.05);
const dispatch = stepFactory("Out for delivery", 0.1);
const deliver = stepFactory("Delivered", 0.08);

async function runPipeline() {
  console.log("Start Pipeline");
  try {
    console.log("Step 1: Order taken");
    await takeOrder();

    console.log("Step 2: Food prepared");
    await prepare();

    console.log("Step 3: Package ready");
    await pack();

    console.log("Step 4: Out for delivery");
    await dispatch();

    console.log("Delivery completed!");
  } catch (err) {
    console.error("Pipeline failed!");
    console.error("Reason:", err.message);
  } finally {
   
  }
}


runPipeline();
