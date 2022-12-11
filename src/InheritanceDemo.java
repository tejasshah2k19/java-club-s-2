
public class InheritanceDemo {

	public static void main(String[] args) {

		SciCalc sc = new SciCalc();
		sc.sqr();
		sc.add();
		sc.sub();
	}

}

//Parent Super Base 
class BasicCALC {
	int a, b, ans;

	void add() {
		System.out.println("BASICCALC::ADD()");
	}

	void sub() {
		System.out.println("BASICCALC::SUB()");
	}
}

//inheritance 
//extends 
//Child Sub Derived 
class SciCalc extends BasicCALC {
	void sqr() {
		a = 5;
		ans = a * a;
		System.out.println(ans);
		System.out.println("SCICALC::SQR()");
	}

	// method overriding
	void sub() {
		System.out.println("SCICALC::SUB()");
	}

}
