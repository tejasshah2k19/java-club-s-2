public class OverloadDemo2 {
    
    public static void main(String[] args) {
        Payment p = new Payment();
        p.pay();
        p.pay(123456);
    }
}
class Payment{

    //method overloading 
    void pay(){
        System.out.println("Pay() - cod ");
    }
    void pay(int ccNum){
        System.out.println("Pay() - creditcard");
    }
}


class Calc{
    void add(){
        //a b scan 
        //c = a+b 
    }
    void add(int a,int b){
        int c  = a+b;
        System.out.println("addition = "+c);
    }
    void add(float k,int p){

    }

}

