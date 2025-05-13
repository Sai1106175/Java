public class Main {
    public static void main(String[] args) {
       String[][] names={
               {"sai","Pooja","Chandu"},
               {"Varun","Karthik","Sampath"} //
       };

        for (int i = 0; i < names.length; i++) {          // Loop through rows
            for (int j = 0; j < names[i].length; j++) {   // Loop through each name in that row
                System.out.println(names[i][j]);
            }
        }


    }

       }
    }
}
