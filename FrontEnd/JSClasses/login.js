"use strict";

const loginPatterns = {
  username: /^.{5,}$/,
  password: /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[\W_]).{8,}$/
};

function validateLogin(username, password) {
  if (!loginPatterns.username.test(username))
    return console.log("Username must be at least 5 characters");

  if (!loginPatterns.password.test(password))
    return console.log("Password must contain uppercase, lowercase, number, special character");

  console.log("Login Successful");
}

validateLogin("admin1", "Abc@1234");
