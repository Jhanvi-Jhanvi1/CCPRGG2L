
public class W2Exer1Jhanvi {

    public static void main(String[] args) {

        // Predefined matrix elements
        int[][] JhanviMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // To Display Original Matrix
        System.out.println("Original matrix:");
        for (int JhanviI = 0; JhanviI < JhanviMatrix.length; JhanviI++) {
            for (int JhanviJ = 0; JhanviJ < JhanviMatrix[JhanviI].length; JhanviJ++) {
                System.out.print(JhanviMatrix[JhanviI][JhanviJ] + " ");
            }
            System.out.println();
        }

        // To Compute Sum of Each Row
        System.out.print("\nRow sums: ");

        for (int JhanviI = 0; JhanviI < JhanviMatrix.length; JhanviI++) {
            int JhanviRowSum = 0;
            for (int JhanviJ = 0; JhanviJ < JhanviMatrix[JhanviI].length; JhanviJ++) {
                JhanviRowSum += JhanviMatrix[JhanviI][JhanviJ];
            }
            System.out.print(JhanviRowSum);

            if (JhanviI < JhanviMatrix.length - 1) {
                System.out.print(", ");
            }
        }

        // To Compute Sum of Each Column
        System.out.print("\nColumn sums: ");

        for (int JhanviJ = 0; JhanviJ < JhanviMatrix[0].length; JhanviJ++) {

            int JhanviColumnSum = 0;

            for (int JhanviI = 0; JhanviI < JhanviMatrix.length; JhanviI++) {
                JhanviColumnSum += JhanviMatrix[JhanviI][JhanviJ];
            }

            System.out.print(JhanviColumnSum);

            if (JhanviJ < JhanviMatrix[0].length - 1) {
                System.out.print(", ");
            }
        }

        // To Compute Main Diagonal Sum
        int JhanviDiagonalSum = 0;
        for (int JhanviI = 0; JhanviI < JhanviMatrix.length; JhanviI++) {
            JhanviDiagonalSum += JhanviMatrix[JhanviI][JhanviI];
        }
        System.out.println("\nMain diagonal sum: " + JhanviDiagonalSum);

        // To Display Transpose Matrix
        System.out.println("\nTranspose:");
        for (int JhanviI = 0; JhanviI < JhanviMatrix[0].length; JhanviI++) {
            for (int JhanviJ = 0; JhanviJ < JhanviMatrix.length; JhanviJ++) {
                System.out.print(JhanviMatrix[JhanviJ][JhanviI] + " ");
            }
            System.out.println();
        }
    }
}
