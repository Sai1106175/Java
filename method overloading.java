public class Main {

    static int mynumber(int x, int y){
        return x+y;
    }
    static double mynumber(double x, double y,double z){
        return x+y+z;
    }

    static float mynumber(float x, float y, float z, float a){
        return x-y-z-a;

    }
    public static void main(String[] arg)
    {
        double my = mynumber(2.3d,2.4d,44.3d);
        System.out.println(my);
        float my2 = mynumber(22.1f,22.0f,22.1f,33.1f);
        System.out.println(my2);
    }

}
