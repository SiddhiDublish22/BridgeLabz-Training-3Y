"use strict";

const regex = {
  name: /^[A-Za-z ]+$/,
  email: /^[a-zA-Z0-9._%+-]+@[a-zA-Z.-]+\.[A-Za-z]{2,}$/,
  seats: /^[1-9]$|^10$/
};

function validate(value, pattern) {
  return pattern.test(value);
}

function bookTicket(name, email, seats) {
  if (!validate(name, regex.name)) return console.log("Invalid Name");
  if (!validate(email, regex.email)) return console.log("Invalid Email");
  if (!validate(seats, regex.seats)) return console.log("Invalid Seats");

  const ticket = { name, email, seats };
  console.log("Booking Successful:", ticket);
}

bookTicket("Ankit", "ankit@mail.com", "3");
