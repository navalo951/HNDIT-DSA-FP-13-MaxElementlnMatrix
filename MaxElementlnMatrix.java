package BAT_IT_2022_P_13;

public class MaxElementlnMatrix {

    public static void main(String[] args) {
        // Define the matrix
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        // Call the method to find the maximum element
        int maxElement = findMaxElement(matrix);

        
        System.out.println(  maxElement);
    }

    // Method to find the maximum element in the matrix
    public static int findMaxElement(int[][] matrix) {
        int max = matrix[0][0]; // Initialize max to the first element of the matrix

        // Traverse through the matrix using linear search
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Compare and update max if a larger element is found
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        // Return the maximum element
        return max;
    }
}
