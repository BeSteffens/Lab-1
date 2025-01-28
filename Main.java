/*import java.util.*;

 * IT-2660 - Lab 1
 * Student Name: Ben Steffens 
 */


 public class Main {
  public static void main(String[] args) {
    int [] array = {5,9,3,12,7,3,11,5};

    Lab1 lab = new Lab1();
    
    System.out.println("Output the array in order using a while loop.");
    int i = 0;
    while (i < array.length){
      System.out.println(array[i]);
      i++;
    }

    System.out.println("Output the array in reverse using a for loop.");
    
    for (int t = array.length - 1; t >= 0; t--) {
      System.out.println(array[t]);
    }

    System.out.println("Output the first and last values of the array.");
    System.out.println(array[0]);
    
    int k = array.length - 1;
    System.out.println(array[k]);

    System.out.println("Call the methods created in Lab1.");    

    System.out.println(lab.max(2,1));

    System.out.println(lab.min(3,4));

    System.out.println(lab.average(array));

    System.out.println(lab.max(array));

    System.out.println(lab.min(array));
  }
}     

// Add all of the methods here
class Lab1 {

//return maximum value
  public int max(int a, int b){
    if (a > b) {
      int c = a;
      return c; 
    } else {
      int c = b;
      return c;
    }
  }

// return minimum value
  public int min(int a, int b){
    if (a < b) {
      int c = a;
      return c; 
    } else {
      int c = b;
      return c;
    }
  }

//return average sum of array
  public double average(int[] nums){
    int sum = 0;
    for (int number : nums){
      sum += number;
    }
    double average = (double) sum / nums.length;
    return average;
  }

//return maximum value for an array
  public int max(int[] nums){
    int max = nums[0];
    for (int i = 1; i < nums.length; i++){
      if (nums[i] > max){
        max = nums[i];
      }
    }
    return max;
  }

//return minimum value for an array
  public int min(int[] nums){
    int min = nums[0];
    for (int i = 1; i < nums.length; i++){
      if (nums[i] < min){
        min = nums[i];
      }
    }
    return min;
  }
}