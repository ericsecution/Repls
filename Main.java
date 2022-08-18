class Main {
  public static void main(String[] args) {

    int a = 5;
    int b = 7;
    int c = 21;

    boolean result = lessBy10(a, b, c);

    System.out.println(result);

    a = 5; b = 7; c = -1;
    result = lessBy10(a, b, c);
    System.out.println(result);
  }

  /*
   * Exercise 14: lessBy10 Create a boolean method called lessBy10 that take in
   * three integers, “a, “b”, and “c”. Given three ints, a b c, return true if one
   * of them is 10 or more different than one of the others. lessBy10(1, 7, 11) →
   * true lessBy10(1, 7, 10) → false lessBy10(11, 1, 7) → true
   */

public static boolean lessBy10(int a, int b, int c) {
  boolean tenOrMore = false;

  // I want to create some instance variables here to use in scope
  // so that I can compare "a -b", "a-c" & "b - c" 
  // and put them into an array to for-loop thru
  // Then, I just need to check for both +10 & -10
  // and that should cover every possible combo
  int x = a-b;
  int y = a-c;
  int z = b-c;

  int[] differenceArray = new int[]{x, y, z};
  for (int i = 0; i < differenceArray.length; i++) {
    if(differenceArray[i] >= 10 || differenceArray[i] <= -10) {
      tenOrMore = true;
    }
}
  
  return tenOrMore;
  
}

}

// Having trouble solving the problems? After you have made a resonable effort,
// here is a solution: https://vimeo.com/571850994