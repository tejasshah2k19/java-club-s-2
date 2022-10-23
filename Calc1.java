import java.util.Scanner; 
//package 

class Calc1{

	int a,b,ans;

	void getdata(){
		System.out.println("Enter number");
	//	Scanner scr;//null
		Scanner scr = new Scanner(System.in); 
	 	a = scr.nextInt();
		b = scr.nextInt();
		
		
	}

	void add(){
		ans = a+b; 
		System.out.println(ans);
	}

	public static void main(String args[]){
	
		Calc1 c = new Calc1(); 
		c.getdata();
		c.add();

	}//main 
	
}//class 

//oop -> encapsulation-->class






1
12
123
1234
12345


1
121
12321
1234321
123454321


A
AB
ABC
ABCD 
ABCDE 

A      A
A     BA
ABC  CBA
ABCDDCBA






 











 