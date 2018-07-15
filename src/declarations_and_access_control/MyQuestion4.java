public class MyQuestion4 {
  public static int i = 1;
  public static void main(String[] args) {
    do {
      i--;
      System.out.println("looping");
    } while(Calculator.thisIsEasy(++i) <= 9);
  }
}
class Calculator {
  static int thisIsEasy(int j) {
    System.out.println("before loop i: " + MyQuestion4.i);
    System.out.println("before loop j: " + j);
    for(; j < MyQuestion4.i++;) {
      System.out.println("loop doesn't run " + j);
      ++j;
    }
    System.out.println("after loop i: " + MyQuestion4.i);
    System.out.println("after loop j: " + j);
    return j--;
  }
}
