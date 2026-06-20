/**
 * Megan Mosier
 * CSD-402
 * Assignment 4.2
 * June 20, 2026
 */

 public class Mosier_4_2_AverageDemo { 
    /**
     * Returns the average of values in a short array.
     * @param array the array of short values
     * @return the average as a short
     */
    public static short average(short[] array) {
        int sum=0;
        for(short value : array) {
            sum += value;
        }
     return(short)(sum/array.length);
    }
    /**
     * Returns the average of values in an int array.
     * @param array the array of int values
     * @return the average as an int
     */
    public static int average(int[]array) {
        int sum=0;
        for(int value:array){
            sum+=value;
        }
        return sum/array.length;
    }
    /**
     * Returns the average of values in a long array.
     * @param array the array of long values
     * @return the average as a long
     */
    public static long average(long[] array) {
        long sum=0;
        for(long value:array) {
            sum+=value;
        }
        return sum/array.length;
    }
    /**
     * Returns the average of values in a double array.
     * @param array the array of double values
     * @return the average as a double
     */
    public static double average(double[] array) {
        double sum = 0;
        for(double value : array) {
            sum+=value;
        }
        return sum/array.length;
    }
    /**
     * Prints the elements of a short array
     * @param array the array of short values to print
     */
    public static void printArray(short[] array) {
        System.out.print("Array: ");
        for(short value:array) {
            System.out.print(value+" ");
        }
        System.out.println();
    }
    /**
     * Prints the elements of an int array
     * @param array the array of int values to print
     */
    public static void printArray(int[] array) {
        System.out.print("Array: ");
        for(int value:array) {
            System.out.print(value+" ");
        }
        System.out.println();
    }
    /**
     * Prints the elements of a long array
     * @param array the array of long values to print
     */
    public static void printArray(long[] array) {
        System.out.print("Array: ");
        for(long value:array) {
            System.out.print(value+" ");
        }
        System.out.println();
    }
    /**
     * Prints the elements of a double array
     * @param array the array of double values to print
     */
    public static void printArray(double[] array) {
        System.out.print("Array: ");
        for(double value:array) {
            System.out.print(value+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        short[] shortArray = {5, 10, 15};
        System.out.println("Short Array:");
        printArray(shortArray);
        System.out.println("Average: " + average(shortArray));
        System.out.println();
    
        int[] intArray = {5, 10, 15, 20};
        System.out.println("Int Array:");
        printArray(intArray);
        System.out.println("Average: " + average(intArray));
        System.out.println();
    
        long[] longArray = {5, 10, 15, 20, 25};
        System.out.println("Long Array:");
        printArray(longArray);
        System.out.println("Average: " + average(longArray));
        System.out.println();
    
        double[] doubleArray = {5, 10, 15, 20, 25, 30};
        System.out.println("Double Array:");
        printArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
        System.out.println();
    }
 }