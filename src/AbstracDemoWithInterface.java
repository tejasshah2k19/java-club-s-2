
public class AbstracDemoWithInterface {

	public static void main(String[] args) {
//		CarA a = new CarA();
//		a.start();

		DzireA d = new DzireA();
		d.start();
		d.stop();
	}
}

//we cant create object of abstract class 
abstract class CarA {
	// abstract
	abstract void start();

	int gear = 1;

	CarA() {
		gear = 5;
	}

	// non abstract
	void stop() {
		System.out.println("stop();");
	}
}

class Ciaz extends CarA {
	Ciaz() {
		gear = 7;
	}

	void start() {
		System.out.println("Ciaz:Start()");
	}

	void stop() {

	}
}

class Ambasador extends CarA {
	void start() {
		System.out.println("Ambasador:Start()");
	}
}

class DzireA extends CarA {
	void start() {
		System.out.println("Dzire:Start()");
	}
}

//pure abstract class 
abstract interface RBIA {
	void dep();

	public abstract void wid();

}

interface IRDA {
	int k = 20;// public final static
}

class Z {

}

class Axis extends Z implements RBIA, IRDA {
	public void dep() {

	}

	public void wid() {

	}
}

//class class
//class interface 
//interface interface 

// not possible
//interface class 

interface DoT {

}

interface TRAI extends DoT {

}

class Jio implements TRAI {

}
