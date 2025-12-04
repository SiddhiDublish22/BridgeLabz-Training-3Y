
function doStageCallback(stageName, cb) {
  setTimeout(() => {
    console.log(`Stage: ${stageName}`);
    cb();
  }, 1000);
}


function runPipelineWithCallbacks() {
  console.log("Running pipeline (callbacks)...");
  doStageCallback("design", () => {
    doStageCallback("build", () => {
      doStageCallback("test", () => {
        doStageCallback("deploy", () => {
          doStageCallback("celebrate", () => {
            console.log("Pipeline (callbacks) finished.");
          });
        });
      });
    });
  });
}


function doStagePromise(stageName) {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log(`Stage: ${stageName}`);
      resolve();
    }, 1000);
  });
}

async function runPipelineAsync() {
  console.log("Running pipeline (async/await)...");
  try {
    await doStagePromise("design");
    await doStagePromise("build");
    await doStagePromise("test");
    await doStagePromise("deploy");
    await doStagePromise("celebrate");
    console.log("Pipeline (async/await) finished.");
  } catch (err) {
    console.error("Pipeline failed:", err.message);
  }
}

// Demonstration:
runPipelineWithCallbacks(); // shows callback hell structure
setTimeout(() => {
 
  runPipelineAsync();
}, 7000);

