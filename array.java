public class ArraysDemo {
    public static void main(String[] args) {
        // 1D Array
        int[] numbers = new int[5]; // Declaration with size
        numbers[0] = 10; // Initialization
        numbers[1] = 20;
        
        int[] primes = {2, 3, 5, 7, 11}; // Declaration with initialization
        
        // Iterating through array
        for (int i = 0; i < primes.length; i++) {
            System.out.println(primes[i]);
        }
        
        // Enhanced for loop
        for (int num : primes) {
            System.out.println(num);
        }
        
        // 2D Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Accessing 2D array
        System.out.println(matrix[1][2]); // 6
    }
} 
