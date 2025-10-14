package lab07;

public class MiddleElement {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };

        int n = matrix.length;

        if (n % 2 != 0) { // Odd size
            int mid = n / 2;
            System.out.println("Middle element: " + matrix[mid][mid]);
        } else { // Even size
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;
            System.out.println("Middle elements:");
            System.out.println(matrix[mid1][mid1] + " " + matrix[mid1][mid2]);
            System.out.println(matrix[mid2][mid1] + " " + matrix[mid2][mid2]);
        }
    }
}

