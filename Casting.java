import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {

        byte myNumber = 11;  // Bite size is smaller then short so it autmcly convert.
        short myNumber2 = myNumber;

        short myNumber3 = 100;   
        int myNumber4 = myNumber3;


        int myNumber5 = 100;
        long myNumber6 = myNumber5;   // widening casting.

        long myNumber7 = 100;
        byte mynumber8 = myNumber7;  // Narrowing Casting 



        System.out.println(mynumber8);
    }
}


