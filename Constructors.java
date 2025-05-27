public class Car {
    public Car(String Model){
        System.out.println("The name of the car is Bez");

    }

    public Car(String Model, int Year){
      System.out.println("The year of manufacturing of the car is 2021");
    }

    public static void main(String[] arg){
        Car obj1 = new Car("Benz");
        Car obj2 = new Car("Benz ",2021);
    }
}
