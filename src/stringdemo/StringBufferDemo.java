package stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {

		String str = new String("royal");
		System.out.println(str);
		str.concat("edu");
		System.out.println("afterConcat => " + str);
		StringBuffer sb = new StringBuffer("royal");
		System.out.println(sb);
		sb.append("eud");
		System.out.println("After Append => " + sb);

		// methods

		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());

		String rev = sb.toString();
		System.out.println(rev);

		// take 1 string from user and check its palindrome or not!!!!

		StringBuffer sb2 = new StringBuffer("jony jony yes papa");
		sb2.insert(5, "AAAA");
		
		System.out.println(sb2);
		sb2.delete(5, 9);//5 6 7 8 
		System.out.println(sb2);
		
		//take string from user
		//jony jony yes papa 
		//Jony Jony Yes Papa
		System.out.println(sb2.capacity());
	}
}
