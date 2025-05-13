public class Main {
    public static void main(String[] args) {
        int[][][] myNumbers = {
                {   // first page
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {   // second page
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };

        for(int i =0;i<Mynumbers.length;i++){
            for(int j=0; j<Mynumbers[i].length;j++){
                for(int s=0; s<Mynumbers[i].length;s++){
                    System.out.println(Mynumbers[i][j][s]);
                }
            }
        }

    }
}
