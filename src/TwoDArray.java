import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        
        // int a[3][3]; //9
          //   0 1 2 
        //0  1 2 3 
        //1  4 5 6
        //2  7 8 9 
       int d[][]=new int[1][1];//  =>  1,

       //1->00 2->01 3->10  4->11 5->20 6->21
       int k [] []  = new int[5][3]; 
       //1 2 3 4 5 6 7 8 9 
       //00:1 01:2 02:3 
       //10:4 11:5 11:6
       
       Scanner scr = new Scanner(System.in);
       int c[] [] =new int[3][2]; // => 6

       //row
       for(int i=0;i<3;i++){
        for(int j=0;j<2;j++){
            System.out.println("Enter number");
            c[i][j] =    scr.nextInt();//00 01 10 11 20 21 
        }
       }

       for(int i=0;i<3;i++){
        for(int j=0;j<2;j++){
            System.out.print(c[i][j]+" ");//00 01  10 11 20 21 
        }
        System.out.println("");
       }
       
    }
}
