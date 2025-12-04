const user = {
    name: "Siddhi",
    showName: () => {
        console.log(this.name);  // undefined
    }
};

user.showName();

const user2 = {
    name: "Siddhi",
    showName: function () {
        console.log(this.name);  // works
    }
};

user2.showName();
