public class Main {
    // Area of a square
    static int AreaCalculator(int side){
        return side * side;
    }

    // Area of a rectangle
    static int AreaCalculator(int length, int breadth){
        return length * breadth;
    }

    // Area of a circle
    static double AreaCalculator(double radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] arg){
        int sqr = AreaCalculator(5);             // 25
        int rec = AreaCalculator(4, 4);          // 16
        double circle = AreaCalculator(4.4);     // ~60.82
        System.out.println("Square: " + sqr + 
                           " | Rectangle: " + rec + 
                           " | Circle: " + circle);
    }
}
