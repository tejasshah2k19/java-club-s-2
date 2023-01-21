
public class EnumDemo {

	public static void main(String[] args) {
		
		System.out.println(Drink.SMALL);
		System.out.println(Drink.SMALL.value);
		

	}
}

enum Drink {
	SMALL(1), LARGE(2), EXLARGE(4);
	int value;

	Drink(int v) {
		value = v;
	}
}