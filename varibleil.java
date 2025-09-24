class instance{
    int a = 10;//out the method
    public static void main(String[] args) {
        instance s = new instance(); // class name refarence varible = new class name();
        int b=2;
       int c=s.a+b;
        System.out.print("instance varible: " + c);
    }
}