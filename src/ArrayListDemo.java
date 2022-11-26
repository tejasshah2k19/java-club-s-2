import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();       //dynamic array  
        
        //list.add(20);//0 
        //list.add(30);
        list.add("ram");
        list.add("sita");
        list.add("ravan");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));//a[i]
        }
    
    }
}


//1 2 3 4 5 7 8 9 10 
//array -> 10 -> 10+  10- memory issue 
// data type -> same 
//length 

//ArrayList -> no size
