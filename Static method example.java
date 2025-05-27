public class Main {

    static void myClass(){
        System.out.println("My name is sharan"); // to call static method we dont need to create object for method
    }

    static int myclass2(){
        int x =10;
        int y = 20;
        int i=  x+y;
        System.out.println(i);
        return i;

    }

    public static void main(String[] arg){
        myClass();
        myclass2();
    }
}
