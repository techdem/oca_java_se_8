package exercises;

interface SuperInterface {
    static int staticNumber = 1;
    int instanceNumber = 2;

    static void staticMethod() { System.out.println("super interface static  method"); }
    default void instanceMethod() { System.out.println("super instance super method"); };
}

interface SubInterface extends SuperInterface {
    static int staticNumber = 3;
    int instanceNumber = 4;

    static void staticMethod() { System.out.println("sub interface static  method"); }
    default void instanceMethod() { System.out.println("sub instance super method"); };
}

class SuperClass implements SuperInterface {
    static int staticNumber = 5;
    int instanceNumber = 6;

    static void staticMethod() {
        System.out.println("super class static method");
    }
    public void instanceMethod() {
        System.out.println("super class instance method");
    }
}

class SubClass extends SuperClass implements SubInterface {
    static int staticNumber = 7;
    int instanceNumber = 8;

    static void staticMethod() {
        System.out.println("sub class static method");
    }
    public void instanceMethod() {
        System.out.println("sub class instance method");
    }
}

public class InstanceMethods {
    public static void main(String[] args) {
        //SuperInterface superInterface = new SuperInterface(); // cannot instantiate abstract
        SuperInterface superInterfaceSuperClass = new SuperClass();
        SuperInterface superInterfaceSubClass = new SubClass();
        //SubInterface subInterfaceSuperClass = new SuperClass(); // SuperClass is not a SubInterface
        SubInterface subInterfaceSubClass = new SubClass();

        SuperClass superClassSuperClass = new SuperClass();
        SuperClass superClassSubClass = new SubClass();
        //SubClass subClassSuperClass = new SuperClass(); // SuperClass is not a SubClass
        SubClass subClassSubClass = new SubClass();

        System.out.println(superInterfaceSuperClass.staticNumber);
        System.out.println(superInterfaceSuperClass.instanceNumber);
        //superInterfaceSuperClass.staticMethod(); // cannot invoke interface static method through instance variable
        SuperClass.staticMethod();
        superInterfaceSuperClass.instanceMethod();

        System.out.println(superInterfaceSubClass.staticNumber);
        System.out.println(superInterfaceSubClass.instanceNumber);
        //superInterfaceSubClass.staticMethod(); // cannot invoke interface static method through instance variable
        superInterfaceSubClass.instanceMethod();

        System.out.println(subInterfaceSubClass.staticNumber);
        System.out.println(subInterfaceSubClass.instanceNumber);
        //subInterfaceSubClass.staticMethod(); // cannot invoke interface static method through instance variable
        superInterfaceSubClass.instanceMethod();

        System.out.println(superClassSuperClass.staticNumber);
        System.out.println(superClassSuperClass.instanceNumber);
        superClassSuperClass.staticMethod();
        superClassSuperClass.instanceMethod();

        System.out.println(superClassSubClass.staticNumber);
        System.out.println(superClassSubClass.instanceNumber);
        superClassSubClass.staticMethod();
        superClassSubClass.instanceMethod();

        System.out.println(subClassSubClass.staticNumber);
        System.out.println(subClassSubClass.instanceNumber);
        subClassSubClass.staticMethod();
        subClassSubClass.instanceMethod();
    }
}
