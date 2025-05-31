package Practice2;

public class vehicle {
    public void start(){
        System.out.println("This feature helps to start the car.");
    }
}

package Practice2;

public class Car extends vehicle{
    public void drive(){
        System.out.println("Once the machine starts you can Drive the car. ");
    }
}

package Practice2;

public class functionalityofCar {
    public static void main(String[] arg){
        Car c = new Car();
        c.start();
        c.drive();
    }

}


