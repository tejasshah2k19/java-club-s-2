public class StringEquals {
    public static void main(String[] args) {
        String s1= "royal";
        String s2 = "royal";
        String s3 = new String("royal");

        System.out.println(s1 == s2);//ref 
        System.out.println(s1 == s3);//ref 

        System.out.println(s1.equals(s2));//value
        System.out.println(s1.equals(s3));//value 
        s3 = s1 ;
        System.out.println(s1 == s2);//ref 
        System.out.println(s1 == s3);//ref 


        // -------------- intern ---------------------- //

        String t1 = "royal";
        String t2 = "royal";
        String t3 = new String("royal").intern();

        System.out.println("---------intern--------");
   
        System.out.println(t1 == t2);
        System.out.println(t1 == t3); 





    }
}
