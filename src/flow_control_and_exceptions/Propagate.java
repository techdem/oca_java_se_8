package flow_control_and_exceptions;

public class Propagate {

    public static void main(String[] args) {

        try {

            System.out.println(reverse("reverseMe"));   // no exception
            System.out.println(reverse(""));            // exception
        }
        catch(WhatAreYouDoingException e) {

            System.out.println("really?");  // thrown exception caught
        }
        finally {

            System.out.println("And everything goes back to the beginning..."); // always executes
        }
    }

    static String reverse(String s) throws WhatAreYouDoingException {   // checked exceptions must be declared

        String reverseStr = "";

        if(s.length() == 0) {

            throw new WhatAreYouDoingException();   // passed to the next method in the call stack
        }

        for(int i = s.length()-1; i >=0; --i) {

            reverseStr += s.charAt(i);
        }

        return reverseStr;
    }

}

class WhatAreYouDoingException extends Throwable {}     // exceptions and errors are subclasses of Throwable
