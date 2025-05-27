//✅ Use void = When you are telling the computer to DO something
//❌ Don’t use void = When you need an answer/result/output back

public class Main {
    public static String Cartrottle(){
        return "Name of the car is Maruthi";
    }

    public int Speedofthecar(){
        int speed = 10;
        return speed;
    }

    public static void main(String[] arg){
        Main Myobj = new Main();
        System.out.println(Cartrottle() + " " + Myobj.Speedofthecar(22));
    }
}
