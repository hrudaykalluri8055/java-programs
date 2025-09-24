class A{
    String name;
    int age;
}
class B{
    public static void main(String[] args) {
        A s1 = new A();  // className refarencevariable = new className();
        s1.name = "Hruday";
        s1.age = 21;
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}
