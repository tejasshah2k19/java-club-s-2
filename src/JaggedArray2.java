import java.util.Scanner;

public class JaggedArray2 {
    public static void main(String[] args) {
        int a[][] = new int[3][4];
        //3 row 
        //4 column 
        Scanner scr = new Scanner(System.in);

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.println("Enter value");
                a[i][j] = scr.nextInt(); 
            }
        }


        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+" "); 
            }
            System.out.println("");
        }


        int b[][] = new int[3][];
        b[0] = new int[3];// 1st row 3 column 
        b[1] = new int[2];// 2nd row 2 column 
        b[2] = new int[4];//3rd row 4 column  

        
        for(int i=0;i<3;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.println("Enter value");
                a[i][j] = scr.nextInt(); 
            }
        }

        
        for(int i=0;i<3;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(a[i][j]+" "); 
            }
            System.out.println("");
        }
    }
}
