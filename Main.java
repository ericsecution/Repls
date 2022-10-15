class Main {
  public static void main(String[] args) {

    int[] nums = { 0, 2 };

    boolean result = has23(nums);

    System.out.println(result);
  }

  /*
   * Exercise 15: has23 Create a boolean method called has23 that takes in an
   * integer array “nums”. Given an int array length 2, return true if it contains
   * a 2 or a 3. has23([2, 5]) → true has23([4, 3]) → true has23([4, 5]) → false
   */

  public static boolean has23(int[] nums) {
    // int[] checkNums = new int[2];

    for (int i = 0; i < nums.length; i++) {
    // Scan thru array, first for a 2
      System.out.println(nums[i]);
    // if it finds a 2, then go into next scan for a 3
      if (nums[i] == 2) {
        for (int j = 0; j < nums.length - 1; j++) {
          System.out.println(nums[j]);
          if (nums[j] == 3) {
          // if a 3 is found (after the 2) then return true
            return true;
          }
        }
      }
    }
    // otherwise (i.e. if no 2 AND 3), then return false
    return false;
  }

}