class A {
    int a = 10;
}

class B extends A {
    public static void main(String args[]) {
        int b = 20;
        B obj = new B();     // create object of child class
        int c = obj.a + b;   // accessing 'a' from parent
        System.out.println("Sum = " + c);
    }
}
