public class Mosier_5_2_LocateDemo{
    /**
     * Megan Mosier
     * CSD-402
     * Assignment 5.2
     * June 28, 2026
     */
  /**
 * Locates the position of the largest element in a 2D double array.
 *
 * @param arrayParam the 2D array to search
 * @return an int array of size 2, where index 0 is the row and
 *         index 1 is the column of the largest element
 */
public static int[] locateLargest(double[][] arrayParam) {
    int maxRow = 0;
    int maxCol = 0;
    double maxValue = arrayParam[0][0];

   

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] > maxValue) {
                 maxValue = arrayParam[row][col];
                maxRow = row;
                maxCol = col;
            }
        }
    }

        int[] location = {maxRow, maxCol};
        return location;
    }
/**
 * Locates the position of the largest element in a 2D int array.
 *
 * @param arrayParam the 2D array to search
 * @return an int array of size 2, where index 0 is the row and
 *         index 1 is the column of the largest element
 */
public static int[] locateLargest(int[][] arrayParam) {
    int maxRow = 0;
    int maxCol = 0;
    int maxValue = arrayParam[0][0];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] > maxValue) {
                maxValue = arrayParam[row][col];
                maxRow = row;
                maxCol = col;
            }
        }
    }

    int[] location = {maxRow, maxCol};
    return location;
}
 /**
 * Locates the position of the smallest element in a 2D double array.
 *
 * @param arrayParam the 2D array to search
 * @return an int array of size 2, where index 0 is the row and
 *         index 1 is the column of the smallest element
 */
public static int[] locateSmallest(double[][] arrayParam) {
    int minRow = 0;
    int minCol = 0;
    double minValue = arrayParam[0][0];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] < minValue) {
                minValue = arrayParam[row][col];
                minRow = row;
                minCol = col;
            }
        }
    }

    int[] location = {minRow, minCol};
    return location;
} 
/**
 * Locates the position of the smallest element in a 2D int array.
 *
 * @param arrayParam the 2D array to search
 * @return an int array of size 2, where index 0 is the row and
 *         index 1 is the column of the smallest element
 */
public static int[] locateSmallest(int[][] arrayParam) {
    int minRow = 0;
    int minCol = 0;
    int minValue = arrayParam[0][0];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] < minValue) {
                minValue = arrayParam[row][col];
                minRow = row;
                minCol = col;
            }
        }
    }

    int[] location = {minRow, minCol};
    return location;
}

public static void main(String[]args){
    double[][] doubleArray = {
        {1.2,2.2,3.2},
        {4.2,5.2,9.2},
        {7.2,8.2,6.2}
    };
    int[][] intArray = {
        {3, 4, 5},
        {2, 1, 4},
        {7, 8, 9}
    };
    int[] largestInDouble = locateLargest(doubleArray);
    int[] smallestInDouble = locateSmallest(doubleArray);
    int[] largestInInt = locateLargest(intArray);
    int[] smallestInInt = locateSmallest(intArray);

    System.out.println("Largest value in doubleArray is at row " + largestInDouble[0] + ", column " + largestInDouble[1]);
    System.out.println("Smallest value in doubleArray is at row " + smallestInDouble[0] + ", column " + smallestInDouble[1]);
    System.out.println("Largest value in intArray is at row " + largestInInt[0] + ", column " + largestInInt[1]);
    System.out.println("Smallest value in intArray is at row " + smallestInInt[0] + ", column " + smallestInInt[1]);
    }
}
