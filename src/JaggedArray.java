import java.util.Scanner;

public class JaggedArray {
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a[][] = new int[3][];

        a[0] = new int[3];
        a[1] = new int[4];
        a[2] = new int[2];

        for(int i=0;i<3;i++){//0 1 2 
            for(int j=0;j<a[i].length;j++){//3 4 2 
                System.out.println("enter value for "+i+j);
                a[i][j]  = scr.nextInt();//00 01 02 , 10 11 12 13 , 20 21 
            }
        }


        int oddSum=0,evenSum=0;
        int max = a[0][0],maxRowIndex=-1,rowSum=0,rowMaxSum=0,rowMaxSumIndex=-1; 
        for(int i=0;i<3;i++){
            rowSum = 0;
            for(int j=0;j<a[i].length;j++){

                rowSum = rowSum + a[i][j];//6 
               
                System.out.print(a[i][j]+" ");
                if(a[i][j] % 2 == 0){
                    evenSum = evenSum + a[i][j];
                }else{
                    oddSum = oddSum + a[i][j];
                }
                if(a[i][j] > max){
                    max = a[i][j];
                    maxRowIndex = i;
                }
            }
            if(rowMaxSum < rowSum){
                rowMaxSum = rowSum; //22  
                rowMaxSumIndex=i;
            }
            System.out.println("");
        }

        System.out.println("odd sum => "+oddSum);
        System.out.println("even sum => "+evenSum);
        System.out.println("Max value => "+max);
        System.out.println("Max Value Row Index => "+maxRowIndex);
        System.out.println("max row sum => "+rowMaxSum);
        System.out.println("Max Row sum Index = > "+rowMaxSumIndex);
        
    }
}
// Jagged Array 

// 1) scan and print 
// 2) find out sum of all odd and even numbers from jagged array 
// 3) find out the max from array and return its row. [9]
// 4) find out max sum value of row index. [row sum => max-> index ]
