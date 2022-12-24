
public class FinalDemo {
	final int Z = 100; // you must have to assign value

	final int AGE;// we can assign value using constructor also

	FinalDemo() {
		AGE = 20;
	}

	public static void main(String[] args) {

		final int Y = 100;
		final int x = 10;
		System.out.println(x);
		// x = 100; // compilation error - final variable can't modify

		// if your variable is final then make in all caps

	}
}

class P {
	final void add() {

	}
}

final class C extends P {
//	void add() {
//
//	}
}

//class D extends C{
//	
//}




