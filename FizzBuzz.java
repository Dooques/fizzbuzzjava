import java.util.*;

public class FizzBuzz {
  public static void main(String[] args) {
    System.out.println(fizzbuzz(16));
  }

  public static ArrayList fizzbuzz(int n) 
  {
    // Write your code here
    ArrayList<String> fizzbuzzList = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      if (
        i % 3 == 0 && 
        i % 5 == 0 && 
        i != 1 && i != 0
      ) {
        fizzbuzzList.add("FizzBuzz");
      } else if (i % 3 == 0) {
        fizzbuzzList.add("Fizz");
      } else if (i % 5 == 0) {
        fizzbuzzList.add("Buzz");
      } else {
        fizzbuzzList.add(String.valueOf(i));
      }
    }
    return fizzbuzzList;
  }
}
