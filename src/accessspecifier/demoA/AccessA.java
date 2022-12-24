package accessspecifier.demoA;

import accessspecifier.PrivateDemo;

public class AccessA {

	public static void main(String[] args) {

	}
}

//default and private method can not access out side class 
//protected method can be access outside class but we need inheritance 
class P extends PrivateDemo {
	void accessPrivateDemo() {
		mul();// protected
		div();// public
	}
}

class Q {
	PrivateDemo pd = new PrivateDemo();

	void accessPrivateDemo() {
//		pd.mul();// protected
		pd.div();// public
	}

}