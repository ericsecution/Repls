class JavaExercise12_MakeLast {
  public static void main(String[] args) {
  
  int[] nums = {1,1,1,4,5,7};

  int [] result = makeLast(nums);
  // added in formatting for better visibility on the solution
        System.out.print("[START, ");
    for (int item : result) {
        System.out.print(item + ", ");
    }
        System.out.print("END]");
  }


  
/*
Exercise 12: makeLast
Create an integer array method called makeLast that takes in an integer array “nums”. Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
*/


public static int[] makeLast(int[] nums) {
        // I'm going to initialize an int to store
        // the length of the passed-in nums array
        // then I'm going to grab nums[]'s last number 
        // double the length and initialize my new "return" 
        // int[] -> adjustedNums so that it's ready to populate
        int lengthOfNewArray = nums.length;
        
        int lastNum = nums[lengthOfNewArray-1];
        lengthOfNewArray *= 2;
      
        int[] adjustedNums = new int[lengthOfNewArray];
      // since new int[]'s contain 0's by default
      // I just need to add in the lastNum
        adjustedNums[lengthOfNewArray-1] = lastNum;

      // and then return the adjustedNums[]
        return adjustedNums;
}

}

//Having trouble solving the problems? After you have made a resonable effort,
//here is a solution: https://vimeo.com/569129529