import java.util.Scanner;

public class BasicClassObj {
        public static void main(String[] args) {
            Laptop obj = new Laptop();
            Laptop obj2 = new Laptop();

            obj.input();
            obj2.input();

            obj.printData();
            obj2.printData();
        }
}



class Laptop{
    int price;
    String title;
    String companyName;
 
    void input(){
        Scanner scr  = new Scanner(System.in);

        System.out.println("Enter title");
        title = scr.next();
        System.out.println("Enter price");
        price= scr.nextInt();
        System.out.println("Enter company name");
        companyName = scr.next();//string - multiplt character 

    }

    void printData(){
        System.out.println("title => "+title);
        System.out.println("priice => "+price);
        System.out.println("company name => "+companyName);
        
    }
}