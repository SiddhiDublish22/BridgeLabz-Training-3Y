let isDoorLocked = true;
let isWindowClosed = true;
let isAlarmOn = true;
let isOwnerInside = true;

if (isDoorLocked && isWindowClosed && isAlarmOn && isOwnerInside) {
  console.log("Secure");
} else {
  console.log("Unsafe");
}

// Test different values
isOwnerInside = false;
console.log("After changing owner status →",
  isDoorLocked && isWindowClosed && isAlarmOn && isOwnerInside ? "Secure" : "Unsafe"
);
