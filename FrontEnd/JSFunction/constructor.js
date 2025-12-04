function Car(brand, model) {
    this.brand = brand;
    this.model = model;
}

Car.prototype.getDetails = function () {
    console.log(`Car: ${this.brand} ${this.model}`);
};

const car1 = new Car("Honda", "City");
const car2 = new Car("Toyota", "Fortuner");

car1.getDetails();
car2.getDetails();

// Both objects share the same prototype method
