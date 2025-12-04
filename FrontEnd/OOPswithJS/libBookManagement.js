class Library {
  constructor() {
    this.books = [];
  }

  addBook(book) {
    this.books.push(book);
  }

  getAvailableBooks() {
    return this.books.filter(b => b.available === true);
  }

  searchByAuthor(author) {
    return this.books.find(b => b.author === author);
  }
}

// Create Library
const lib = new Library();

// Add 3 Books
lib.addBook({ title: "JS Mastery", author: "John", available: true });
lib.addBook({ title: "React Guide", author: "Rita", available: false });
lib.addBook({ title: "Node Deep Dive", author: "John", available: true });

console.log("Available Books:", lib.getAvailableBooks());
console.log("Search Author 'John':", lib.searchByAuthor("John"));
