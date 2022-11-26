import java.util.Scanner;

public class Product {

    int productId;
    String name;
    int price;
    int discount; // :15% [ 10000:5%,20000:10%,20k+ 15% ]
    int discountedPrice;

    void getData() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter id name price ");
        productId = scr.nextInt();
        name = scr.next();
        price = scr.nextInt();
    }

    void calculateDiscount() {
        if (price <= 10000) {
            discount = 5;
        } else if (price <= 20000) {
            discount = 10;
        } else {
            discount = 15;
        }

        discountedPrice = price - ((price * discount) / 100);
    }

    // void printData(){
    //     System.out.println("ProductID : "+productId);
    //     System.out.println("Name : "+name);
    //     System.out.println("Price : "+price);
    //     System.out.println("Discount : "+discount);
    //     System.out.println("DiscountedAmount : "+discountedPrice);
    // }


    void printData(){
        System.out.println("ProductID Name Price Discount DiscountedAmount");
        System.out.println(productId+" "+name+" "+price+" "+discount+" "+discountedPrice);
        // System.out.printf();
    }



    public static void main(String[] args) {
        Product p = new Product(); 
        p.getData();
        p.calculateDiscount();
        p.printData();
    }
}
