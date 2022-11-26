class OverloadingDemo
{

    void add(){
        int a= 10;
        int b =20;
        int c = a+b;
        System.out.println("Addition = "+c);
    }

    void add(int a,int b){
        int c = a+b;
        System.out.println("Addition = "+c);
    }
    void add(int a,int b,int c){
        int d = a+b+c;
        System.out.println("Addition = "+d);
    }
    public static void main(String[] args) {
        
        OverloadingDemo o = new OverloadingDemo(); 
       
        o.add(); 
        o.add(20,30);
        o.add(1,2,3);
    }
}