// YOU DO NOT NEED TO IMPORT ANYTHING
// YOUR CODE MUST WORK WITHOUT ANY ADDITIONAL PACKAGES
public class NumUnique{
    //DO NOT MODIFY main METHOD
    public static void main(String[] args){
        int[] arr0 = {};
        int expected0 =0;
        System.out.println("Test 0 passed: " + validate(expected0, countUniqueIntegers(arr0)));
        System.out.println("-----------------------");
        
        int[] arr1 = {3, -3, -1,  0, -1,  4,  0,  3,  4,  0};
        int expected1 = 5;
        System.out.println("Test 1 passed: " + validate(expected1, countUniqueIntegers(arr1)));
        System.out.println("-----------------------");

        int[] arr2 = {4,  3, -1,  1, -3, -1,  1, -5, -3, -4};
        int expected2 = 7;
        System.out.println("Test 2 passed: " + validate(expected2, countUniqueIntegers(arr2)));
        System.out.println("-----------------------");

        int[] arr3 = {0,  0,  0, -3,  0, -1, -3,  1,  1,  2};
        int expected3 = 5;
        System.out.println("Test 3 passed: " + validate(expected3, countUniqueIntegers(arr3)));
        System.out.println("-----------------------");

        int[] arr4 = {8,  7, -1, -2,  9,  0,  3,  2, -2,  3, -2,  9,  2, -3,  3};
        int expected4 = 9;
        System.out.println("Test 4 passed: " + validate(expected4, countUniqueIntegers(arr4)));
        System.out.println("-----------------------");

        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected5 = 10;
        System.out.println("Test 5 passed: " + validate(expected5, countUniqueIntegers(arr5)));
        System.out.println("-----------------------");

        int[] arr6 = {2, -3, -1,  0,  1, -2};
        int expected6 = 6;
        System.out.println("Test 6 passed: " + validate(expected6, countUniqueIntegers(arr6)));
        System.out.println("-----------------------");

        int[] arr7 = {-4,  3,  6, -2, -1, -4};
        int expected7 = 5;
        System.out.println("Test 7 passed: " + validate(expected7, countUniqueIntegers(arr7)));
        System.out.println("-----------------------");

        int[] arr8 = { 0, -1,  0};
        int expected8 = 2;
        System.out.println("Test 8 passed: " + validate(expected8, countUniqueIntegers(arr8)));
        System.out.println("-----------------------");

        int[] arr9 = { 1,  2, -1,  4,  1,  4,  0,  0, -3,  2,  2, -2, -5,  0,  1, -4, -5};
        int expected9 = 9;
        System.out.println("Test 9 passed: " + validate(expected9, countUniqueIntegers(arr9)));
        System.out.println("-----------------------");

        int[] arr10 = {4,  5,  5,  4,  1,  5, -3,  4, -1, -2, -2, -2, -2, -2, -2,  1,  4,  5, -5};
        int expected10 = 7;
        System.out.println("Test 10 passed: " + validate(expected10, countUniqueIntegers(arr10)));
        System.out.println("-----------------------");
    }

    // Complete this method to return the number of unique number values in the array "arr"
    public static int countUniqueIntegers(int[] arr){
   
        // Initialize int "counter" with value 0
        int num_unique = arr.length;
        for (int i = 0; i < arr.length; i++){
          for (int j = (i + 1); j < arr.length; j++){
            if (arr[i] == arr[j]){
              num_unique--;
              break;
            }
            
            
            
          }
          

          
        }
        
        // TO DO: Add logic to count unique values

        
        
        // Return number of unique values
        return num_unique;
    }

    // DO NOT MODIFY validate METHOD
    public static boolean validate(int expected, int answer){
        if (answer != expected){
            System.out.println("Your answer: " + answer + " does not match expected: " + expected);
            return false;
        }
        return true;
    }
}