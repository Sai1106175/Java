public class Main {
    static void userinput(String fname, int age){
        System.out.println("User FirstName = "+ fname  +" and his age is = " +age);
    }
    public static void main(String [] arg){
        userinput("sharan",10);
        userinput("Varun",23);
        agecheck(20);
    }

    static void agecheck (int hisage){
        if(hisage<18){
            System.out.println("He is a minor!!");
        }
        else{
            System.out.println("He is a major!!");
        }
    }



}
