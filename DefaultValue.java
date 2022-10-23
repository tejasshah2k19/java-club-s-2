public class DefaultValue {
    byte b ;
    short s;
    char c;
    int i;
    long l;
    float f;
    double d;
    boolean bb;

    DefaultValue(){
        b = 25;
        c='p';
    }

    void print(){
        System.out.println(b); // 25 
        System.out.println(s); //0 
        System.out.println(c); // 'p'
        System.out.println(i);// 0 
        System.out.println(l);// 0 
        System.out.println(f);// 0.0 
        System.out.println(d);//0.0 
        System.out.println(bb);//false 
    }
    public static void main(String args[]) {
        DefaultValue d = new DefaultValue(); 
        d.print();//b 25 c p 

        DefaultValue e = new DefaultValue(); 
        e.print();//b 25 c p 
        


    }
}
