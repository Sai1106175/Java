public class Main {
    public static int addtion(int k){
        if(k>0){
            return k + addtion(k-1);
        }
        else{
            return 0;
        }

    }
    public static void main(String[] arg){
        int r = addtion(5);
        System.out.println(r);
    }
}
