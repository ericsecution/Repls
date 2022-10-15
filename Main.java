class Main {
  public static void main(String[] args) {

  int result = sumOdds();

  System.out.println("Final Result =  " + result);
  }

/*
Exercise 26: sumOdds
Create an integer method that takes in no arguments or parameters. Return the sum of the odd integers between 1 and 100 inclusive.
  */
// sumOdds() →  2500


public static int sumOdds() {
int sum = 0;

  for (int i =0; i < 100; i++) {
   if (i % 2 == 1) {
     System.out.println("");
          System.out.println("sum: " + sum + " + ");
     System.out.println("-> " + "i: " + i);
     
    sum += i;
     System.out.println("============");
System.out.println("Running Total = " + sum);
     System.out.println("");
    } 
  }
  return sum;


}

}