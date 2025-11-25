"use strict";

let user = {
  name: "John",
  email: "john@mail.com",
  age: 21
};

function updateUser(key, value) {
  if (user.hasOwnProperty(key)) {
    user[key] = value;
    console.log("Updated:", user);
  } else {
    console.log("Invalid Field");
  }
}

updateUser("name", "Johnny");
updateUser("age", 25);
