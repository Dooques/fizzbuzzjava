import java.util.*;

public class FizzBuzz {
  public static void main(String[] args) {
    System.out.println(fizzbuzz(100));
  }

  public static ArrayList fizzbuzz(int n) 
  {
    // Write your code here
    ArrayList<Object> fizzbuzzList = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      fizzbuzzList.add(String.valueOf(i));
    }
    for (Object item : fizzbuzzList) {
      int itemIndex = fizzbuzzList.indexOf(item);
      int itemInt = Integer.valueOf(item.toString());
      String itemStr = item.toString();
      if (itemInt % 3 == 0 && 
      itemInt % 5 == 0 && !itemStr.equals(1) && !itemStr.equals(0)) {
        fizzbuzzList.set(itemIndex, "FizzBuzz");
      } else if (itemInt % 3 == 0) {
        fizzbuzzList.set(itemIndex, "Fizz");
      } else if (itemInt % 5 == 0) {
        fizzbuzzList.set(itemIndex, "Buzz");
      }
      
    }
    return fizzbuzzList;
  }
}
