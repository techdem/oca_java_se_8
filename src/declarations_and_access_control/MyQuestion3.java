abstract interface Rememberable {
  public static void main(String[] args) {
    System.out.println("Remember me?");
  }
  default Rememberable rememberable() {
    return new MyQuestion3();
  }
}
public class MyQuestion3 implements Rememberable { 
  public MyQuestion3() {
    super();
    Rememberable.main(new String[]{"How are things?"});
  }
  public static void main(String[] args) {
    Rememberable rememberable = new MyQuestion3();
    rememberable = rememberable.rememberable();
  }
}
