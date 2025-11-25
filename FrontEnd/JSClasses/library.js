"use strict";

class Book {
  constructor(title, author, isbn, isIssued = false) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isIssued = isIssued;
  }

  issueBook() {
    if (!this.isIssued) {
      this.isIssued = true;
      console.log(`Book Issued: ${this.title}`);
    } else {
      console.log("Already issued");
    }
  }

  returnBook() {
    this.isIssued = false;
    console.log(`Book Returned: ${this.title}`);
  }
}

const books = [
  new Book("Book A", "Author A", "111"),
  new Book("Book B", "Author B", "222"),
  new Book("Book C", "Author C", "333", true)
];

const availableBooks = books.filter(b => !b.isIssued);

console.log("Available Books:");
availableBooks.forEach(b => console.log(b.title));

function issueByISBN(isbn) {
  const book = books.find(b => b.isbn === isbn);
  if (book) book.issueBook();
  else console.log("Book not found");
}

issueByISBN("111");
