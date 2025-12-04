class Person {
    constructor(name) {
        this.name = name;
    }
    showName() {
        console.log("Name:", this.name);
    }
}

class Student extends Person {
    constructor(name, branch) {
        super(name); // calls Person constructor
        this.branch = branch;
    }
    showBranch() {
        console.log("Branch:", this.branch);
    }
}

const s = new Student("Siddhi", "CSE");
s.showName();
s.showBranch();
