import java.security.PublicKey;

public class Main {
    static void companyName(){
        System.out.println("The name of the company is Prolifics.");
    }

    public String employeeName(){
        String name = "Sharan";
        System.out.println("Name of the employee " + name);
        return name;
    }

    public static void main(String[] arg){
        Main myobj = new Main();
        myobj.employeeName();
        companyName();

    }
}
