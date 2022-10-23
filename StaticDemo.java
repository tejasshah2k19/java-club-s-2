public class StaticDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.add(); 
        System.out.println(s.k);
        Student.sub(); 
        System.out.println(Student.t);
    }
}

class Student{
    
    int k=90; //instance variable 

    //one and only one copy 
    static int t=900;//static variable - class variable 

    //non static - instance 
    void add(){
        System.out.println("Student::add()");
    }

    //static - class method*
    static void sub(){
        System.out.println("Student::sub()");
    }
}
