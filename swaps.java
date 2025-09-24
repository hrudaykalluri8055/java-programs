class swap{
    public static void main(String[] args) {
        int a=10;
        int b=5;
        a=a+b-(b=a);
        System.err.println(a+" "+b);
    }
}