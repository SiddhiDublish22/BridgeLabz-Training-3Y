const departments = [
  ["HR", 72],
  ["Finance", 88],
  ["Tech", 95],
  ["Support", 63]
];

departments.forEach(dep => {
  let dept = dep[0];
  let score = dep[1];

  let remark = "";

  if (score >= 90) {
    remark = "Excellent";
  } else if (score >= 75) {
    remark = "Good";
  } else if (score >= 60) {
    remark = "Average";
  } else {
    remark = "Needs Improvement";
  }

  console.log(`${dept}: ${remark}`);
});
