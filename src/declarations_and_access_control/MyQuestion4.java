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
        for(; j < MyQuestion4.i++;) {
            ++j;
        }
        return --j;
    }
}
