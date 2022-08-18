class Main {
  public static void main(String[] args) {
  
           int[] nums = {1,1,1,4,5,7};
    // only added in some "[]'s" for "fun" array formatting
            int [] result = makeMiddle(nums);
            System.out.println();
            System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
            System.out.println("[][] Starting from an array of:                         [][]");
            System.out.print("[][] ");
              System.out.print("[START, ");
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + ", ");

            }
            System.out.println("END]                     [][]");
            System.out.println("[][] And then resulting in an array of:                 [][]");
            System.out.println("[][] [" + result[0] + ", " + result[1] + "]             "
                                               + "                                [][]");
            System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
    System.out.println();

  
  }

/*
Exercise 11: makeMiddle
Create an integer array method called makeMiddle that takes in an integer array “nums”. Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
*/

    public static int[] makeMiddle(int[] nums) {
  // nums[] will always have even length of integers in it
  // the passed-in nums[] will also always be length 2 or more
  // ex: int[] nums = {1,1,1,4,5,7}

  // Step 1 - Determine initial variables that I'll be using
  // -> return a new int[] -> I'll call it middleTwoArray[]
  // -> I'll also create a left and right
  //    int - rightMidNumber & leftMidNumber

        int[] middleTwoArray = new int[2];
        
        int rightMidNumber = 0;
        int leftMidNumber = 0;

  // Step 2 - Grab those two numbers
  // -> I'll use .length divided by 2
  // -> and taking that location and its +1

        rightMidNumber = (nums[nums.length / 2]) ;
        leftMidNumber = nums[nums.length / 2 - 1];

  // Step 3 - instantiate the middleTwoArray with 
  //          the two integers, left & right mid numbers

        middleTwoArray[0] = leftMidNumber;
        middleTwoArray[1] = rightMidNumber;

        return middleTwoArray;
    }

}

//Having trouble solving the problems? After you have made a resonable effort,
//here is a solution: https://vimeo.com/567653434