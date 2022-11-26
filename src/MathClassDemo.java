import java.lang.*;//System String Math 

class MathClassDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int c = Math.max(a, b);
        System.out.println("max => " + c);

        System.out.println(Math.sqrt(9));
        System.out.println(Math.sin(1250));
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100000));

        int ans = (int)(Math.random()*100000) ;
    }
}