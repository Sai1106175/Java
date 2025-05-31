package Practice1;

public class Person {

    public void Name(){
        System.out.println("The Name of the student is Sharan");

    }
    public void Age(){
        System.out.println("The Age of the Student is 29");
    }
}

package Practice1;

public class Student extends Person{
    public void rollNo(){
        System.out.println("The Roll No of the Student is 10");
    }
}


package Practice1;

public interface Student_Details {

    public static void main(String[] arg){
        Student s = new Student();
        s.Name();
        s.Age();
        s.rollNo();
    }
}

Solution for 1st problem
