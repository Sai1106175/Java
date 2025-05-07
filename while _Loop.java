import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {

        int number = 1234, rev = 0, num =0;
        while(number!=0){
            int Dig = number%10; // Reason why we are divding number% 10 is to get last number
            rev = rev * 10 + Dig; // Once we have the last number we will store that number in Rev variable.
            number = number/10; //Reason for doing number is to reduce the last number of the number.
        }
        System.out.println(rev);


            }
        }








