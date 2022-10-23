import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBank {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
    
        ArrayList<Bank> list = new ArrayList<>();

        while (true) {
            System.out.println("0 For exit\n1 For Add\n2 For List\n3 For GetCustomer By Id ");
            int choice = scr.nextInt();

            switch (choice) {
                case 1:
                    Bank b = new Bank();
                    b.getData();
                    list.add(b);
                    break;
                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).printData();
                    }
                    break;
                case 0:
                    System.exit(0);// program terminate
                case 3:
                    int customerId = scr.nextInt(); // 420
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).custId == customerId)
                            list.get(i).printData();
                    }
                    break;

            }// switch
        } // while
    }// main
}

class Bank {
    String firstName;
    int custId;
    int balance;

    void getData() {
        Scanner scr = new Scanner(System.in);
        custId = (int) (Math.random() * 100000);
        firstName = scr.next();
        balance = scr.nextInt();
    }

    void printData() {
        System.out.println(custId + " " + firstName + " " + balance);
    }
}
