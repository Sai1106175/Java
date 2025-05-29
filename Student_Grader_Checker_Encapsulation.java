package Student_Grader_Checker;

public class Student {
    private String name;
    private String Subject;
    private int Marks;

    public String SetName( String name){
        this.name = name;
        return  name;
    }

    public void getName(){
        System.out.println("The name of the student is " + name);
    }

    public String SetSubject(String subject){
        this.Subject= subject;
        return subject;
    }

    public void  Getsubject(){
        System.out.println("the Name of the subject is " + Subject);
    }

    public int setmarks(int Marks){
        this.Marks = Marks;
        if (Marks>35){
            System.out.println("The student is passed");
        }
        if(Marks<35){
            System.out.println("The student is failed");
        }
        return Marks;
    }

}


Class 2

package Student_Grader_Checker;

public class Result {
    public static void main(String[] arg){
        Student s = new Student();
        s.SetName("Sai Sharan");
        s.SetSubject("Math");
        s.getName();
        s.Getsubject();
        s.setmarks(55);
    }
}
