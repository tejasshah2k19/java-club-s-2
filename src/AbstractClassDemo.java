
public class AbstractClassDemo {
	public static void main(String[] args) {
		Maruti m = new Maruti();
		m.speed();

//		Car c = new Car();
		// c.drive();
		// if your class is an abstract class then you cant create instance/object
		// how to access car's start method ?
		// ans => we can create child class of car
		Dzire d = new Dzire();
		d.drive();
		d.start();
	}

}

//abstract 
//1) abstract method 
//2) non abstract method 
abstract class Car {

	// abstract method
	// declaration - no body
	abstract void drive();

	// non abstract method
	void start() {
		System.out.println("Car::start()");
	}

}

//extends inheritance 
class Dzire extends Car {
	void drive() {
		System.out.println("Dzire::drive()");
	}
}

//non abstract 
//all non abstract 
class Maruti {
	//
	void speed() {
		System.out.println("Maruti::speed()");
	}
}