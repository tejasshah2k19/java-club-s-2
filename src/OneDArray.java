import java.util.Scanner;

public class OneDArray {
        public static void main(String[] args) {            
            int a[];
            a = new int[5];

            int b[] = new int[5];//0 1 2 3 4 
            int []c = new int[5];
            int[] d = new int[5];

            Scanner scr = new Scanner(System.in);
            for(int i=0;i<b.length;i++){
                System.out.println("Enter value");
                b[i] = scr.nextInt();
            }

            System.out.println("Content of the Array");
            for(int i=0;i<b.length;i++){
                System.out.println(b[i]);
            }
        }
}
