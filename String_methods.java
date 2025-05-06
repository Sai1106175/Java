import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        // Types of methods in String
        String myName = "Sai Sharan";

        String fristName ="Sai";
        String LastName = "Sharan";


        System.out.println("The length of the myName variable =" + myName.length()); // It prints the lenght of the variable.

        System.out.println(myName.substring(0,5)); // Substring used to extract the values defined by index range.

        System.out.println(fristName.concat(LastName));

        System.out.println(Math.random()*200);

        float myRandomnumber = (float)(Math.random()*100);// it gives u the decimal point if we are using float
        System.out.println(myRandomnumber);

        int myRandomNumber1 =(int)(Math.random()*101); // As Math.random number gives us deciaml value we convert that to int by doing typecasting and store the value.
        
        System.out.println(myRandomNumber1);



    }
}



