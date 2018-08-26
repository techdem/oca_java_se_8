package flow_control_and_exceptions;

public class Switch {

    public static void main(String[] args) {

        String s = "xyz";

        switch(s.length()) {
            case 1:
                System.out.println("length is one");
                break;
            case 2:
                System.out.println("length is two");
                break;
            case 3:
                System.out.println("length is three");
                break;
            default:
                System.out.println("no match");
        }

        int x = 3;

        switch(x) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10: { System.out.println("x is even"); break; }
            default: System.out.println("x is an odd number");
        }

        x = 7;

        switch(x) {
            case 2: System.out.println("2");
            default: System.out.println("default");
            case 3: System.out.println("3");
            case 4: System.out.println("4");
        }
    }
}
