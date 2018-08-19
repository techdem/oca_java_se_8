package assignments;

import java.awt.Dimension;

class ReferenceTest2 {
    public static void main(String[] args) {
        Dimension d=  new Dimension(5,10);
        ReferenceTest2 rt = new ReferenceTest2();
        System.out.println("Before, d.height: " + d.height);
        rt.modify(d);
        System.out.println("After, d.height: " + d.height);
    }
    void modify(Dimension dim) {
        dim.height = dim.height + 1;
        System.out.println("dim = " + dim.height);
    }
}
