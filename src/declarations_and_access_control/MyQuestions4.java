public class MyQuestion4 {
  public static int i;
  public static void main(String[] args) {
    do {
      i--;
      System.out.println("looping");
    } while(Calculator.thisIsEasy(++i) < 10);
  }
}
class Calculator {
  static int thisIsEasy(int j) {
    for(; j < MyQuestions.i++;) {
      ++j;
    }
    return --j;
  }
}
