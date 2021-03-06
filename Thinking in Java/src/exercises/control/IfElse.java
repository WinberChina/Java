package exercises.control;

import print.Print;
//: control/IfElse.java

public class IfElse {
  static int result = 0;
  static void test(int testval, int target) {
    if(testval > target)
      result = +1;
    else if(testval < target)
      result = -1;
    else
      result = 0; // Match
  }
  public static void main(String[] args) {
    test(10, 5);
    Print.print(String.valueOf(result));
    test(5, 10);
    Print.print(String.valueOf(result));
    test(5, 5);
    Print.print(String.valueOf(result));
  }
} /* Output:
1
-1
0
*///:~
