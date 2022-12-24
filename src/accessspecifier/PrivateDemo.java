package accessspecifier;

public class PrivateDemo {

	void add() {
		System.out.println("Default");
	}

	private void sub() {
		System.out.println("private");
	}

	protected void mul() {
		System.out.println("mul");
	}

	public void div() {
		System.out.println("div");
	}

	public static void main(String[] args) {

	}
}

//default 
class A {
	// default == can be access within current pacakage / folder
	void add() {

	}

	// private method can be access inside the class -- only
	private void sub() {

	}

	protected  void mul() {
		
	}
}

//B and C can access add() of A ??
//1) inheritance with A class 
//2) create instance of A class
class B extends A {

	void seeInToA() {
		add();
		// sub();
	}
}

class C {
	void seeIntoA() {
		A obja = new A();
		obja.add();
		obja.mul();
		// obja.sub();
	}
}