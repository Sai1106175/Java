public class StudentCourse {
    private String StudentName;
    private String CourseName;
    private int Coursefee;
    private boolean isRegistered;
    private int discountpercentage;

    public void setStudentName(String StudentName){
        System.out.println("Enrolled Student name is " + StudentName);
        this.StudentName = StudentName;
    }
    public void setCourseName(String CourseName){
        System.out.println("The Course you have Chosen is " + CourseName);
        this.CourseName = CourseName;

    }
    public int setCoursefee(int Coursefee){
        this.Coursefee = Coursefee;
        if(Coursefee> 1000 && Coursefee<10000){
            System.out.println("The Coursefee you have entered is "+ Coursefee);

        }
        else {
            System.out.println("The entered Course fee is not a valid number");
        }
        return Coursefee;


    }
    public int discountpercentage(int discountpercentage){
        if(discountpercentage <= 30){
            System.out.println("The Discount is percentage is applied");
        }
        if(discountpercentage >30) {
            System.out.println("The Discount % is not applicable.");
        }
        return discountpercentage;
    }
    public boolean isRegistered(boolean flag) {
        if (isRegistered == true){
            if(Coursefee> 1000 && Coursefee<10000) {
            System.out.println("You can proceed with Registration");
        }
    }
    if(isRegistered == false){
        System.out.println("Please set the course fee");
    }
    return flag;
    }

    public void registration(){
        int finalprice =  Coursefee - (Coursefee * discountpercentage/100);
        System.out.println("Congrats..!!" + StudentName + "You have registered Sucessfully for" + CourseName + "and the final prices after discount is " + finalprice );

    }

}



Class 2

public class Result {
    public static void main(String[] arg) {

        StudentCourse s = new StudentCourse();
        s.setStudentName("Sharan");
        s.setCourseName("java");
        s.setCoursefee(8000);
        s.discountpercentage(30);
        s.isRegistered(true);
        s.registration();
    }
}
