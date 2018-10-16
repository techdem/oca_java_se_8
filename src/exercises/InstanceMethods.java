package exercises;

interface SuperInterface {
    public final static int interfaceNumber = 1;

    static void staticMethod() { System.out.println("super interface static  method"); }
    default void instanceMethod() { System.out.println("super interface instance method"); };
}

interface SubInterface {
    public final static int staticNumber = 2;

    static void staticMethod() { System.out.println("sub interface static  method"); }
    default void instanceMethod() { System.out.println("sub interface instance method"); };
}

class SuperClass implements SuperInterface {
    static int staticNumber = 3;
    int instanceNumber = 4;

    static void staticMethod() {
        System.out.println("super class static method");
    }
    public void instanceMethod() {
        System.out.println("super class instance method");
    }
}

class SubClass extends SuperClass {
    static int staticNumber = 5;
    int instanceNumber = 6;

    static void staticMethod() {
        System.out.println("sub class static method");
    }
    public void instanceMethod() {
        System.out.println("sub class instance method");
    }
}

public class InstanceMethods implements SuperInterface, SubInterface {
    public static void main(String[] args) {
        //SuperInterface superInterface = new SuperInterface(); // cannot instantiate abstract
        SuperInterface superInterfaceSuperClass = new SuperClass();
        SuperInterface superInterfaceSubClass = new SubClass();
        //SubInterface subInterfaceSuperClass = new SuperClass(); // SuperClass is not a SubInterface
        //SubInterface subInterfaceSubClass = new SubClass(); // SubClass is not a SubInterface

        SuperClass superClassSuperClass = new SuperClass();
        SuperClass superClassSubClass = new SubClass();
        //SubClass subClassSuperClass = new SuperClass(); // SuperClass is not a SubClass
        SubClass subClassSubClass = new SubClass();

        System.out.println("super interface reference / super class object");
        System.out.println(superInterfaceSuperClass.interfaceNumber);
        //superInterfaceSuperClass.staticMethod(); // cannot invoke interface static method through instance variable
        superInterfaceSuperClass.instanceMethod();
        System.out.println("\ndirect: ");
        System.out.println(SuperClass.staticNumber);
        SuperClass.staticMethod();

        System.out.println("\nsuper interface reference / sub class object");
        System.out.println(superInterfaceSubClass.interfaceNumber);
        //superInterfaceSubClass.staticMethod(); // cannot invoke interface static method through instance variable
        superInterfaceSubClass.instanceMethod();
        System.out.println("\ndirect: ");
        System.out.println(SubClass.staticNumber);
        SubClass.staticMethod();

        System.out.println("\nsuper class reference / super class object");
        System.out.println(superClassSuperClass.staticNumber);
        System.out.println(superClassSuperClass.instanceNumber);
        superClassSuperClass.staticMethod();
        superClassSuperClass.instanceMethod();

        System.out.println("\nsuper class reference / sub class object");
        System.out.println(superClassSubClass.staticNumber);
        System.out.println(superClassSubClass.instanceNumber);
        superClassSubClass.staticMethod();
        superClassSubClass.instanceMethod();

        System.out.println("\nsub class reference / sub class object");
        System.out.println(subClassSubClass.staticNumber);
        System.out.println(subClassSubClass.instanceNumber);
        subClassSubClass.staticMethod();
        subClassSubClass.instanceMethod();

        System.out.println("\ninterface direct: ");
        SuperInterface.staticMethod();
        System.out.println(SuperInterface.interfaceNumber);
        SubInterface.staticMethod();
        System.out.println(SubInterface.staticNumber);


        System.out.println("\ninterface overridden: ");
        new InstanceMethods().instanceMethod();
    }

    public void instanceMethod() { System.out.println("overridden instanceMethod"); SuperInterface.super.instanceMethod(); SubInterface.super.instanceMethod(); }
}

//super interface reference / super class object
//        1
//        super class instance method
//
//    direct:
//        3
//        super class static method
//
//super interface reference / sub class object
//        1
//        sub class instance method
//
//    direct:
//        5
//        sub class static method
//
//super class reference / super class object
//        3
//        4
//        super class static method
//        super class instance method
//
//super class reference / sub class object
//        3
//        4
//        super class static method
//        sub class instance method
//
//sub class reference / sub class object
//        5
//        6
//        sub class static method
//        sub class instance method
//
//interface direct:
//        super interface static  method
//        1
//        sub interface static  method
//        2
//
//interface overridden:
//        overridden instanceMethod
//        super interface instance method
//        sub interface instance method
//
//        Process finished with exit code 0
