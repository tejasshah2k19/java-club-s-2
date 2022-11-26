import java.util.Scanner;
class Calc {
    public static void main(String[] args) {
        System.out.println("Welcome to Calc");
        int a,b,choice;
        Scanner scr = new Scanner(System.in);// scan ?? 

        System.out.println("Enter Two numbers");
        a = scr.nextInt();
        b = scr.nextInt(); 


        System.out.println("1 For Addition\n2 For Sub\n3 For Mul\n4 for Div");
        System.out.println("Enter your choice....");

        choice = scr.nextInt(); 

        switch(choice){ 
            case 1:
                //add
                int c = a+b;
                System.out.println("addition = "+c);
                break;
            case 2:
                //sub
                c=a-b;
                System.out.println("sub = "+c);
                break;
            case 3:
                //mul
                 c=a*b;
                 System.out.println("mul = "+c);
                 break;
            case 4:
                 //div 
                 c=a/b;
                 System.out.println("div = "+c);
                 break; 
            }
     }    
}
