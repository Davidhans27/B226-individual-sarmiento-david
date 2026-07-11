package day10.discussion;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        // Syntax on how to declare a multi-dimensional array

        String[][] colors = {
            //        0        1        2
            {"white", "yellow", "pink"},   // 0
            {"black", "brown", "gray"},    // 1
            {"green"}                      // 2
        };


            // coordinates        [row][column]

        //System.out.println(colors[0][1]);

        //System.out.println(colors[2].length);


        // Traverse a multi-dimensional array using nested for-loop

        for (int i = 0; i < colors.length; i++) { // outer loop

            for (int j = 0; j < colors[i].length; j++) { // inner loop

                System.out.println(colors[i][j]);
            }
            System.out.println(""); // new line
        }

    }
}