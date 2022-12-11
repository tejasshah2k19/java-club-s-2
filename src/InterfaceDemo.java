
public class InterfaceDemo {

	public static void main(String[] args) {
	}
}
//pure abstract class 
//interface 
//pure abstract class 
interface RBI {
	// its a pure abstract class
	// so all the methods are abstract always
	// all methods have public - abstract signature
	abstract void wid(); // abstract method
	public void dep();
}

//class extends class 
//class implements interface
class ICICI implements RBI {
	public void wid() {

	}

	public void dep() {

	}
}
